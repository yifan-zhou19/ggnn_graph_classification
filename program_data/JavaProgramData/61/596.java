package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[] dijige = new int[20];
	 for (int i = 0;i <= n - 1;i++)
	 {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(dijige[i]) = Integer.parseInt(tempVar2);
		}
	 }
	 int[] q = new int[30];
	 q[0] = 1;
	 q[1] = 1;
	 for (int k = 2;k <= 25;k++)
	 {
		 q[k] = q[k - 1] + q[k - 2];
	 }
	 for (int j = 0;j <= n - 1;j++)
	 {
			 System.out.printf("%d\n",q[dijige[j] - 1]);

	 }

	 return 0;
	}

}

