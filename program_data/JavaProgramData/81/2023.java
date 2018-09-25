package <missing>;

public class GlobalMembers
{
	public static void trans(int[] m, int p, int q)
	{
	 int s;
	 int i;
	 int j;
	 if (p > 4 || q > 4)
	 {
	  System.out.print("error");
	 }
	 else
	 {

	  for (i = 0;i < 5;i++)
	  {
	   s = (m[p] + i);
	   *(m[p] + i) = *(m[q] + i);
	   *(m[q] + i) = s;
	  }
	  for (i = 0;i < 5;i++)
	  {
		 for (j = 0;j < 4;j++)
		 {
			 System.out.printf("%d ",*(m[i] + j));
		 }
		 System.out.printf("%d\n",*(m[i] + 4));
	  }
	 }
	}
	public static int Main()
	{
	 int[][] a = new int[5][5];
	 int i;
	 int n;
	 int j;
	 int m;
	 (int)(*p)[5];
	 //freopen("input.txt","r",stdin);
	 //freopen("output.txt","w",stdout);
	 p = a;
	 for (i = 0;i < 5;i++)
	 {
	  for (j = 0;j < 5;j++)
	  {
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   (*(p + i) + j) = tempVar;
	   }
	  }
	 }

	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 m = Integer.parseInt(tempVar3);
	 }
	 trans(p, n, m);
	 return 0;
	}

}

