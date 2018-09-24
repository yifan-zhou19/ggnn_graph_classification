package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int max;
		int tran;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		max = a[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		int[] F = new int[max + 3];
		F[0] = 1;
		F[1] = 1;
		for (i = 0;i < max;i++)
		{
			F[i + 2] = F[i] + F[i + 1];
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",F[a[i] - 1]);
		}
		return 0;
	}

}

