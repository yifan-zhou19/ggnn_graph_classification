package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		int[] c = new int[300];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int lena;
		int lenb;
		lena = a.length();
		lenb = b.length();
		int i;
		int k1;
		int k2;
		int k;
		k1 = lena - 1;
		k2 = lenb - 1;
		k = 0;
		for (i = 299;i >= 0;i--)
		{
			if (k1 < 0 && k2 < 0)
			{
				break;
			}
			if (k1 >= 0 && k2 >= 0)
			{
				c[i] += (a.charAt(k1) - '0') + (b.charAt(k2) - '0');
			}
			if (k1 >= 0 && k2 < 0)
			{
				c[i] += a.charAt(k1) - '0';
			}
			if (k1 < 0 && k2 >= 0)
			{
				c[i] += b.charAt(k2) - '0';
			}
			if (c[i] >= 10)
			{
				c[i] = c[i] % 10;
				c[i - 1] = 1;
			}
			k1--;
			k2--;

		}
		k = -1;
		for (i = 0;i < 300;i++)
		{
			if (c[i] != 0)
			{
				k = i;
				break;
			}
		}
		if (k == -1)
		{
			System.out.print('0');
			System.out.print("\n");
		}
		else
		{
			for (i = k;i < 300;i++)
			{
				System.out.print(c[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

