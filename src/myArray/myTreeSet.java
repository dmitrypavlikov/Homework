package myArray;

public class myTreeSet {
    private myArray body;
    public void add(int value){
        if(!this.contains(value)) {
            body.add(value);
            body.sort();
        }
        else{
            for(int i = 0; i < body.size(); i++){
                if(body.get(i)==value){
                    body.set(value,i);
                }
            }
        }
    }
    public boolean contains(int value){
        return body.contains(value);
    }
    public void delete(int value){
        for(int i = 0; i < body.size(); i++){
            if(body.get(i) == value){
                body.delete(i);
            }
        }
    }
    public boolean isEmpty(){
        return body.isEmpty();
    }
}
