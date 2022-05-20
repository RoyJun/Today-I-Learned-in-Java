package exam03_multi_type_parameter;

public class Product<T,M> {
	private T king;
	private M model;
	
	public T getKing() {
		return king;
	}
	public void setKing(T king) {
		this.king = king;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}
