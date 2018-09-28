package <missing>;

public class GlobalMembers
{
	//******************
	public static int n = 0;
	public static int num = 0;
	public static int i = 0;
	//******************
	public static void upside(int x)
	{
	   int[] a = new int[5];
	   int y = 0;
	   int z = 0;
	   int len = 0;
	   int len0 = 0;
	   if (x > 0)
	   {

		   for (i = 0;i < 5;i++)
		   {
				a[i] = x % 10;
				   x = x / 10;
				if (x == 0)
				{
					len = i;
					break;
				}
		   }
		   for (i = 0;a[i] == 0;i++)
		   {
			 len0++;

		   }
		  for (i = len0;i <= len;i++)
		  {
			   System.out.print(a[i]);
		  }
	   }


	   else if (x == 0)
	   {
	   System.out.print("0");
	   System.out.print("\n");
	   }
	   else if (x < 0)
	   {
			x = 0 - x;

		   for (i = 0;i < 5;i++)
		   {
				a[i] = x % 10;
				   x = x / 10;
				if (x == 0)
				{
					len = i;
					break;

				}
		   }
		   for (i = 0;a[i] == 0;i++)
		   {
			 len0++;

		   }
		   System.out.print("-");
		  for (i = len0;i <= len;i++)
		  {
			   System.out.print(a[i]);
		  }
	   }
	}


	public static int Main()
	{
		for (int j = 0;j < 6;j++)
		{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		upside(n);
		System.out.print("\n");
		}
	}


}

