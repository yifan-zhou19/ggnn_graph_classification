package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????? **
	//*?????1300062805 **
	//*???2013.10.27 **
	//********************************
	public static int Main()
	{
		int m;
		int a;
		int b;
		int c;
		int d;
		int e;
		int i;
		int n;
		int p;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3; i <= m / 2; i += 2) // ??????
		{
			n = (int)Math.sqrt(i);
			a = 2;
			while (a <= n)
			{
				p = i % a;
				if (p == 0)
				{
					break; // ???????
				}
				a++;

			}
			if (a == n + 1) // ????????
			{
				c = m - i;
				d = (int)Math.sqrt(c);
				for (a = 2; a <= d; a++) // ??????
				{

				e = c % a;
				if (e == 0)
				{
					break;
				}
				}
				if (a == d + 1)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(c);
					System.out.print("\n");
				}
			}
		}
	return 0;
	}



}

