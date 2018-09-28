package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int k;
	 int s;
	 int x;
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
		x = 0;
	 int[] a = new int[1000];
	 for (int i = 0;i < n;i++)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a[i] = Integer.parseInt(tempVar3);
	  }
	 }
	 for (int j = 0;j < n - 1;j++)
	 {
	  for (int l = j + 1;l < n;l++)
	  {
	   s = a[j] + a[l];
	   if (s == k)
	   {
		x = x + 1;
	   }
	  }
	 }
	 if (x == 0)
	 {
	  System.out.print("no");
	 }
	 if (x != 0)
	 {
	  System.out.print("yes");
	 }
	 return 0;
	}

}

