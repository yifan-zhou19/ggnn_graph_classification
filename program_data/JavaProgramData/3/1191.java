package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int f = 0;
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
			b[i] = k - a[i];
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
			if (a[i] == b[j] && i != j && f == 0)
			{
				f = 1;
				break;
			}
			}
			if (f == 1)
			{
			break;
			}
		}
		if (f == 1)
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

