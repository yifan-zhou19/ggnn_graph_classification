package <missing>;

public class GlobalMembers
{
	//***************************************
	//** ????????? **
	//** ?????? 1300012722 **
	//** ???2013.10.24 **
	//***************************************
	public static int Main()
	{
		int m; //????m??????a?b?????c?d?
		int a;
		int b;
		int c;
		int d;
		int i;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 3; a < m; a = a + 2)
		{
			b = m - a;
			if (b < a)
			{
				break; //??b>a,????
			}
			c = Math.sqrt(a); //?a????
			for (i = 2; i <= c; i++)
			{
				if (a % i == 0)
				{
					break;
				}
			}
			if (i > c) //??a??????b?????
			{
				d = Math.sqrt(b);
			for (k = 2; k <= d; k++)
			{
				if (b % k == 0)
				{
					break;
				}
			}
			if (k > d) //??b???????a?b??
			{
				System.out.print(a);
				System.out.print(" ");
				System.out.print(b);
				System.out.print("\n");
			}
			}
		}
		return 0;
	}
}

