package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] len = new int[MAX1];
		int line = 0;
		char[][] word = new char[MAX1][MAX2];

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
			len[i] = String.valueOf(word[i]).length();
		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%s",word[i]);
			line += len[i];
			if (line+1 + len[i + 1] > 80)
			{
				System.out.print('\n');
				line = 0;
			}
			else if (i < n - 1)
			{
				System.out.print(' ');
				line++;
			}
		}
	}
}

