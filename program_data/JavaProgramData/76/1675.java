package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] c = new int[10000];
		int i;
		int j;
		int shi;
		int zhong;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < 10000;i++)
		{
			c[i] = 0;
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
				c[j] = 1;
			}
		}
		for (i = 0;i < 10000;i++)
		{
			if (c[i] == 1)
			{
				shi = i;
				break;
			}
		}
		for (i = shi;i < 10000;i++)
		{
			if (c[i] == 0)
			{
				zhong = i;
				break;
			}
		}
		for (i = zhong;i < 10000;i++)
		{
			if (c[i] == 1)
			{
				j = 1;
				break;
			}
		}
		if (j == 1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",shi,zhong);
		}
		return 0;
	}

}

