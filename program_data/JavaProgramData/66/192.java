package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int i;
		int j;
		int n;
		int k;
		int e;
		m = n = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		e = y % 400;
		if (e != 0)
		{
				 for (i = 1;i < e;i++)
				 {
					 if (i % 400 == 0)
					 {
						 n = n + 2;
					 }
					 else if (i % 100 == 0)
					 {
						 n = n + 1;
					 }
					 else if (i % 4 == 0)
					 {
						 n = n + 2;
					 }
					 else
					 {
						 n = n + 1;
					 }
				 }
		}
		else
		{
			for (i = 1;i < 400;i++)
			{
				if (i % 400 == 0)
				{
					n = n + 2;
				}
				else if (i % 100 == 0)
				{
					n = n + 1;
				}
				else if (i % 4 == 0)
				{
					n = n + 2;
				}
				else
				{
					n = n + 1;
				}
			}
		}
		 for (j = 1;j < m;j++)
		 {
	  switch (j)
	  {
	   case 1:
	   case 3:
	   case 5:
	   case 7:
	   case 8:
	   case 10:
	   case 12:
		   n = n + 3;
		   break;
	   case 2:
	  if (i % 400 == 0)
	  {
	   n = n + 1;
	  }
	  else if (i % 100 == 0)
	  {
	   n = n;
	  }
	  else if (i % 4 == 0)
	  {
	   n = n + 1;
	  }
	  break;
	  default:
		  n = n + 2;
		  break;
	  }
		 }
	 n = n + d;
	 k = n % 7;
	 if (k == 1)
	 {
	 System.out.print("Mon.");
	 System.out.print("\n");
	 }
	  if (k == 2)
	  {
	 System.out.print("Tue.");
	 System.out.print("\n");
	  }
	  if (k == 3)
	  {
	 System.out.print("Wed.");
	 System.out.print("\n");
	  }
	  if (k == 4)
	  {
	 System.out.print("Thu.");
	 System.out.print("\n");
	  }
	  if (k == 5)
	  {
	 System.out.print("Fri.");
	 System.out.print("\n");
	  }
	  if (k == 6)
	  {
	 System.out.print("Sat.");
	 System.out.print("\n");
	  }
	  if (k == 0)
	  {
	 System.out.print("Sun.");
	 System.out.print("\n");
	  }
	 return 0;
	}
}

