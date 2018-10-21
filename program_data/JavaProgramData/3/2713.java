package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??n,k???
		int k;
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
		int i = 1;
		for (i = 1;i <= n;i++) //?????????
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		int ceshi = 0;
		int x1;
		int j = 1;
		for (j = 1;j <= n - 1;j++) //????????????????
		{
			for (x1 = n;x1 >= j + 1;x1--) //??????????????
			{
				if (a[j] + a[x1] == k)
				{
					ceshi = 1;
				}
			}
		}
		if (ceshi == 1)
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

