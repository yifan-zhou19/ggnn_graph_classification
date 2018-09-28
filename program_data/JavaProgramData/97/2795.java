package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (m >= 100)
		{
			m = m - 100;
			a++;
		}
		while (m >= 50)
		{
			m = m - 50;
			b = 1;
		}
		while (m >= 20)
		{
			m = m - 20;
			c++;
		}
		while (m >= 10)
		{
			m = m - 10;
			d = 1;
		}
		while (m >= 5)
		{
			m = m - 5;
			e = 1;
		}
		while (m >= 1)
		{
			m = m - 1;
			f++;
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
		return 0;
	}
}

