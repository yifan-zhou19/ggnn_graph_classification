package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d = 0;
		int[] x = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int[] y = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		int i;
		if ((a % 4 == 0 && a % 100 != 0) || (a % 100 == 0 && a % 400 == 0))
		{
			for (i = 1;i < b;i++)
			{
				d = d + y[i];
			}
			System.out.printf("%d",d + c);
		}
		else
		{
			for (i = 1;i < b;i++)
			{
				d = d + x[i];
			}
			System.out.printf("%d",d + c);
		}
		return 0;
	}



}

