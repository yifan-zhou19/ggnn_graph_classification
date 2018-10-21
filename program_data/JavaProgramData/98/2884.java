package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] word = new char[2000][1000];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
		}
		int start = 0;
		int count = 0;
		for (int i = 0;i < n;i++)
		{
			count = count + String.valueOf(word[i]).length();
			if (count + i - start > 80)
			{
				for (int j = start;j <= i - 2;j++)
				{
				System.out.printf("%s ",word[j]);
				}
				System.out.printf("%s\n",word[i - 1]);
				start = i;
				i = i - 1;
				count = 0;
			}
			if (i == n - 1 && count + i - start < 80)
			{
				for (int j = start;j <= i - 1;j++)
				{
				System.out.printf("%s ",word[j]);
				}
				System.out.printf("%s",word[i]);
			}
		}
		return 0;
	}
}

