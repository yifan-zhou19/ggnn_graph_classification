package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int[] a = new int[10000];
		int n;
		int k;
		int f = 0;
		int m;
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
		for (i = 0;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (l = 0;l <= n;l++)
		{
			for (m = l + 1;m <= n;m++)
			{
				if (a[l] + a[m] == k)
				{
						f = f + 1;
				}
			}
		}
		if (f != 0)
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

