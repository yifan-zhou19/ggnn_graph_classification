package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int c;
		int days;
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		days = 0;
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		{
			m[2] = 29;
		for (i = 0;i < b;i++)
		{
			days += m[i];
		}
		System.out.printf("%d\n",days + c);
		}
		else
		{
			for (i = 0;i < b;i++)
			{
				days += m[i];
			}
			System.out.printf("%d\n",days + c);
		}
		return 0;
	}

}

