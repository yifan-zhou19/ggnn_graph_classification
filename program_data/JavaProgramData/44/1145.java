package <missing>;

public class GlobalMembers
{
	public static final int n = 6;
	public static int down(int x)
	{
		 int k;
		 int m;
		 k = x;
		 m = 0;
		 while (k > 0)
		 {
			m = m * 10;
			m = m + k % 10;
			k = k / 10;
		 }
		 return m;
	}
	public static int Main()
	{
		  int i;
		  int k;
		  int l;
		  for (i = 1;i <= n;i++)
		  {
			  l = 1;
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  k = Integer.parseInt(tempVar);
			  }
			  if (k < 0)
			  {
					 l = -1;
					 k = -k;
			  }
			  k = down(k);
			  if (l == -1)
			  {
				  k = -k;
			  }
			  System.out.printf("%d\n",k);
		  }
		  System.in.read();
		  System.in.read();
	}

}

