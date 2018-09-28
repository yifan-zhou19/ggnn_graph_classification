package <missing>;

public class GlobalMembers
{
	public static void delete3(String t, int length)
	{
		t[length - 3] = '\0';
	}
	public static void delete2(String t, int length)
	{
		t[length - 2] = '\0';
	}

	public static void Main()
	{
		char[][] word = new char[50][30];
		int n;
		int i;
		int j;
		int length;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			length = String.valueOf(word[i]).length();
			if (word[i][length - 1] == 'g')
			{
				delete3(word[i], length);
			}
			else
			{
				delete2(word[i], length);
			}
			System.out.printf("%s",word[i]);
			if (i != n - 1)
			{
				System.out.print("\n");
			}
		}
	}
}

