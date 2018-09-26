package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m; //m=????? a,b=??
	  int a;
	  int b;
	  int i;
	  int j;
	  int k;
	  int l;
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (a = 3;a <= m / 2;a++)
	  {
		int j = 0;
		for (i = 2;i < a;i++)
		{
		  j = j + (a % i == 0);
		}
		if (j == 0)
		{
			b = m - a;
			int k = 0;
			for (l = 2;l < b / 2;l++)
			{
			  k = k + (b % l == 0);
			}
			if (k == 0)
			{
			  System.out.print(a);
			  System.out.print(" ");
			  System.out.print(b);
			  System.out.print("\n");
			}
		}


	  }
	  return 0;
	}

}

