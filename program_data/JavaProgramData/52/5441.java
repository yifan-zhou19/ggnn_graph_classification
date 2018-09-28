package <missing>;

public class GlobalMembers
{
	//***********************************************
	//*  ? ? ?:5.3                               *
	//*  ?    ?:???                            *
	//*  ????:10.25                             *
	//*  ????:????                          *
	//*********************************************** 
	public static int Main()
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] p = new int[n];
		for (int i = 0;i < n;i++)
		{
		  p[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0;j < m;j++)
		{
		  int t;
		  t = p[n - m + j];
		  for (int k = n - m + j;k > j;k--)
		  {
			p[k] = p[k - 1];
		  }
		  p[j] = t;
		}
		for (int k = 0;k < n - 1;k++)
		{
		   System.out.print(p[k]);
		   System.out.print(" ");
		}
		System.out.print(p[n - 1]);
		return 0;
	}

}

