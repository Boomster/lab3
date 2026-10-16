package ru.oleynikov.node;

public class Node {
    private int value;
    private Node parent;
    private Node leftchild;
    private Node rightchild;
    private boolean initialized;

    public Node(){
        this.initialized = false;
    }

    private Node(int value, Node parent){
        this.value = value;
        this.parent = parent;
        this.initialized = true;
    }

    public void addValue(int value){
        if(!this.initialized){
            this.initialized = true;
            this.value = value;
        } else {
            if (value > this.value){
                if (this.rightchild == null){
                    this.rightchild = new Node(value, this);
                } else this.rightchild.addValue(value);
            } else {
                if (this.leftchild == null){
                    this.leftchild = new Node(value, this);
                } else this.leftchild.addValue(value);
            }
        }
    }

    private int getDeleteMaxLeft(){
        if (this.rightchild != null){
            return this.rightchild.getDeleteMaxRight();
        } else {
            this.parent.leftchild = this.leftchild;//deletion
            if(this.leftchild != null) this.leftchild.parent = this.parent;

            return this.value;
        }
    }

    private int getDeleteMaxRight(){
        if (this.rightchild != null){
            return this.rightchild.getDeleteMaxRight();
        } else {
            this.parent.rightchild = this.leftchild;//deletion
            if(this.leftchild != null) this.leftchild.parent = this.parent;

            return this.value;
        }
    }

    public void deleteValue(int value){
        if (!this.initialized){
            System.out.println("Nodes are empty, nothing to delete");
        } else if (this.value == value) {
            if (this.leftchild == null && this.rightchild == null){//if leaf
               if (this.parent != null){
                   if (value > this.parent.value){
                       this.parent.rightchild = null;
                   } else this.parent.leftchild = null;
               } else {
                   this.value = 0;
                   this.initialized = false;
               }
            } else if (this.leftchild == null) {//if 1 child right
                this.value = this.rightchild.value;
                Node tmpchild = this.rightchild;
                this.leftchild = tmpchild.leftchild;
                this.rightchild = tmpchild.rightchild;
                if(this.leftchild != null) this.leftchild.parent = this;
                if(this.rightchild != null) this.rightchild.parent = this;
            } else if (this.rightchild == null) {//if 1 child left
                this.value = this.leftchild.value;
                Node tmpchild = this.leftchild;
                this.leftchild = tmpchild.leftchild;
                this.rightchild = tmpchild.rightchild;
                if(this.leftchild != null) this.leftchild.parent = this;
                if(this.rightchild != null) this.rightchild.parent = this;
            } else { // if 2 child
                this.value = this.leftchild.getDeleteMaxLeft();//самое "правое" слева число
            }
        } else {
            if (value > this.value){
                if (this.rightchild != null) {
                    this.rightchild.deleteValue(value);
                } else {
                    System.out.println("No node with value: " + value);
                }
            } else {
                if (this.leftchild != null) {
                    this.leftchild.deleteValue(value);
                } else {
                    System.out.println("No node with value: " + value);
                }
            }
        }
    }

    public boolean checkValue(int value){
        if (!this.initialized) return false;
        if (this.value == value) return true;
        else if (value > this.value) return this.rightchild != null && this.rightchild.checkValue(value);
        else return this.leftchild != null && this.leftchild.checkValue(value);
    }
    //симметричный?
    @Override
    public String toString(){
        if (!this.initialized) return "null";
        StringBuilder values = new StringBuilder();
        if (this.leftchild != null){
            values.append(this.leftchild.toString());
            values.append(" ");
        }
        values.append(this.value);
        if (this.rightchild != null){
            values.append(" ");
            values.append(this.rightchild.toString());
        }
        return values.toString();
    }
}
