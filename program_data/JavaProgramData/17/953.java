package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		int[] flag = new int[101];
		int i;
		int j;
		int k;
		int len;
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			for (i = 0; i < 101; i++)
			{
				flag[i] = 0;
			}
			len = str.length();
			for (i = len - 2; i >= 0; i--)
			{
				if (str.charAt(i) == '(')
				{
					for (j = i + 1; j < len; j++)
					{
						if (str.charAt(j) == ')' && flag[j] == 0)
						{
							flag[j] = 1;
							flag[i] = 1;
							break;
						}
					}
				}
			}
			System.out.print(str);
			System.out.print("\n");
			for (i = 0; i < len; i++)
			{
				if (str.charAt(i) != '(' && str.charAt(i) != ')')
				{
					System.out.print(" ");
				}
				else
				{
					if (str.charAt(i) == '(' && flag[i] == 0)
					{
						System.out.print("$");
					}
					if (str.charAt(i) == '(' && flag[i] == 1)
					{
						System.out.print(" ");
					}
					if (str.charAt(i) == ')' && flag[i] == 0)
					{
						System.out.print("?");
					}
					if (str.charAt(i) == ')' && flag[i] == 1)
					{
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

