package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] substr =
		{
			{0, '\0', '\0', '\0'}
		};
		char[][] ans =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i = 0;
		int j;
		int max = 0;
		int index;
		int n = 0;
		for (j = 0; scanf("%s %s", str[j], substr[j]) != EOF; j++)
		{
			n++;
		}
		for (j = 0; j < n; j++)
		{
				max = 0;
				for (i = 0; i < 10; i++)
				{
					if (str[j][i] > max)
					{
					  max = str[j][i];
					  continue;
					}
				}
				for (i = 0; i < 10; i++)
				{
					if (str[j][i] == max)
					{
					   index = i;
					   break;
					}
				}
				for (i = 0; i < index + 1; i++)
				{
					ans[j][i] = str[j][i];
				}
				for (i = index + 1; i < index + String.valueOf(substr[j]).length() + 1; i++)
				{
					ans[j][i] = substr[j][i - index - 1];
				}
				for (i = index + String.valueOf(substr[j]).length() + 1; i < String.valueOf(str[j]).length() + String.valueOf(substr[j]).length(); i++)
				{
					ans[j][i] = str[j][i - String.valueOf(substr[j]).length()];
				}
				System.out.println(ans[j]);
		}
			return 0;
	}

}
