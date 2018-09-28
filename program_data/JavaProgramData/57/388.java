package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int m;
		char[][] word = new char[101][101];
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
			a[i] = String.valueOf(word[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (word[i][a[i] - 1] == 'r')
			{
				if (word[i][a[i] - 2] == 'e')
				{
					word[i][a[i] - 2] = '\0';
					System.out.printf("%s\n",word[i]);
				}
			}
			if (word[i][a[i] - 1] == 'g')
			{
				if (word[i][a[i] - 2] == 'n')
				{
					if (word[i][a[i] - 3] == 'i')
					{
						word[i][a[i] - 3] = '\0';
						System.out.printf("%s\n",word[i]);
					}
				}
			}
			if (word[i][a[i] - 1] == 'y')
			{
				if (word[i][a[i] - 2] == 'l')
				{
						word[i][a[i] - 2] = '\0';
						System.out.printf("%s\n",word[i]);
				}
			}
		}
		return 0;
	}
}

