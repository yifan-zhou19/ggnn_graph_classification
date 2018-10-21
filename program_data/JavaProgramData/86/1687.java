package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int m;
	   int i;
	   int a;
	   int[] b = new int[100];
	   int k;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < n;i++) //????n???
	   {
		   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   if (m == 0) //m=0????
		   {
			   System.out.print(60);
			   System.out.print("\n");
		   }
		   else
		   {
				for (k = 0;k < m;k++) //????m???
				{
					a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					b[k] = a;
				}
				for (k = m - 1;k >= 0;k--) //?????????
				{
					if (b[k] + 3 * (k + 1) <= 60)
					{
						System.out.print(60 - 3 * (k + 1));
						System.out.print("\n");
						break;
					}
					else if (b[k] + 3 * k <= 60)
					{
						System.out.print(b[k]);
						System.out.print("\n");
						break;
					}
				}
		   }
	   }
	   return 0;
	}
}

