package <missing>;

public class GlobalMembers
{
	public static void change(String[] word, String a, String b)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			if (i > 0)
			{
				System.out.print(" ");
			}
			if (strcmp(word[i],a) == 0)
			{
				System.out.printf("%s",b);
			}
			else
			{
				System.out.printf("%s",word[i]);
			}
		}
	}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static void getword(char * p, String[] word)
	{
		int i;
		int j = 0;
		for (i = 0; * p != '\0';i++)
		{
			while (*p == ' ')
			{
				p += 1;
			}
			j = 0;
			while (*p != ' ' && *p != '\0')
			{
				word[i][j] = p;
				j += 1;
				p += 1;

			}
			n += 1;
		}
	}
	public static int n = 0;
	public static void Main()
	{
		String s = new String(new char[100]);
		final String word = "";
		String a = new String(new char[10]);
		String b = new String(new char[10]);
		String p = s;
		s = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		getword(p, word);
		change(word, a, b);
	}
}

