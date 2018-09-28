package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] b = new int[4];
	   char[] a = {'z', 'q', 's', 'l'};
	   for (b[0] = 1;b[0] <= 5;b[0]++)
	   {
		   for (b[1] = 1;b[1] <= 5;b[1]++)
		   {
			   for (b[2] = 1;b[2] <= 5;b[2]++)
			   {
				   for (b[3] = 1;b[3] <= 5;b[3]++)
				   {
					   if ((b[0] - b[1]) * (b[0] - b[2]) * (b[0] - b[3]) * (b[1] - b[2]) * (b[1] - b[3]) * (b[2] - b[3]) && b[0] + b[1] == b[2] + b[3] && b[0] + b[3] > b[1] + b[2] && b[0] + b[2] < b[1])
					   {
						   for (int i = 5;i > 0;i--)
						   {
							   for (int j = 0;j < 4;j++)
							   {
								   if (b[j] == i)
								   {
									   System.out.print(a[j]);
									   System.out.print(" ");
									   System.out.print(i * 10);
									   System.out.print("\n");
								   }
							   }
						   }
					   }
				   }
			   }
		   }
	   }
		return 0;

	}
}
