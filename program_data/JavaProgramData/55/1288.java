package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int k;
		int p;
		int q;
		int ln;
		int lm;
		int sum = 0;
		String n = new String(new char[101]);
		char[] m = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ln = n.length();
		if (a <= 10)
		{
			for (i = 0; i <= ln - 1; i++)
			{
				sum = sum * a + n.charAt(i) - '0';
			}
		}
		else if (a > 10)
		{
			for (i = 0; i <= ln - 1; i++)
			{

				if ((n.charAt(i) <= 'z') && (n.charAt(i) >= 'a'))
				{
					n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 'a' + 'A');
				}
				if ((n.charAt(i) <= 'Z') && (n.charAt(i) >= 'A'))
				{
					sum = sum * a + n.charAt(i) + 10 - 'A';
				}
				if ((n.charAt(i) <= '9') && (n.charAt(i) >= '0'))
				{
					sum = sum * a + n.charAt(i) - '0';
				}
			}
		}
		if (b <= 10)
		{
			for (i = 0; ; i++)
			{
				m[i] = sum % b + '0';
				sum = sum / b;
				if (sum == 0)
				{
					break;
				}
			}
			lm = m.length();
			for (i = lm - 1; i >= 0; i--)
			{
				System.out.print(m[i]);
			}
		}
		if (b > 10)
		{
			for (i = 0; ; i++)
			{
				if ((sum % b) >= 10)
				{
					m[i] = sum % b - 10 + 'A';
					sum = sum / b;
					if (sum == 0)
					{
						break;
					}
				}
				else if ((sum % b) < 10)
				{
						 m[i] = sum % b + '0';
						 sum = sum / b;
						 if (sum == 0)
						 {
							 break;
						 }
				}
			}
			lm = m.length();
			for (i = lm - 1; i >= 0; i--)
			{
				System.out.print(m[i]);
			}
		}






		return 0;
	}
}

