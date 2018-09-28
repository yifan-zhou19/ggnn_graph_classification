package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int k;
		int t = 0;
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
		int[] a = new int[1001];
		for (int i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int q = 1;q <= n - 1;q++)
		{
			for (int r = q + 1;r <= n;r++)
			{
				if (a[q] + a[r] == k)
				{
					System.out.print("yes");
					t++;
					break;
				}
			}
			if (t == 1)
			{
				break;
			}
		}
		if (t == 0)
		{
			System.out.print("no");
		}


	}


}

