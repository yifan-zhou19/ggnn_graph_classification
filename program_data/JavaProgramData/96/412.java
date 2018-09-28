package <missing>;

public class GlobalMembers
{
	//****************************************
	//*??:   ??13     ** 
	//*??: ???      		    **
	//*???2011  11 08              **
	//****************************************
	public static int Main()
	{
		String number = new String(new char[101]);
		int[] a = new int[101];
		int lenth;
		int[] b = new int[101];
		int i;
		int j;
		int s;
		s = 0;
		number = ConsoleInput.readToWhiteSpace(true).charAt(0);
		lenth = number.length();
		for (i = 0 ; i <= lenth - 1 ; i++)
		{
			a[i] = number.charAt(i) - '0';
		}

		for (i = 0 ; i <= lenth - 1 ; i++)
		{
			s = s * 10 + (a[i] % 13);
			b[i] = s / 13;
			s = s % 13;
		}
		for (i = 0 ; i <= lenth - 1 ; i++)
		{
			if (b[i] != 0)
			{
				break;
			}
		}

		if (i >= lenth)
		{
			System.out.print(0);
		}
		else
		{
			for (j = i ; j <= lenth - 1 ; j++)
			{
			System.out.print(b[j]);
			}
		}
			System.out.print("\n");
			System.out.print(s);
			System.out.print("\n");

			return 0;
	}
}

