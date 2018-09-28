package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int n;
	 int k;
	 int[] a = new int[1001];
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
	 for (i = 1;i <= n;i++)
	 {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i] = Integer.parseInt(tempVar3);
	   }
	 }
	 for (i = 1;i <= n;i++)
	 {
	   for (j = i + 1;j <= n;j++)
	   {




				if (a[i] + a[j] == k)
				{
				  System.out.print("yes");
				  break;
				}

	   }
		if (a[i] + a[j] == k)
		{
		 break;
		}
		if (i == n)
		{
		 System.out.print("no");
		}
	 }
	}
}

