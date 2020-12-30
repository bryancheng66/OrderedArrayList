public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
	private int positionFinder(T value){
		int position = -1;
		for (int i = 0; i < this.size() && position == -1; i++){
			if (value.compareTo(this.get(i)) < 0){
				position = i;
			}
		}
		if (position == -1){
			position = this.size();
		}
		return position;
	}

	public boolean add(T value){
		if (value == null){
			throw new IllegalArgumentException("Null cannot be an argument.");
		}
		super.add(positionFinder(value), value);
		return true;
	}

	public void add(int index, T value){
		this.add(value);
	}

	public T set(int index, T value){
		if (value == null){
			throw new IllegalArgumentException("Null cannot be an argument.");
		}
		T result = get(index);
		remove(index);
		this.add(value);
		return result;
	}

	public OrderedArrayList(){
		super();
	}

	public OrderedArrayList(int size){	
		super(size);
	}
}
