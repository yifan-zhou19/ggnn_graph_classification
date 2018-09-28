package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int j;
	 int c = 0;
	 int d;
	 int f;
	 int[] g = new int[301];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 g[1] = Integer.parseInt(tempVar2);
	 }
	 System.out.printf("%d",g[1]);
	 c = 1;
	 for (i = 2;i <= n;i++)
	 {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   d = Integer.parseInt(tempVar3);
	   }
	   f = 1;
	   for (j = 1;j <= c;j++)
	   {
		 if (g[j] == d)
		 {
			   f = 0;
			   break;
		 }
	   }
	   if (f == 1)
	   {
		 c = c + 1;
		 g[c] = d;
		 System.out.printf(",%d",d);
	   }
	 }
	 System.out.print("\n");
	}
}

