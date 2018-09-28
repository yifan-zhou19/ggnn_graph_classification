package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int Main()
	{
		void p(char c,int b1,int b2,int b3,int b4);
	 int i;
	 int j;
	 int k;
	 int l;
	 int n;
	 int m;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < m;i++)
	 {
	  for (j = 0;j < n;j++)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[i][j] = Integer.parseInt(tempVar3);
	   }
	  }
	 }
	 p('y', 0, 0, n - 1, m - 1);
	}
	public static void p(char c,int b1,int b2,int b3,int b4)
	{
	 int i;
	 int j;
	 int k;
	 int l;
	 if (c == 'y')
	 {
		 for (i = b1;i <= b3;i++)
		 {
	   System.out.printf("%d\n",a[b2][i]);
		 }
	  if (b2 != b4)
	  {
	   p('x', b1, b2 + 1, b3, b4);
	  }
	 }
	 if (c == 'x')
	 {
		 for (i = b2;i <= b4;i++)
		 {
	   System.out.printf("%d\n",a[i][b3]);
		 }
	  if (b1 != b3)
	  {
	   p('z', b1, b2, b3 - 1, b4);
	  }
	 }
	 if (c == 'z')
	 {
		 for (i = b3;i >= b1;i--)
		 {
	   System.out.printf("%d\n",a[b4][i]);
		 }
	  if (b2 != b4)
	  {
	   p('s', b1, b2, b3, b4 - 1);
	  }
	 }
	 if (c == 's')
	 {
		 for (i = b4;i >= b2;i--)
		 {
	   System.out.printf("%d\n",a[i][b1]);
		 }
	  if (b1 != b3)
	  {
	   p('y', b1 + 1, b2, b3, b4);
	  }
	 }
	}


}

