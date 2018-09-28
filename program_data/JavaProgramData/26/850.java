package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		int i;
		int p;
		int n = 0;
		int j;
		int end = 0;
		int duoyu = 0;
		str = new Scanner(System.in).nextLine();
		p = str.length() + 1;
		for (i = 0;i < p;i++)
		{
			if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ')
			{
				end++;
			}
		}
		for (i = 0;i < p;i++)
		{
			if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ')
			{
				duoyu++;
			}
			else if (str.charAt(i + 1) != ' ')
			{
				for (j = i;j < p;j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, j + 1 - duoyu, str.charAt(j + 1));
				}
				//printf("%s\n",str);
				//printf("%d\n",duoyu);
				i = i - duoyu;
				duoyu = 0;
			}
		}
		//str[p-end]='\0';
		System.out.printf("%s",str);
		return 0;
	}
}

