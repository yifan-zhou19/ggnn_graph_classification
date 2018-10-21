package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int[] pro = new int[101];
		int j = 0;
		int p = 0;
		int q = 0;
		while (gets(str))
		{
			for (int i = 1;i <= str.length();i++)
			{
				if (str[i - 1] != '(' && str[i - 1] != ')')
				{
					pro[i - 1] = 2;
				}
				if (str[i - 1] == ')')
				{
					pro[i - 1] = 1;
					for (j = i - 1;j >= 1;j--)
					{
						if (str[j - 1] == '(' && pro[j - 1] == 0)
						{
							pro[j - 1] = 1;
							break;
						}
					}
					if (j == 0)
					{
						pro[i - 1] = 0;
					}
				}
			}
			System.out.print(str);
			System.out.print("\n");
			for (p = str.length();p >= 1;p--)
			{
				if (pro[p - 1] == 0)
				{
					break;
				}
			}
			for (q = 1;q <= str.length();q++)
			{
				if (pro[q - 1] == 0)
				{
					break;
				}
			}
			for (int k = q;k <= p;k++)
			{
				if (str[k - 1] == '(' && pro[k - 1] == 0)
				{
					System.out.print("$");
				}
				else if (str[k - 1] == ')' && pro[k - 1] == 0)
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
			for (int clear = 1;clear <= 101;clear++)
			{
				str[clear - 1] = 0;
				pro[clear - 1] = 0;
			}
		}
		return 0;
	}
}
