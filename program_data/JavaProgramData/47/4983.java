package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int[] n = new int[100];
		 int k;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 k = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i <= k - 1;i++)
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 n[i] = Integer.parseInt(tempVar2);
		 }
		 }
		 for (i = 0;i <= (k - 1) / 2;i++)
		 {
			 int e;
			e = n[k - i - 1];
		   n[k - i - 1] = n[i];
			 n[i] = e;
		 }
		 for (int i = 0;i <= k - 2;i++)
		 {
			 System.out.printf("%d ",n[i]);
		 }
		  System.out.printf("%d",n[k - 1]);
	return 0;
	}

}

