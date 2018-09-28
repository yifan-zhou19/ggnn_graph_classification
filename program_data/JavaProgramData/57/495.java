package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void cut1(char a[],int b);
		void cut2(char a[],int b);
		String word = new String(new char[32]);
		int n;
		int i;
		int a;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= 31;j++)
			{
			word = tangible.StringFunctions.changeCharacter(word, j, '\0');
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			a = word.length();
			if (word.charAt(a - 3) == 'i')
			{
				cut1(word, a);
			}
			if (word.charAt(a - 2) == 'l' || word.charAt(a - 2) == 'e')
			{
				cut2(word, a);
			}
			System.out.printf("%s\n",word);
		}
		return 0;
	}
	public static void cut1(String a, int b)
	{
		a[b - 3] = '\0';
	}
	public static void cut2(String a, int b)
	{
		a[b - 2] = '\0';
	}
}

