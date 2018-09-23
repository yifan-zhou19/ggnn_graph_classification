package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		char[] kuohao = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int j;
		int len;
		char ch;
		while (scanf("%s",s) > 0)
		{
			for (i = 0; ;i++)
			{
				if (s.charAt(i) == '(')
				{
					kuohao[i] = 1;
				}
				else if (s.charAt(i) == ')')
				{
					for (j = i;j >= 0;j--)
					{
						if (kuohao[j] == 1)
						{
							kuohao[j] = 0;
							break;
						}
					}
					if (j < 0)
					{
						kuohao[i] = 3;
					}
				}
				else if (s.charAt(i) == '\0')
				{
					break;
				}
			}
		System.out.printf("%s\n",s);
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (kuohao[i] == 0)
			{
				System.out.print(" ");
			}
			else if (kuohao[i] == 1)
			{
				System.out.print("$");
			}
			else if (kuohao[i] == 3)
			{
				System.out.print("?");
			}
		}
		System.out.print("\n");
		for (i = 0;i < len;i++)
		{
			kuohao[i] = 0;
		}
		}
		return 0;
	}

}
