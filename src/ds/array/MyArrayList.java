package ds.array;

public class MyArrayList {

	Object[] data;
	int actSize = 0;
	
	public MyArrayList() {
		data = new Object[4];
	}
	
	void add(Object o) {
		if(data.length-actSize <= 1)
			increaseArrayListSize();
		
		data[actSize] = o;
		actSize += 1;
	}
	
	void remove(int index) {
		if(index < actSize) {
			data[index] = null;
			
			while(index<actSize-1) {
				data[index] = data[index+1];
				index++;
			}
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	Object search(int index) {
		if(index<data.length)
			return data[index];
		else
			throw new ArrayIndexOutOfBoundsException();
	}
	
	void increaseArrayListSize() {
		Object[] newData = new Object[this.data.length * 2];
		for (int i=0; i<data.length; i++)
			newData[i] = data[i];
		
		this.data = newData;		
	}
	
	int size() {
		return actSize;
	}
	
	public static void main(String args[]) {
		MyArrayList list = new MyArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		
		System.out.println(list.size());
		
		list.add("h");
		list.add("i");
		list.add("j");
		
		System.out.println(list.search(5));
		System.out.println(list.size());
		list.remove(4);

		System.out.println(list.search(5));
		System.out.println(list.size());

	}
}
