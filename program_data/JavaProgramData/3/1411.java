package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[1000];


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (int j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[j] = Integer.parseInt(tempVar3);
			}
		}

		for (int e = 0;e <= n;e++)
		{
			for (int i = e+1;i < n;i++)
			{
				if (a[e] + a[i] == k)
				{
				System.out.print("yes");
				e = n + 1;
				i = n;
				}
			}
			if (e == n)
			{
				System.out.print("no");
			}
		}


		return 0;





	}
}

