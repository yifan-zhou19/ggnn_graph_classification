package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		for (i = 3;i <= n / 2;i = i + 2)
		{
			   for (j = 2;j <= i;j++)
			   {
					 if (i % j == 0)
					 {
						 break;
					 }
			   }
				 if (j == i) //????????i???
				 {
					   for (k = 2;k <= n - i;k++)
					   {
							if ((n - i) % k == 0)
							{
								break;
							}
					   }
						if (k == n - i) //???n-i???
						{
								System.out.print(i);
								System.out.print(" ");
								System.out.print(n - i);
								System.out.print("\n");
						}
				 }
		}
		   return 0;
	}

}

