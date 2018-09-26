package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int t;
		int x;
		int i;
		int j;
		int[] a = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		while (n != 0 && m != 0)
		{
			t = 0;
			for (i = 0;i < n;i++)
			{
				a[i] = 1;
			}
			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < m;)
				{
					j = j + a[(t++) % n];
				}
				a[(t - 1) % n] = 0;
			}
			for (i = 0;i < n;i++)
			{
				if (a[i] != 0)
				{
					System.out.printf("%d\n",i + 1);
				}
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
		}
		return 0;
	}


}

