package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		for (a[1] = 1;a[1] <= 5;a[1]++)
		{
			for (a[2] = 1;a[2] <= 5;a[2]++)
			{
			   for (a[3] = 1;a[3] <= 5;a[3]++)
			   {
				 for (a[4] = 1;a[4] <= 5;a[4]++)
				 {
				   for (a[5] = 1;a[5] <= 5;a[5]++)
				   {
					 if (a[1] != a[2] && a[1] != a[3] && a[1] != a[4] && a[1] != a[5] && a[2] != a[4] && a[2] != a[3] && a[2] != a[5] && a[3] != a[5] && a[3] != a[4] && a[4] != a[5] && a[5] != 2 && a[5] != 3 && (((a[1] == 1 || a[1] == 2) && a[5] == 1) + ((a[2] == 1 || a[2] == 2) && a[2] == 2) + ((a[3] == 1 || a[3] == 2) && a[1] == 5) + ((a[4] == 1 || a[4] == 2) && a[3] > 1) + ((a[5] == 1 || a[5] == 2) && a[4] == 1) == 2) && ((a[1] != 1 && a[1] != 2 && a[5] != 1) + (a[2] != 1 && a[2] != 2 && a[2] != 2) + ((a[3] != 1 && a[3] != 2) && a[1] != 5) + ((a[4] != 1 && a[4] != 2) && a[3] == 1) + ((a[5] != 1 && a[5] != 2) && a[4] != 1) == 3))
					 {

								System.out.print(a[1]);
								System.out.print(' ');
								System.out.print(a[2]);
								System.out.print(' ');
								System.out.print(a[3]);
								System.out.print(' ');
								System.out.print(a[4]);
								System.out.print(' ');
								System.out.print(a[5]);
								break;
					 }
				   }
				 }
			   }
			}
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}
