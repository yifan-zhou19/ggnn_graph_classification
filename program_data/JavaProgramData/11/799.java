package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		if ((x % 100 != 0 && x % 4 == 0) || (x % 100 == 0 && x % 400 == 0))
		{
		return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int y;
		int m;
		int d;
		int a;
		int b;
		int c;
		int amount = 0;
		int[] p = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (m > 2)
		{
			   a = f(y);
			   if (a == 1)
			   {
				   p[1] = p[1] + 1;
			   }
			   for (int i = 0;i < m - 1;i++)
			   {
						amount = amount + p[i];
			   }
						amount = amount + d;
		}
		else if (m == 1)
		{
			amount = d;
		}
		else if (m == 2)
		{
			amount = 31 + d;
		}
		System.out.printf("%d",amount);
		System.in.read();
		System.in.read();
		System.in.read();
	}


}

