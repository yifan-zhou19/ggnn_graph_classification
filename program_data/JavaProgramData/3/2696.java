package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int k;
	 int i;
	 int j;
	 int a = 0;
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
	 int[] p;
	 p = new int[n];
	 for (i = 0;i < n;i++)
	 {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   p[i] = Integer.parseInt(tempVar3);
	   }
	 }
	 for (i = 0;i < n - 1;i++)
	 {
	   for (j = i + 1;j < n;j++)
	   {
		  if (p[i] + p[j] == k)
		  {
			a = 1;
		  }
	   }
	 }
	 if (a == 1)
	 {
	   System.out.print("yes");
	 }
	 else
	 {
	   System.out.print("no");
	 }

	}
}

