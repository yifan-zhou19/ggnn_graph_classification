package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] b = new int[1000];
	int n;
	int k;
	int i;
	int j;
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
			 b[i] = Integer.parseInt(tempVar3);
		 }
	 }
	 for (i = 0;i < n - 1;i++)
	 {
		 for (j = i + 1;j < n;j++)
		 {
			 if (b[i] + b[j] == k)
			 {
				 System.out.print("yes");
				 break;
			 }
			 if (i == n - 2 && j == n - 1)
			 {
				 System.out.print("no");
			 }
		 }
		 if (b[i] + b[j] == k)
		 {
			 break;
		 }
	 }

		return 0;
	}
}

