package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[1000];
		int i;
		int m;
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
			for (m = 0;m < n;m++)
			{
				if ((a[i] + a[m]) == k && a[i] != a[m])
				{
					s = 1;
				}
			}
		}
		if (s == 1)
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

