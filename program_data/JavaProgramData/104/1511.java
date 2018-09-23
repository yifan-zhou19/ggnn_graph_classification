package <missing>;

public class GlobalMembers
{
	//**********************************
	//??: ???
	//???2013.11.23
	//**********************************
	public static int Main()
	{
		int x = 0;
		int y = 0;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int i = 1;
		int j = 1;
		int p = 0;
		int q = 0;
		int k = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x > 1)
		{
			   for (i = 1;;i++)
			   {
				  if (x % 2 == 0)
				  {
					 a[i] = x;
					 x = x / 2;
				  }
				  else
				  {
					 a[i] = x;
					 x = (x - 1) / 2;
				  }
				   if (x == 1)
				   {
					   a[i + 1] = 1;
					   break;
				   }
			   }
		}
		else
		{
			a[1] = 1;
		}
		 if (y > 1)
		 {
			   for (j = 1;;j++)
			   {
				  if (y % 2 == 0)
				  {
					 b[j] = y;
					 y = y / 2;
				  }
				  else
				  {
					 b[j] = y;
					 y = (y - 1) / 2;
				  }
				   if (y == 1)
				   {
					   b[j + 1] = 1;
					   break;
				   }
			   }
		 }
		 else
		 {
			 b[1] = 1;
		 }
		 for (p = 1;p <= i + 1;p++)
		 {
			 for (q = 1;q <= j + 1;q++)
			 {
				 if (a[p] == b[q])
				 {
					 k = 1;
					 System.out.print(a[p]);
					 System.out.print("\n");
					 break;
				 }
			 }
			 if (k == 1)
			 {
				 break;
			 }
		 }


		return 0;
	}
}

