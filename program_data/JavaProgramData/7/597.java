package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int j;
		int k;
		int n1;
		int n2;
		char x;
		String zf = new String(new char[300]);
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		zf = new Scanner(System.in).nextLine();
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		n1 = s1.length();
		n2 = s2.length();
		for (i = 0;i < (zf.length());i++)
		{
			if (zf.charAt(i) == s1.charAt(0) && zf.charAt(i + 1) == s1.charAt(1) && zf.charAt(i + n1 - 1) == s1.charAt(n1 - 1))
			{
				for (k = 0;k < n2;k++)
				{
					zf = tangible.StringFunctions.changeCharacter(zf, i, s2.charAt(k));
					i++;
				}
				break;
			}
		}

		System.out.println(zf);



		return 0;
	}

}

