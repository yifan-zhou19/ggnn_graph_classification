package <missing>;

public class GlobalMembers
{
	public static int put(int m,int n)
	{
		int c;
		if (n == 1 || n == 0)
		{
			c = 1;
		}
		else if (m == 1 || m == 0)
		{
			c = 1;
		}
			   else if (m < n)
			   {
						  c = put(m, m);
			   }
		else
		{
			c = put(m, n - 1) + put(m - n, n);
		}
		return (c);
	}
	 public static int Main()
	 {
		 int u;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 u = Integer.parseInt(tempVar);
		 }
		 int[][] a = new int[100][2];
		 int i;
		 for (i = 0;i <= u - 1;i++)
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i][0] = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 a[i][1] = Integer.parseInt(tempVar3);
		 }
		 }
		 for (i = 0;i <= u - 1;i++)
		 {
		 System.out.printf("%d\n",put(a[i][0], a[i][1]));
		 }
		 return 0;
	 }


}

