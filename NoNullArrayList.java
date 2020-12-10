import java.util.ArrayList;
import java.lang.IllegalArgumentException;

public class NoNullArrayList<T> extends ArrayList<T> {
	public T set(int index, T value){
		if (value == null){
			throw new IllegalArgumentException("Null cannot be an argument.");
		}
		return super.set(index, value);
	}
}
