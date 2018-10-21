package <missing>;

public class GlobalMembers
{
	public static int day(int n,int y)
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int d = 0;
		for (i = 0;i < n - 1;i++)
		{
				d += a[i];
			if (i == 1 && ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0))
			{
				d += 1;
			}
		}
		return (d);
	}
	public static void Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Integer.parseInt(tempVar4);
			}
			if ((day(b, a) - day(c, a)) % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}

}

