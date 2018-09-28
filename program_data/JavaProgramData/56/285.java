package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	static
	{
		int n;
		int m;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n;
		m = 0;
		while (a != 0)
		{
			b = a % 10;
			a = a / 10;
			m = m * 10 + b;
		}
			System.out.printf("%d",m);
	}
}

