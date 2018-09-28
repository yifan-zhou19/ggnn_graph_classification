package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int[] a = new int[10000];
		int right = 0;
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
		int j;
		for (i = 0;i < n - 1;i++)
		{
						   for (j = i + 1;j <= n;j++)
						   {
											   if (a[i] + a[j] == k)
											   {
																right = k;
																break;
											   }
						   }
						   if (right == k)
						   {
										System.out.print("yes");
										break;
						   }
						   else if (i == n - 2 && right != k)
						   {
								System.out.print("no");
						   }
		}
		return 0;
	}

}

