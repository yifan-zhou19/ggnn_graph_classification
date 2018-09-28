package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int[] a = new int[1000];
		int b;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			q = 0;
			for (j = 0;j < n - i - 1;j++)
			{
			b = a[i] + a[j + 1];
			if (b == k)
			{
				System.out.print("yes\n");
				q++;
				return 0;
			}
			else
			{
				q = -1;
			}
			}
		}
		if (q == -1)
		{
			System.out.print("no\n");
		}
		return 0;
	}



}

