package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int c = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 10000;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] == 0 && b[i] == 0)
			{
				break;
			}
		}
		for (j = 0;j < n;j++)
		{
					c = 0;
			for (k = 0;k < i;k++)
			{
				if (b[k] == j)
				{
					c++;
				}
				if (a[k] == j)
				{
					c--;
				}
			}
			if (c == n - 1)
			{
				System.out.printf("%d",j);
				d = 1;
			}
		}
		if (d == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

