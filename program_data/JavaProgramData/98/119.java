package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int temp;
		char[][] word =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};

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

		i = 0;
		temp = String.valueOf(word[0]).length() + 1;
		while (i < n)
		{


				if (temp + String.valueOf(word[i + 1]).length() <= 80)
				{
					if (i == n - 1)
					{
						 System.out.printf("%s",word[i]);
					}
					else
					{
						System.out.printf("%s ",word[i]);
					}
					i = i + 1;
					temp = temp + String.valueOf(word[i]).length() + 1;
				}
				else
				{
				System.out.printf("%s\n",word[i]);
				i = i + 1;
				temp = String.valueOf(word[i]).length() + 1;
				}

		}
	}
}

