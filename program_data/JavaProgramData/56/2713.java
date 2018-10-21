package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int r = int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	r(n);
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static r(int m)
	{
		System.out.printf("%d",m % 10);
	m = m / 10;
	if (m != 0)
	{
	return r(m);
	}
	}

}

