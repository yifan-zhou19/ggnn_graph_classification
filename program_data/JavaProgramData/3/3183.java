package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int m;
	 int k;
	 int[] s = new int[1000];
	 int[] q = new int[1000];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 m = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < n;i++)
	 {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 s[i] = Integer.parseInt(tempVar3);
		 }
	 }
	 for (k = 1;k < n;k++)
	 {
		 q[k] = s[k];
	 }
	 int c = 0;
	 for (i = 0;i < n;i++)
	 {
		 if (c == m)
		 {
			 break;
		 }
		 else
		 {
	   for (k = 1;k < n;k++)
	   {
		   c = s[i] + q[k];
		   if (c == m)
		   {
			   System.out.print("yes");
			   break;
		   }
	   }
		 }
	 }
	  if (c != m)
	  {
		  System.out.print("no");
	  }
	  return 0;
	}


}

