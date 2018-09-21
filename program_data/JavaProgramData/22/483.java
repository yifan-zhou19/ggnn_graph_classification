package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char k;
		int a;
		int b;
		int x;
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a;
		for (i = 1;i < 300;i++)
		{
			if ((k = System.in.read()) != ',')
			{
				break;
			}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		if (x > a)
		{
			b = a;
			a = x;
		}
		if (x > b & x < a)
		{
			b = x;
		}
		if (a == b & x < b)
		{
			b = x;
		}
		}
		if (a == b)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",b);
		}
	}
}

