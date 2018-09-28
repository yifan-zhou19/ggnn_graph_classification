package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j = 0;
		int k;
		int dot = 0;
		int min = 29999;
		int l;
		int[] a = new int[500];
		int[] b = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < N;i++)
		{
			if (a[i] % 2 == 0)
			{
				continue;
			}
			else
			{
				b[j] = a[i];
				j++;
			}
		}
		for (k = 0;k < j;k++)
		{
			for (i = 0;i < j;i++)
			{
				if (b[i] < min)
				{
					min = b[i];
				}
				else
				{
					continue;
				}
			}
			if (dot != 0)
			{
				System.out.print(",");
			}
			System.out.printf("%d",min);
			dot++;
			for (l = 0;l < j;l++)
			{
				if (b[l] == min)
				{
					b[l] = 29999;
					break;
				}
			}
			min = 29999;
		}
		System.out.print("\n");
		return 0;
	}

}

