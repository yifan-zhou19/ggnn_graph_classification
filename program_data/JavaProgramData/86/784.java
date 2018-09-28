package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 1;i <= n;i++)
	 {
		 int m;
		 int[] a = new int[10];
		 int flag = 1;
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (j = 0;j < m;j++)
	  {
		 a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  for (j = 0;j < m && flag != 0;j++)
	  {
	   if ((60 - 3 * j - a[j]) <= 3)
	   {
		  flag = 0;
	   }
	  }
	  if (flag == 0)
	  {
		if ((60 - 3 * (j - 1) - a[j - 1]) >= 0)
		{
		  System.out.print(a[j - 1]);
		  System.out.print("\n");
		}
		else
		{
			System.out.print((60 - 3 * (j - 1)));
			System.out.print("\n");
		}
	  }
	  else
	  {
		  System.out.print((60 - 3 * m));
		  System.out.print("\n");
	  }
	 }
	 return 0;
	}

}

