package <missing>;

public class GlobalMembers
{
	public static int lenA;
	public static int lenB;
	public static int maxLen;
	public static void change(String a, int len) //??????????
	{
		int q;
		for (int i = 0;i < len / 2;i++)
		{
			if (len - i - 1 == i)
			{
				break;
			}
			else
			{
				q = a[i];
			a[i] = a[len - i - 1];
			a[len - i - 1] = q;

			}
		}
	}

	public static int add(String c, String d, int x, String s) //???????????
	{
		if (c[x] - '0' + d[x] - '0' < 10 != null)
		{
			s[x] = c[x] - '0' + d[x];
			if (x >= maxLen - 1)
			{
				return 0; //??????????
			}
		}
		else
		{
			s[x] = c[x] - '0' + d[x] - 10; //????????
			c[x + 1] = c[x + 1].Substring(1);
			if (x >= maxLen - 1)
			{
				s[x + 1] = s[x + 1].Substring(1);
				maxLen++;
				return 0;
			}
		}
		return add(c, d, x + 1, s);
	}
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		for (int i = 0; i < 300; i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, b[i] = c[i] = '0');
		}
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		lenA = a.length();
		lenB = b.length();
		maxLen = lenA > lenB != 0 ? lenA : lenB;
		a = tangible.StringFunctions.changeCharacter(a, lenA, b[lenB] = '0');
		change(a, lenA);
		change(b, lenB);
		add(a, b, 0, c);
		for (int i = maxLen - 1;i >= 0;i--) //?c????
		{
				if (i == maxLen - 1 && i != 0 && c.charAt(i) == '0')
				{
					continue;
				}
				System.out.print(c.charAt(i));
		}
	}

}

