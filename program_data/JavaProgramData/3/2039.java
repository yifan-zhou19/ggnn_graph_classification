package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int s = 0;
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

		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			if (i != 0)
			{
				for (j = 0;j < i;j++)
				{
					if (k == (a[j] + a[i]))
					{
						s = 1;
					}
				}
			}
		}

		if (s == 1)
		{
			System.out.print("yes");
		}
		if (s != 1)
		{
			System.out.print("no");
		}

		return 0;

	}

}

