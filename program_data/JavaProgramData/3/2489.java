package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
		int n;
		int k;
		int i;
		int r;
		int[] a = new int[1000];
		int x = 0;
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
		for (i = 0;i <= n - 1;i = i + 1)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (r = 0;r <= n - 2;r = r + 1)
		{
			for (i = r + 1;i <= n - 1;i = i + 1)
			{
				if ((a[r] + a[i]) == k)
				{
					x = x + 1;
				}
			}
		}
		if (x == 0)
		{
			System.out.print("no");
		}
		else if (x != 0)
		{
			System.out.print("yes");
		}
		return 0;
	  }
}

