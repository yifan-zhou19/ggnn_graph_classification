package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int e = 0;
		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		e = a % 7 + a / 4 - a / 100 + a / 400;
		for (i = 1;i < b;i++)
		{
			e = e + days[i];
		}
			e = e + c - 1;

		if ((a % 4 == 0 && a % 100 != 0 || a % 400 == 0) && (b <= 2))
		{
			e--;
		}
		 t = e % 7;
		if (t == 0)
		{
			System.out.print("Sun.\n");
		}
	else if (t == 1)
	{
			System.out.print("Mon.\n");
	}
	else if (t == 2)
	{
			System.out.print("Tue.\n");
	}
	else if (t == 3)
	{
			System.out.print("Wed.\n");
	}
	else if (t == 4)
	{
			System.out.print("Thu.\n");
	}
	else if (t == 5)
	{
			System.out.print("Fri.\n");
	}
	else if (t == 6)
	{
			System.out.print("Sat.\n");
	}




		return 0;
	}


}

