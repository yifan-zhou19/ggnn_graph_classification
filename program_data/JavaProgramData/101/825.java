package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[3];
	  int[] b = new int[3];
	  int i;
	  for (a[0] = 0;a[0] < 3;a[0]++)
	  {
		  for (a[1] = 0;a[1] < 3;a[1]++)
		  {
			  for (a[2] = 0;a[2] < 3;a[2]++)
			  {
				  if ((a[0] != a[1]) && (a[0] != a[2]) && (a[1] != a[2]))
				  {





				   b[0] = (a[1] > a[0]) + (a[2] == a[0]);
				  }
				   b[1] = (a[0] > a[1]) + (a[0] > a[2]);
				   b[2] = (a[2] > a[1]) + (a[1] > a[0]);
				   if ((a[0] + b[0] == 2) && (a[1] + b[1] == 2) && (a[2] + b[2] == 2))
				   {
					  if ((a[0] == 2) && (a[1] == 1))
					  {
						  System.out.print("ABC");
						  System.out.print("\n");
					  }
					  if ((a[0] == 2) && (a[2] == 3))
					  {
						  System.out.print("ACB");
						  System.out.print("\n");
					  }
					  if ((a[1] == 2) && (a[2] == 1))
					  {
						  System.out.print("BCA");
						  System.out.print("\n");
						  break;
					  }
					  if ((a[1] == 2) && (a[0] == 1))
					  {
						  System.out.print("BAC");
						  System.out.print("\n");

					  }
					  if ((a[2] == 2) && (a[0] == 1))
					  {
						  System.out.print("CAB");
						  System.out.print("\n");
					  }
					  if ((a[2] == 2) && (a[1] == 1))
					  {
						  System.out.print("CBA");
						  System.out.print("\n");
					  }

				   }

			  }
		  }
	  }
	  return 0;
	}
}
