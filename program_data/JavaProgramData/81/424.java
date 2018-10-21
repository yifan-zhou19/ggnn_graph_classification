package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[][] an = new int[5][5];
	  int[] q = an[0];
	  int i;
	  int n;
	  int m;
	  int rev = new int(int n,int x,int an[5][5]);
	  for (i = 0;i < 25;i++)
	  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  q + i = tempVar;
		  }
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  m = Integer.parseInt(tempVar3);
	  }
	  if (rev(n, m, an) == 1)
	  {
		  q = an[0];
		  for (i = 0;i < 25;i++)
		  {
			  System.out.printf("%d",q[i]);
			  if (i % 5 != 4)
			  {
				  System.out.print(" ");
			  }
			  else
			  {
				  System.out.print("\n");
			  }
		  }
	  }
	  else
	  {
		  System.out.print("error\n");
	  }


	return 0;
	}
	public static int rev(int n, int m, int[][] an)
	{
	 int[] p = an;
	 int k;
	 int w;
	 if ((n >= 0) && (n < 5) && (m >= 0) && (m < 5))
	 {
	  for (w = 0;w < 5;w++)
	  {
	  k = (p[n] + w);
	  *(p[n] + w) = *(p[m] + w);
	  *(p[m] + w) = k;
	  }
	  return 1;
	 }
	 else
	 {
		 return 0;
	 }
	}
}

