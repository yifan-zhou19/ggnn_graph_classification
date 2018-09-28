package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = char * str;
		int t;
		int i;
		char[][] str = new char[100][100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < t;i++)
		{
			f(str[i]);
		}
		return 0;
	}
	public static int f(tangible.RefObject<String> str)
	{
		int[] letter = new int[26];
		int i;
		int p = 0;
		char c;
		for (i = 0;i < 26;i++)
		{
			letter[i] = 0;
		}
		for (i = 0; * (str.argValue.Substring(i)) != '\0';i++)
		{
			c = (str.argValue.Substring(i));
			letter[c - 97]++;
		}
		for (i = 0; * (str.argValue.Substring(i)) != 0;i++)
		{
			c = (str.argValue.Substring(i));
			if (letter[c - 97] == 1)
			{
				System.out.printf("%c\n",c);
				p = 1;
				break;
			}
		}
		if (p == 0)
		{
			System.out.print("no\n");
		}
		return 0;
	}

}

