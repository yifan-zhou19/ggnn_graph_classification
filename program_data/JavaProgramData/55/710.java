package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[32]);
		String t = new String(new char[32]);
		double a;
		double b;
		int i;
		int[] m = new int[32];
		int[] c = new int[32];
		int[] d = new int[32];
		int size;
		int k;
		int n10 = 0;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		size = n.length();
		for (i = 0;i < size;i++)
		{
			if (toascii(n.charAt(i)) >= 48 && toascii(n.charAt(i)) <= 57)
			{
				m[i] = toascii(n.charAt(i)) - 48;
			}
			else if (toascii(n.charAt(i)) >= 65 && toascii(n.charAt(i)) <= 90)
			{
				m[i] = toascii(n.charAt(i)) - 55;
			}
			else if (toascii(n.charAt(i)) >= 97 && toascii(n.charAt(i)) <= 122)
			{
				m[i] = toascii(n.charAt(i)) - 87;
			}
		}
			for (i = 0;i < size;i++)
			{
			n10 = n10 + m[i] * Math.pow(a,size - i - 1);
			}
	if (n10 == 0)
	{
	System.out.print(0);
	System.out.print("\n");
	}
		for (i = 0;i < 32;i++)
		{
			if (Math.pow(b,i) > n10)
			{
				k = i;
				break;
			}
		}
			c[0] = n10 / Math.pow(b,k - 1);
				for (i = 1;i < k;i++)
				{
						n10 = n10 - c[i - 1] * Math.pow(b,k - i);
						c[i] = n10 / (Math.pow(b,k - 1 - i));
				}
					for (i = 0;i < k;i++)
					{
						if (c[i] < 10)
						{
							d[i] = c[i] + 48;
						}
						else if (c[i] >= 10)
						{
							d[i] = c[i] + 55;
						}
					}
						for (i = 0;i < k;i++)
						{
							t = tangible.StringFunctions.changeCharacter(t, i, d[i]);
						}
						t = tangible.StringFunctions.changeCharacter(t, k, '\0');
						System.out.print(t);
		return 0;
	}
}

