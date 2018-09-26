package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int a;
	int b;
	int c;
	int d;
	int e;
	int[] f = new int[20];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		 a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 if (a == 0)
		 {
			 System.out.print(60);
			 System.out.print("\n");
		 }
		 else
		 {

			   for (j = 1;j <= a;j++)
			   {
				   f[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   }
				for (j = 1;j <= a;j++)
				{
					if ((f[j] + 3 * j) >= 60 && (f[j] + 3 * j) <= 62)
					{
							System.out.print(f[j]);
							System.out.print("\n");
						 break;
					}
					if ((f[j] + 3 * j) > 62)
					{
							System.out.print(63 - j * 3);
							System.out.print("\n");
						 break;
					}
					  if (j == a)
					  {
						   System.out.print(60 - a * 3);
						   System.out.print("\n");
						 break;
					  }

				}
		 }
	}

	}
}

