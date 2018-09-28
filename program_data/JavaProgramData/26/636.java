package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100 + 1]);
		int i;
		int j;
		int flag;
		int length;
		int l;
		flag = 0;

		str = new Scanner(System.in).nextLine();
		length = str.length();
		for (i = 0 ; i <= length - 1; i++)
		{
			if (str.charAt(i) == ' ')
			{
				if (flag == 1)
				{
					for (j = i ; j <= length - 1 ; j++)
					{
						str = tangible.StringFunctions.changeCharacter(str, j - 1, str.charAt(j));
					}
					length--;
					i--;
				}
				else
				{
					flag = 1;
				}
			}
			else
			{
				flag = 0;
			}
		}
		for (i = 0 ; i <= length - 1; i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		return 0;
	}









}

