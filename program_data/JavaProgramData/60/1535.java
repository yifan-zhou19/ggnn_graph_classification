package <missing>;

public class GlobalMembers
{
	public static int prime(int a)
	{
	  int i;
	  int m;
	  m = Math.sqrt(a) + 1;
	  for (i = 2;i < m;i++)
	  {
		  if (a % i == 0)
		  {
		   break;
		  }
	  }
		if (i == m)
		{
		return 1;
		}
	}
	public static int Main()
	{
	  int i;
	  int j;
	  int k;
	  int t;
	  int v;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int count = 0;
	  for (i = 2;i <= n - 2;i++)
	  {
		t = prime(i);
		if (t == 1)
		{
			j = i + 2;
			v = prime(j);
			if (v == 1)
			{
			 System.out.printf("%d %d\n",i,j);
			 count++;
			}
		}
	  }
		if (count == 0)
		{
		 System.out.print("empty");
		}


	}
}

