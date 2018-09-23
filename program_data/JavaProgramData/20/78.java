package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void insert(char str[],char temp[4]);
		final String str = "";
		String temp = new String(new char[4]);
		int i;
		int j;
		char c;

		for (i = 0;;i++)
		{
			if ((c = System.in.read()) == EOF)
			{
				break;
			}
			else
			{
				str.charAt(i)[0] = c;
				for (j = 1;;j++)
				{
					if ((c = System.in.read()) == ' ')
					{
						break;
					}
					str.charAt(i)[j] = c;
				}
			}
			temp = new Scanner(System.in).nextLine();
			insert(str.charAt(i), temp);
			System.out.printf("%s\n",str.charAt(i));
		}
	}

	public static void insert(String str, String temp)
	{
		int i;
		int j = 0;
		int temp2 = str.length();
		for (i = 1;i < temp2;i++)
		{
			if (str[i].compareTo(str[j]) > 0)
			{
				j = i;
			}
		}
		for (i = (str.length()) - 1;i > j;i--)
		{
			str[i + 3] = str[i];
		}
		for (i = 0;i < 3;i++)
		{
			str[j + i + 1] = temp[i];
		}
	}
}
