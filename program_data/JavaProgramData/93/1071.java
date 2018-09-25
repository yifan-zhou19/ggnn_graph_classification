package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{ //?????
		int k;
		int a;
		int b;
		int c;
		char n; //????k(?????),a,b,c(???3,5,7????),n
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = k % 3;
		b = k % 5;
		c = k % 7;
		if (a == 0)
		{
			if (b == 0)
			{
				if (c == 0)
				{
					System.out.print(3);
					System.out.print(" ");
					System.out.print(5);
					System.out.print(" ");
					System.out.print(7);
				}
				else
				{
					System.out.print(3);
					System.out.print(" ");
					System.out.print(5);
				}
			}
			else
			{
				if (c == 0)
				{
					System.out.print(3);
					System.out.print(" ");
					System.out.print(7);
				}
				else
				{
					System.out.print(3);
				}
			}
		}
		else
		{
			if (b == 0)
			{
				if (c == 0)
				{
					System.out.print(5);
					System.out.print(" ");
					System.out.print(7);
				}
				else
				{
					System.out.print(5);
				}
			}
			else
			{
				if (c == 0)
				{
					System.out.print(7);
				}
				else
				{
					System.out.print('n');
				}
			}
		}
		return 0;
	} //?????
}

