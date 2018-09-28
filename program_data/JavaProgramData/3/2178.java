package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int b;
		int i;
		int n;
		int k;
		int j;
		int s;
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
		for (i = 0;i < n;i++)
		{
			s = a[i];
			for (j = i + 1;j < n;j++)
			{
				s = a[i] + a[j];
				if (s == k)
				{
					b = 1;
				}
				else
				{
					continue;
				}
			}
		}
		if (b == 1)
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

