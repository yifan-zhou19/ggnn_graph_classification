package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int p;
		int q;
		int x;
		int[] a = new int[1000];
		x = -1;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[1] = Integer.parseInt(tempVar3);
		}
		for (i = 2;i <= n;i++) //??????n??
		{
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
		}
		for (p = 1;p <= n - 1;p++) //???????????k??
		{
			for (q = p + 1;q <= n;q++)
			{
				if (a[p] + a[q] == k) //?????????????????????1???break?????
				{
					x = 1;
				}
			}
			if (x == 1) //x??1??????????????????
			{
			break;
			}
		}
		if (x == -1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
		return 0;
	}
}

