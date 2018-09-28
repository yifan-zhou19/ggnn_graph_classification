package <missing>;

public class GlobalMembers
{
	/**
	  *file  ????????
	  *author ???
	  *date   10.23
	  *function ???????????????????n?n <= 50000??? 
	            ?6 ~ n??????????????????
	*/
	public static int Main()
	{
		int n;
		int i;
		int q;
		int p;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 6; k <= n; k = k + 2)
		{
			for (i = 2; i <= Math.sqrt((double)(k - 2)); i++) //???????n???2+?n-2????
			{
				if ((k - 2) % i == 0)
				{
					break;
				}
			}
			if (i > Math.sqrt((double)(k - 2)))
			{
				System.out.print(k);
				System.out.print("=2+");
				System.out.print(k - 2);
				System.out.print("\n");
			}
			for (i = 3; i <= k / 2; i = i + 2) //??[3,sqrt(n)]?????
			{
				for (q = 2; q <= Math.sqrt((double)i); q++)
				{
					if (i % q == 0)
					{
						break;
					}
				}
				if (q > Math.sqrt((double)i)) //????????
				{
					for (p = 2; p <= Math.sqrt((double)(k - i)); p++) //????????????
					{
						if ((k - i) % p == 0)
						{
							break;
						}
					}
					if (p > Math.sqrt((double)(k - i)))
					{
						System.out.print(k);
						System.out.print("=");
						System.out.print(i);
						System.out.print("+");
						System.out.print((k - i));
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}
}

