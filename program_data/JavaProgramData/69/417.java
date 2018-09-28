package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int lena;
		int lenb;
		String a = new String(new char[251]);
		String b = new String(new char[251]);
		int[] na = new int[251];
		int[] nb = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		lena = a.length();
		lenb = b.length();
		for (i = 0; i < lena; ++i)
		{
			na[i] = a.charAt(lena - i - 1) - '0';
		}
		for (i = 0; i < lenb; ++i)
		{
			nb[i] = b.charAt(lenb - i - 1) - '0';
		}
		for (i = 0; i < lena; ++i)
		{
			nb[i] += na[i];
		}
		for (i = 0; i < 251; ++i)
		{
			if (nb[i] > 9)
			{
				nb[i] -= 10;
				nb[i + 1]++;
			}
		}
		for (i = 250; i >= 0; --i)
		{
			if (nb[i] != 0)
			{
				break;
			}
		}
		if (i == -1)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
			for (; i >= 0; --i)
			{
				System.out.print(nb[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}



}

