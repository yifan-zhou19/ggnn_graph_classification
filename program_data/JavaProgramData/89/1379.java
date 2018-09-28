package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p;
		int q;
		j = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[10000];
		for (i = 0;i < 10000;i++)
		{
			a[i] = 0;
		}
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				q = Integer.parseInt(tempVar3);
			}
			if (p == 0 && q == 0)
			{
				break;
			}
			a[p] = a[p] - 1;
			a[q] = a[q] + 1;
		} while (p != 0 || q != 0);
		for (i = 0;i < n;i++)
		{
			if (a[i] == n - 1)
			{
				System.out.printf("%d",i);
				j = i;
			}
		}
		if (j == -1)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}

}

