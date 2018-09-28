package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int ylf = 0;
		int[] a = new int[1000];
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
		i = 0;
		while (i < n && ylf == 0)
		{
			j = i + 1;
			while (j < n && ylf == 0)
			{
				if (a[i] + a[j] == k)
				{
					System.out.print("yes");
					ylf = 1;
				}
				else
				{
					j++;
				}
			}
			i++;
		}
		if (ylf == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

