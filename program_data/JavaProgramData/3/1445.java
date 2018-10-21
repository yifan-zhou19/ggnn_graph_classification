package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		int n;
		int x;
		int i;
		int k;
		int q;
		int y = 0;
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
		for (i = 0,q = 0;i < n,q < n;i++,q++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
			a[i] = x;
		}
		for (i = 0;i < n - 1;i++)
		{
			for (q = i + 1;q < n;q++)
			{
				if (a[i] + a[q] == k)
				{
					y = 1;
				break;
				}
			}
			if (y == 1)
			{
			break;
			}
		}
		if (y == 1)
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

