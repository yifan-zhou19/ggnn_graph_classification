package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int su = int k;
	  int n;
	  int i;
	  int j;
	  int p;
	  int q;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 6;i <= n;i += 2)
	  {
		  for (j = 3;j <= i / 2;j += 2)
		  {
			  p = su(j);
			  q = su(i - j);
			  if (p != 0 && q != 0)
			  {
				  System.out.printf("%d=%d+%d\n",i,j,i - j);
				  break;
			  }

		  }


	  }
	}
	public static int su(int k)
	{
		int m;
		int t = 1;
		for (m = 2;m <= Math.sqrt(k);m++)
		{
			if (k % m == 0)
			{
				t = 0;
				break;
			}

		}
		return (t);
	}
}

