package <missing>;

public class GlobalMembers
{
	/*
	 * file    competition 1_5
	 * author  ??
	 * date    2010-10-22
	 * description
	           ????????
	*/



	public static int Main()
	{
		int n;
		int i;
		int k;
		int t1;
		int t2;
		int p;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6; i <= n; i = i + 2)
		{
			   for (j = 3; j <= i; j = j + 2)
			   {
				t1 = 0;
				t2 = 0;
				   p = Math.sqrt(j);
				   for (k = 3; k <= p; k = k + 2)
				   {
					if (j % k == 0)
					{
						break;
					}
				   }
				if (k > p)
				{
					t1 = 1;
				}
				 if (t1 == 1)
				 {
					 p = Math.sqrt(i - j);
					for (k = 3; k <= p; k = k + 2)
					{
						   if ((i - j) % k == 0)
						   {
							   break;
						   }
					}
					   if (k > p)
					   {
						   t2 = 1;
					   }
					   if (t2 == 1)
					   {
						   break;
					   }
				 }
			   }
			   System.out.print(i);
			   System.out.print("=");
			   System.out.print(j);
			   System.out.print("+");
			   System.out.print(i - j);
			   System.out.print("\n");
		}
		return 0;
	}
}

