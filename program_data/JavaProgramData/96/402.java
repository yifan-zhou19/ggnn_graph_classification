package <missing>;

public class GlobalMembers
{
	//*************************
	//?????13
	//?????
	//???2011-11-7
	//*************************
	public static int Main()
	{
		String a = new String(new char[100]); //?????????????
		int[] b = new int[100]; //???????
		int n = 0;
		int k;
		int r;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (k = 0;a.charAt(k) != '\0';k++) //????????
		{
			n++;
		}
		if (n == 1) //???????????????
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(a.charAt(0));
		}
		else if (n == 2) //???????????????
		{
			r = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0';
			b[0] = r / 13;
			r = r % 13;
			System.out.print(b[0]);
			System.out.print("\n");
			System.out.print(r);
		}
		else if ((a.charAt(0) - '0') * 10 + a.charAt(1) - '0' >= 13) //??????????????????????13????????????
		{
			r = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0'; //?r???
			for (k = 1;k <= n - 2;k++)
			{
				b[k] = r / 13; //?????????????????b?
				r = r % 13 * 10 + a.charAt(k + 1) - '0'; //???
			}
			b[n - 1] = r / 13; //???????
			r = r % 13; //?????????
			for (k = 1;k <= n - 1;k++)
			{
				System.out.print(b[k]);
			}
			System.out.print("\n");
			System.out.print(r);
		}
		else
		{
			r = (a.charAt(0) - '0') * 100 + (a.charAt(1) - '0') * 10 + a.charAt(2) - '0'; //??????13????????r
			for (k = 2;k <= n - 2;k++)
			{
				b[k] = r / 13;
				r = r % 13 * 10 + a.charAt(k + 1) - '0';
			}
			b[n - 1] = r / 13;
			r = r % 13;
			for (k = 2;k <= n - 1;k++)
			{
				System.out.print(b[k]);
			}
			System.out.print("\n");
			System.out.print(r);
		}
		return 0;
	}
}

