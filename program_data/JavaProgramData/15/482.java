package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

	 int[][] A = new int[1000][1000];
	 int n;
	 int i;
	 int j;
	 int a1;
	 int a2;
	 int b1;
	 int b2;
	 a1 = a2 = b1 = b2 = 0;
	 int s;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
	   for (j = 0;j < n;j++)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 A[i][j] = Integer.parseInt(tempVar2);
		 }
	   }
	 }
	 for (i = 0;i < n;i++)
	 {
	   for (j = 0;j < n;j++)
	   {
		 if (A[i][j] == 0)
		 {
		   a1 = i;
		   b1 = j;
		   break;
		 }
	   }
	   if (A[a1][b1] == 0)
	   {
		   break;
	   }

	 }
	 for (i = n - 1;i >= 0;i--)
	 {
	   for (j = n - 1;j >= 0;j--)
	   {
		 if (A[i][j] == 0)
		 {
		   a2 = i;
		   b2 = j;
		   break;
		 }
	   }
	   if (A[a2][b2] == 0)
	   {
		   break;
	   }

	 }
	 s = (a2 - a1 - 1) * (b2 - b1 - 1);
	 System.out.printf("\n%d\n",s);
	}



}

