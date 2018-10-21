package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		int j;
		int k = 0;
		int p;
		int q;
		int l = 0;
		int[] a = new int[10000];
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
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < 10000;j++)
			{
				if (j <= y - 1 && j >= x)
				{
					a[j] = 1;
				}
			}
		}
		for (j = 0;j < 10000;j++)
		{
			if (a[j] == 1)
			{
				k++;
				if (k == 1)
				{
					p = j;
				}
				if (a[j + 1] == 0)
				{
					q = j;
					l++;
					break;
				}
			}
		}
		for (j = q + 1;j < 10000;j++)
		{
			if (a[j] == 1)
			{
				l++;
			}
		}
		if (l == 1)
		{
			System.out.printf("%d %d",p,q + 1);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

