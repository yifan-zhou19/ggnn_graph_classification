package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		int p;
		int flag = 0;
		int a = -2;
		int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n * n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = Integer.parseInt(tempVar2);
		}
	if (p == 0)
	{
		if (m == 0)
		{
			flag = 1;
			m++;
			a++;
		}
	else if (flag == 1)
	{
		m++;
		a++;
	}
	else
	{
		m++;
	}
	}
	else
	{
		if (flag == 1)
		{
			flag = 0;
		}
	}
	}
	b = m / 2 - a - 2;
	System.out.printf("%d",a * b);
	}

}

