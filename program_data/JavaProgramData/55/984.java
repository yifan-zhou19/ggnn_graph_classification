package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *
	 *  ??: 2010-11-12
	 *      Author: ??
	 */

	public static int Main()
	{
		int a;
		int b;
		int i = 0;
		int j = 0;
		int t = 0;
		double p;
		double l;
		String n = new String(new char[100]);
		String m = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = n.length();
		for (i = 0;i < l;i++)
		{
			{
				if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
				{
			p = n.charAt(i) - 55;
				}
		else if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
		{
			p = n.charAt(i) - 87;
		}
		else
		{
			p = n.charAt(i) - 48;
		}
		}
			t += p * Math.pow((double)a,l - i - 1.0);
		}
		while (t / b != 0)
		{
				m = tangible.StringFunctions.changeCharacter(m, j, t % b);
			t = t / b;
			j++;
		}
			m = tangible.StringFunctions.changeCharacter(m, j, t % b);

			while (j >= 0)
			{
				if (m.charAt(j) > 9)
				{
					(char)(m.charAt(j) += 55);
				}
			else
			{
				(char)(m.charAt(j) += 48);
			}
				System.out.print(m.charAt(j));
				j--;
			}
		return 0;
	}
}

