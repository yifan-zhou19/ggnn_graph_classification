package <missing>;

public class GlobalMembers
{
	public static int put(int m,int n)
	{
		int p1 = 0;
		int p2 = 0;
		int s;
	  if (n == 1)
	  {
		  s = 1;
	  }
	  else
	  {
		  if (m >= n)
		  {
			  p1 = put(m - n, n);
		  }
	   p2 = put(m, n - 1);
	   s = p1 + p2;
	  }
	  return (s);
	}



	public static void Main()
	{
		int t;
		int[] M = new int[20];
		int[] N = new int[20];
		int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  t = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < t;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			M[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			N[i] = Integer.parseInt(tempVar3);
		}
	  }

	  for (i = 0;i < t;i++)
	  {
		 System.out.printf("%d\n",put(M[i], N[i]));
	  }

	}
}

