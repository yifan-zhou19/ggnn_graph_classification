package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] a = new int[1000];
		int i;
		int j;
		int n;
		int t;
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
		for (i = 0,t = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i] + a[j] == k)
				{
					break;
				}
			}
			if (j != n && i != j)
			{
				t++;
			}
		}
		if (t > 0)
		{
		System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}

		 return 0;
	}

}

