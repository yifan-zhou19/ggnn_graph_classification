package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int m;
	   int i = 0;
	   int k;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[] a = new int[60];
	   for (i = 0;i < n;i++)
	   {
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{

			{
				for (k = 0;k < m;k++)
				{
					a[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
		}
			if ((a[m - 1] + (m - 1) * 3) <= 57)
			{
				System.out.print(60 - m * 3);
				System.out.print("\n");
			}


			for (k = 0;k < m;k++)
			{
				if (a[k] + k * 3 >= 57 && a[k] + k * 3 <= 60)
				{
						System.out.print(a[k]);
						System.out.print("\n");

						break;
				}
				 if ((a[k] + k * 3) > 60)
				 {

					 System.out.print(60 - k * 3);
					 System.out.print("\n");
					 break;
				 }
			}
			}
	   }


		return 0;
	}
}

