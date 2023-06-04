import java.util.ArrayList;

public class Repository<T> {
	
	private ArrayList<T> repo;
	
	public Repository() {
		repo = new ArrayList<T>();
	}

	public Repository(ArrayList<T> arrayList) {
		repo = arrayList;
	}
	
	public void Add(T item) {
		repo.add(item);
	}
	
	public void Remove(int index) {
		if (index > repo.size() || index < 0 || repo.size() == 0) {
			System.out.print("wrong index");
		} 
		else {
			repo.remove(repo.get(index)); 
		}
	}
	
	public void Edit(int index, T item) {
		if (index > repo.size() || index < 0 || repo.size() == 0) {
			System.out.print("wrong index");
			return;
		}
		repo.set(index, item); 
	}
	
	public T GetItem(int index) {
		if (index > repo.size() || index < 0 || repo.size() == 0) {
			System.out.print("wrong index");
			return null;
		}
		return repo.get(index);
	}
	
	public ArrayList<T> GetArrayList() {
		return repo;
	}
	
	public int GetSize() {
		return repo.size();
	}
	
}

