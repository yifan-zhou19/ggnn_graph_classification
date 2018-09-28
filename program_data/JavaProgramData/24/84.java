package <missing>;

public class GlobalMembers
{
	public static short IsAlpha(char ch)
	{
		if (ch >= 'a' && ch <= 'z')
		{
			return 1;
		}
		if (ch >= 'A' && ch <= 'Z')
		{
			return 1;
		}
		return 0;
	}

	public static int Main()
	{
		String input = new String(new char[500]);
		char[][] word = new char[50][20];
		int max = 0;
		int min = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pstr = input;
		int n = 0;
		int i;

		input = new Scanner(System.in).nextLine();
		while (*pstr != null)
		{
			while (IsAlpha(*pstr) == 0)
			{
				pstr++;
			}
			sscanf(pstr, "%s", word[n]);
			pstr += String.valueOf(word[n]).length();
			n++;
		}

		for (i = 1; i < n; i++)
		{
			if (String.valueOf(word[i]).length() > String.valueOf(word[max]).length())
			{
				max = i;
			}
			if (String.valueOf(word[i]).length() < String.valueOf(word[min]).length())
			{
				min = i;
			}
		}

		System.out.println(word[max]);
		System.out.println(word[min]);

		return 0;
	}
}
