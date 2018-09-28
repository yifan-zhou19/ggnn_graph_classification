package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int k;
	 int[] a = new int[1000];
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
		  a[i] = Integer.parseInt(tempVar3);
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
		 for (j = i + 1;j < n - i;j++)
		 {
			 if (a[j] + a[i] != k)
			 {
			   continue;
			 }
			  if (a[j] + a[i] == k)
			  {
				 System.out.print("yes");
				 return 0;
			  }
		 }
	 }
	 if (i == n)
	 {
		 System.out.print("no");
	 }

	 return 0;
	}
}

