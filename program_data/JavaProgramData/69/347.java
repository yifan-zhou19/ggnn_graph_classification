package <missing>;

public class GlobalMembers
{
	public static String m = new String(new char[1000]);
	public static String n = new String(new char[1000]);
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int lenm;
		int lenn;
		int[] km = new int[1000];
		int[] kn = new int[1000];
		char s;
		m = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		lenm = m.length();
		lenn = n.length();
		for (i = lenm - 1;i >= 0;i--)
		{
			km[j++] = m.charAt(i) - '0';
		}
		for (i = lenn - 1,j = 0;i >= 0;i--,j++)
		{
			kn[j] = n.charAt(i) - '0';
		}
			for (i = 0;i < lenm || i < lenn;i++)
			{
				kn[i] += km[i];
				if (kn[i] >= 10)
				{
					kn[i] -= 10;
					kn[i + 1] += 1;
				}
			}
			for (i = 0;i < lenn || i < lenm;i++)
			{
				n = tangible.StringFunctions.changeCharacter(n, i, '0' + kn[i]);
			}
			if (kn[i] != 0)
			{
				n = tangible.StringFunctions.changeCharacter(n, i++, '0' + kn[i]);
			}
			n = tangible.StringFunctions.changeCharacter(n, i, '\0');
			i--;
			int flag = 0;
			for (;i >= 0;i--)
			{
				if (flag == 0 && n.charAt(i) == '0')
				{
					continue;
				}
				flag = 1;
				System.out.print(n.charAt(i));
			}
			if (flag == 0)
			{
				System.out.print(0);
			}
			System.out.print("\n");
			return 0;
	}
}

