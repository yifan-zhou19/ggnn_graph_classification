package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int s = 0;
		int c;
		int e = 0;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			b[i] = a[i];
		}
		for (i = 0;i < n;i++)
		{
			for (c = 0;c < n;c++)
			{
				if (a[i] + b[c] == k)
				{
					System.out.print("yes");
					e = 1;
					break;
				}
			}
			if (e == 1)
			{
				break;
			}
		}
		if (e == 0)
		{
			System.out.print("no");
		}
	   return 0;
	}
}

