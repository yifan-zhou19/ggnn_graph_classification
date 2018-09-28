package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String y = new String(new char[256]);
		String z = new String(new char[256]);
		String h = new String(new char[256]);
		String sc = new String(new char[256]);
		y = new Scanner(System.in).nextLine();
		z = new Scanner(System.in).nextLine();
		h = new Scanner(System.in).nextLine();
		int k = 0;
		int count = 0;
		int o;
		int a = y.length();
		int b = z.length();
		int c = h.length();
		for (int i = 0;i < a;i++)
		{
			if (y.charAt(i) == z.charAt(k))
			{
				k++;
				count++;
				if (count == b)
				{
				   break;
				}
			}
			else if (count != b)
			{
				if (count > 0)
				{
					i--;
				}
				count = 0;
				k = 0;
			}
			o = i;
		}
		int e = o - k + 2;
		int f = 0;
		for (int m = 0;m < a;m++)
		{
			if ((m >= e) && (m < e + c))
			{
				 sc = tangible.StringFunctions.changeCharacter(sc, m, h.charAt(f));
				 f++;
			}
			else
			{
				 sc = tangible.StringFunctions.changeCharacter(sc, m, y.charAt(m));
			}
		}
		for (int l = 0;l < a;l++)
		{
				System.out.printf("%c",sc.charAt(l));
		}
		return 0;
	}
}

