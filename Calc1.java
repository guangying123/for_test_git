package junit;

public enum Calc1 
{
	
	Mother(1),
	
	Father(),
	
	Sister(),
	
	brother(),
	
	Me(5);
	
	private Integer value;
	private String name;
	
	
	public int getValue()
	{
		return value;
	}
	
	Calc1(int value)
	{
		this.value = value;
	}
	
	Calc1()
	{
		this.value = this.ordinal();
	}
}
