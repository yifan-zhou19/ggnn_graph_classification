package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] a = new int[3];
		int i;
		int j;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		if (m % 3 == 0)
		{
			a[0] = 3;
		}
		if (m % 5 == 0)
		{
			a[1] = 5;
		}
		if (m % 7 == 0)
		{
			a[2] = 7;
		}
		for (i = 0;i < 2;i++)
		{
			if (a[i] > 0)
			{
			for (j = i + 1;j < 3;j++)
			{
				if (a[j] > 0)
				{
			p = 1;
				}
			}
			if (p == 1)
			{
			 System.out.printf("%d ",a[i]);
			}
			else if (p == 0)
			{
				System.out.printf("%d",a[i]);
			}
			}
			p = 0;
		}
		if (a[2] > 0)
		{
			System.out.printf("%d",7);
		}
		if (m % 3 != 0 && m % 5 != 0 && m % 7 != 0)
		{
			System.out.print("n");
		}
		return 0;
	}
}

