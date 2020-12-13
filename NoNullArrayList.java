import java.util.ArrayList;
import java.lang.IllegalArgumentException;

public class NoNullArrayList<T> extends ArrayList<T> {
	public T set(int index, T value){
		if (value == null){
			throw new IllegalArgumentException("Null cannot be an argument.");
		}
		return super.set(index, value);
	}
	
	public void add(int index, T value){
		if (value == null){
			throw new IllegalArgumentException("Null cannot be an argument.");
		}
		super.add(index, value);
	}

	public boolean add(T value){
		if (value == null){
			throw new IllegalArgumentException("Null cannot be an argument.");
		}
		return super.add(value);
	}
}
