package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[50][50];
		int n;
		int i;
		int len;
		int j;
		int[] out = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
			len = String.valueOf(word[i]).length();
			if (word[i][len - 1] == 'r')
			{
				out[i] = 1;
			}
			else if (word[i][len - 1] == 'y')
			{
				out[i] = 2;
			}
			else if (word[i][len - 1] == 'g')
			{
				out[i] = 3;
			}
		}
		for (i = 1;i <= n;i++)
		{
			len = String.valueOf(word[i]).length();
			if (out[i] == 1 || out[i] == 2)
			{
				word[i][len - 2] = 0;
				word[i][len - 1] = 0;
				System.out.printf("%s", word[i]);
			}
			if (out[i] == 3)
			{
				word[i][len - 3] = 0;
				word[i][len - 2] = 0;
				word[i][len - 1] = 0;
				System.out.printf("%s", word[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

