package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int i;
		int len;
		int k;
		int j;
		int len1;
		int len2;
		int l;
		int n;
		int p = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		len = s.length();
		len1 = a.length();
		len2 = b.length();
		for (i = 0;s.charAt(i) != 0;i++)
		{
			if (s.charAt(i) == a.charAt(0) && p == 0)
			{
				k = 0;
				while (s.charAt(i + k) == a.charAt(k) && k < len1)
				{
					k++;

				}
				if (k == len1)
				{
					p = 1;

					len = s.length();
					len1 = a.length();
					len2 = b.length();
					if (len1 == len2)
					{
						for (j = 0;j < k;j++)
						{
							s = tangible.StringFunctions.changeCharacter(s, i + j, b.charAt(j));
						}
					}
					if (len1 > len2)
					{
						for (j = 0;j < len1;j++)
						{
								s = tangible.StringFunctions.changeCharacter(s, i + j, b.charAt(j));
						}
						for (j = len2,l = k;(l + i) <= len;j++,l++)
						{
							s = tangible.StringFunctions.changeCharacter(s, i + j, s.charAt(i + l));
						}
					}
					if (len1 < len2)
					{
						len = s.length();
						n = len2 - len1;
						for (l = len;l >= (i + k);l--)
						{
							s = tangible.StringFunctions.changeCharacter(s, l + n, s.charAt(l));
						}
						for (j = 0;j < len2;j++)
						{
							s = tangible.StringFunctions.changeCharacter(s, i + j, b.charAt(j));
						}


					}
				}
			}
		}
		System.out.println(s);
		return 0;


	}

}

