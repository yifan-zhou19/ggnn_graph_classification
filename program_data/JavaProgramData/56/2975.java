package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static nixu(int n)
	{
	int m;
	m = n % 10;
		System.out.printf("%d",m);
		m = n / 10;
	if (m < 1)
	{
		;
	}
	else
	{
		m = nixu(m);
	}
		return m;
	}

	public static void Main()
	{
	int n;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	nixu(n);

	}
}

