package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
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
		int[] a = new int[1000];
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		int hh = 0;
		int b = 0;
		for (i = 0;i < n;i++)
		{
			int count = 0;
			for (j = i + 1;j < n;j++)
			{
				if (a[i] + a[j] == k)
				{
					System.out.print("yes");
					b = 1;
					break;
				}
				else
				{
					count++;
				}
			}
			if (b == 1)
			{
				break;
			}
			if (count == n - 1 - i)
			{
				hh++;
			}
		}
		if (hh == n)
		{
			System.out.print("no");
		}
		return 0;
	}

}

