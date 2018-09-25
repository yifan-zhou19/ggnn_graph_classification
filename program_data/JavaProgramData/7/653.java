package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			String str = new String(new char[256]);
			String zc = new String(new char[50]);
			String th = new String(new char[50]);
			int i;
			int j;
			int t = 0;
			int n;
			int m;
			str = new Scanner(System.in).nextLine();
			zc = new Scanner(System.in).nextLine();
			th = new Scanner(System.in).nextLine();
			n = zc.length();
			m = th.length();
			for (i = 0;str.charAt(i) != '\0';i++)
			{
				if (str.charAt(i) == zc.charAt(0))
				{
					for (j = 1;j < n;j++)
					{
						if (str.charAt(i + j) == zc.charAt(j))
						{
						   j++;
						   t = 1;
						   continue;
						}
						else
						{
							t = 0;
						}
							break;
					}
				}
				if (t != 0)
				{
					for (j = 0;j < m;j++)
					{
					str = tangible.StringFunctions.changeCharacter(str, i + j, th.charAt(j));
					}

				   break;
				}

			}

			System.out.println(str);



			return 0;
	}
}

