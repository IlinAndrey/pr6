package ru.mirea.pr6;

public class IDNumber {

    private Student[] n;
    private int size;

    public IDNumber(int capacity){
        this.n = new Student[capacity];
        size = 0;
    }

    public void sort(){
        for (int left = 0; left < n.length; left++ ){
            Student value = n[left];
            int i = left - 1;
            for(; i >= 0; i-- ){
                if (value.getId()<n[i].getId()){
                    n[i+1] = n[i];
                }else{
                    break;
                }
            }
            n[i+1] = value;
        }
    }
    public void add(Student student){
        n[size] = student;
        size++;
    }

    public Student[] getUni() {
        return n;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder("[ ");
        for(int i = 0; i < size; i++){
            out.append(n[i].getName()).append("(id=").append(n[i].getId()).append(")");
            if (i != size - 1) {
                out.append(", ");
            }
        }
        out.append("]");
        return out.toString();
    }
}
