package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] substr = {0, '\0', '\0', '\0'};
		char max;
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0 && (substr = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			max = str[0]; //?????
			for (i = 0;i < 9;i++)
			{
				if (max < str[i + 1])
				{
					max = str[i + 1];
				}
			}
			for (i = 0;i < 10;i++) //??????????
			{
				if (str[i] == max)
				{
					k = i;
					break;
				}
			}
			for (i = 9;i > k;i--) //?????????????
			{
				str[i + 3] = str[i];
			}
			for (i = k + 1;i <= k + 3;i++) //??????
			{
				str[i] = substr[i - k - 1];
			}
			System.out.print(str);
			System.out.print("\n");
			for (i = 0;i < 10;i++) //??????
			{
				str[i] = 0;
			}
		}
		return 0;
	}
}

