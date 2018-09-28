package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] sz = new int[SUM];
	 int n;
	 int k;
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
	 int i;
	 for (i = 0;i < n;i++)
	 {
					  String tempVar3 = ConsoleInput.scanfRead();
					  if (tempVar3 != null)
					  {
						  sz[i] = Integer.parseInt(tempVar3);
					  }
	 }
	 int j;
	 int sum = 0;
	 for (j = 0;j < n - 1;j++)
	 {
					  for (i = 1;i <= n - j - 1;i++)
					  {
										  if (sz[j] + sz[j + i] == k)
										  {
															   sum++;
										  }
					  }
	 }
	 if (sum != 0)
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

