package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] zimu = new int[27];
		int[] loci = new int[27];
		int minadr = 100009;
		int flag = 0;
		String str = new String(new char[100001]);
		String num = new String(new char[10]);
		String ptr;
		String list = new String(new char[27]);
		num = new Scanner(System.in).nextLine();
		n = Integer.parseInt(num);
		for (i = 0;i < n;i++)
		{
			str = new Scanner(System.in).nextLine();
			for (j = 0; * (j + str) != '\0';j++)
			{
										 ptr = j + str;
										 zimu[ptr - 'a' + 1] += 1;
										 if (zimu[ptr - 'a' + 1] == 1)
										 {
																 loci[ptr - 'a' + 1] = j;
										 }
			}

			for (j = 1;j < 27;j++)
			{
							  if (zimu[j] == 1)
							  {
											   if (loci[j] < minadr)
											   {
																	minadr = loci[j];
											   }
																	flag = 1;

							  }
			}
			if (flag != 0)
			{
					System.out.printf("%c\n",*(str.Substring(minadr)));

			}
			else
			{
				System.out.print("no\n");
			}
			for (j = 1;j < 27;j++)
			{
							  zimu[j] = 0;
							  loci[j] = 0;
							  minadr = 100009;
							  flag = 0;
			}
			minadr = 100009;
			flag = 0;

		}
		 return 0;
	}

}
