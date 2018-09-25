package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int[] d = new int[12];
		int sum = 0;
		int i;
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
		for (i = 1; i < b; i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				d[i] = 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				d[i] = 30;
			}
			else
			{
				if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
				{
				d[2] = 29;
				}
				else
				{
					d[2] = 28;
				}
			}
			sum += d[i];
		}
		System.out.printf("%d\n", sum + c);
		return 0;
	}


}

