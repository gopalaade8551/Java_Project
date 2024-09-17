package Interface;

public interface Laptop {
	
	public void copy();
	public void paste();
	public void cut();
	public void delete();
	default void security()
	{
		audio();
		commoncode();
		System.out.println("the laptop security code");
	}
	static void audio()
	{
		commoncode();
		System.out.println("laptop audio related code");
	}
	
	private static void commoncode()
	{
		System.out.println("the common code");
	}

}
