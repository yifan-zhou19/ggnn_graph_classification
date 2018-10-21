package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[1000];
		int t;
		int j;
		int p = 0;
		int i;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[0] = Integer.parseInt(tempVar3);
		}


		for (i = 1;i < n;i++)
		{
		t = i;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}

	for (j = 0;j < t;j++)
	{
		if (a[j] == k - a[i])
		{
			p = 1;
			break;
		}
	}
		}
	if (p == 0)
	{
		System.out.print("no");
	}
	if (p == 1)
	{
		System.out.print("yes");
	}





		return 0;
	}


}

