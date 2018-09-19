package <missing>;

public class GlobalMembers
{
	//************************************
	//*  ?? ?:5_2.cpp                 *
	//*  ?   ?:???                  *
	//*  ????:2013.10.14             *
	//*  ????:????               *
	//************************************
	public static int Main()
	{
	  int n;
	  int m = 0;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  if (n == 0)
	  {
	  System.out.print("0");
	  System.out.print("\n");
	  }
	  else
	  {
	  for (int i = 4;i >= 0;i--)
	  {
		if (Math.floor(n / Math.pow(10.0,i)) != 0)
		{
		  if (i >= m)
		  {
			m = i;
		  }
		}
	  }
	   int[] p = new int[m + 2];
	   int[] q = new int[m + 1];
	  for (int j = 0;j < m + 2;j++)
	  {
		 p[j] = n % (int)Math.pow(10.0,j);
	  }
	   for (int k = 0;k < m + 1;k++)
	   {
		  q[k] = (p[m + 1 - k] - p[m - k]) / (int)Math.pow(10.0,m - k);
	   }
	   for (int t = 0;t < m + 1;t++)
	   {
	   System.out.print(q[m - t]);
	   }
	  }
	   return 0;
	}

}

