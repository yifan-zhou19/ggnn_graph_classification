package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int i;
		int n;
		int j;
		int k;
		int p;
		int q;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			a[k] = 0;
			b[k] = 0;
		}

		for (q = 0;;q++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			if (i == 0 && j == 0)
			{
				break;
			}
			else
			{
				a[i]++;
				b[j]++;
			}
		}
		for (p = 0;p < n;p++)
		{
			if ((a[p] == 0) && (b[p] == n - 1))
			{
				flag = 1;
				System.out.printf("%d\n",p);
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;

	}
}

