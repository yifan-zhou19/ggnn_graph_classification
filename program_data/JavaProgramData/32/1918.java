package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int e;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int[] c = new int[101]; //??????
		int[] d = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			int t;
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (i = 0;i <= (a.length() - 1) / 2;i++)
			{
				t = a.charAt(i);
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(a.length() - 1 - i));
				a = tangible.StringFunctions.changeCharacter(a, a.length() - 1 - i, t);
			}
			for (i = 0;i <= (b.length() - 1) / 2;i++)
			{
					t = b.charAt(i);
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(b.length() - 1 - i));
					b = tangible.StringFunctions.changeCharacter(b, b.length() - 1 - i, t);
			} //?????

			/*		strrev(a);
					strrev(b);????wtf???????????????
			 */
			for (i = 0;i < (int)a.length();i++) //??????
			{
				c[i] = a.charAt(i) - 48;
			}
			for (i = 0;i < (int)b.length();i++)
			{
				d[i] = b.charAt(i) - 48;
			}
			for (i = 0;i < (int)b.length();i++) //???
			{
				c[i] -= d[i];
			}
			for (i = 0;i < (int)a.length();i++) //??
			{
				if (c[i] < 0)
				{
					c[i] += 10;
					c[i + 1]--;
				}
			}
			l = 0,e = 0;
			for (i = (int)a.length() - 1;i >= 0;i--) //????
			{
				if ((c[i] == 0) && (e == 0))
				{
					continue;
				}
				l++;
				e = 1;
			}
			if (l == 0)
			{
				l++;
			}
			for (i = l - 1;i >= 0;i--) //??
			{
				System.out.print(c[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

