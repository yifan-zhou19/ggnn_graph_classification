package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double length;
	//ab????n?????????????i?????
		String s = new String(new char[256]);
		String s1 = new String(new char[256]);
		int m;
		int i;
		int b;
		int n = 0;
		int w;
		int j;
	//w?????,j?????????
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		length = s.length();
		for (i = 0;i < length;i++)
		{
			m = s.charAt(i);
			if (((m <= 57) && (m >= 48)) == 1)
			{
				m = m - 48;
			}
			if (((m <= 122) && (m >= 97)) == 1)
			{
				m = m - 87;
			}
			if (((m <= 90) && (m >= 65)) == 1)
			{
				m = m - 55;
			}
			n = n + m * Math.pow(a,length - i - 1);
		}
		for (i = 0;i <= 256;i++)
		{
			w = Math.abs(n / b);
			if ((n - (w * b)) <= 9)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, (n - (w * b)) + 48);
			}
	//????????
			else
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, (n - (w * b)) + 55);
			}
			n = w;
			if (w == 0)
			{
			   j = i;
			   break;
			}
	//????
		}
		for (i = j;i >= 0;i--)
		{
	//????
			System.out.print(s1.charAt(i));
		}
		return 0;
	}


}

