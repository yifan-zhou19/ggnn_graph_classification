package <missing>;

public class GlobalMembers
{
	public static int run(int q)
	{
		if (q % 3200 == 0)
		{
			return 0;
		}
		else if (q % 400 != 0 && q % 100 == 0)
		{
			return 0;
		}
		else if (q % 4 == 0)
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
		int i;
		int j;
		int year;
		int a;
		int b;
		int n;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			year = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			b = Integer.parseInt(tempVar4);
		}
		int[] month = new int[13];
		month[2] = 28 + run(year);
		month[1] = 31;
		month[3] = 31;
		month[5] = 31;
		month[7] = 31;
		month[8] = 31;
		month[10] = 31;
		month[12] = 31;
		month[4] = 30;
		month[6] = 30;
		month[9] = 30;
		month[11] = 30;
		if (a > b)
		{
			j = b;
			b = a;
			a = j;
		}
		x = 0;
		for (j = a;j < b;j++)
		{
			x += month[j];
		}
		if (x % 7 == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
		}
		return 0;
	}

}

