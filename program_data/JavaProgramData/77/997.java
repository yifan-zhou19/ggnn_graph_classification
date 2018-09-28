package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int len;
		int a;
		int b;
		String str = new String(new char[101]);
		char boy;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		boy = str.charAt(0);
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) != boy)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, '0');
				for (j = i;j > 0;j--)
				{
					if (str.charAt(j) == boy)
					{
						break;
					}
				}
				str = tangible.StringFunctions.changeCharacter(str, j, '0');
				a = j;
				b = i;
				System.out.printf("%d %d\n",a,b);
			}
			else
			{
				continue;
			}
		}
		return 0;
	}


}

