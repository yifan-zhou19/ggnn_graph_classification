package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int t;
		int j;
		int n;
		int[] a = new int[201];
		int[] b = new int[201];
		int c = 0;
		int f = 0;
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
		for (j = 0;j < n;j++)
		{
			if (a[j] == 0 && b[j] == 1)
			{
				c = c + 1;
			}
			else if (a[j] == 1 && b[j] == 2)
			{
				c = c + 1;
			}
			else if (a[j] == 2 && b[j] == 0)
			{
				c = c + 1;
			}
			else if (a[j] == 1 && b[j] == 0)
			{
				f = f + 1;
			}
			else if (a[j] == 2 && b[j] == 1)
			{
				f = f + 1;
			}
			else if (a[j] == 0 && b[j] == 2)
			{
				f = f + 1;
			}
		}
		if (f > c)
		{
			System.out.print("B");
			return 0;
		}
		else if (c > f)
		{
			System.out.print("A");
			return 0;
		}
		System.out.print("Tie");
		return 0;
	}

}

