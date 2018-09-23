package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[100][100];
		int[] c = new int[100]; //?-1?1??0
		int i;
		int j;
		int k = 0;
		while ((scanf("%s",s[k])) != EOF)
		{
			System.out.println(s[k]);
			for (i = 0;i < String.valueOf(s[k]).length();i++)
			{
				if (s[k][i] == '(')
				{
					c[i] = -1;
				}
				else if (s[k][i] == ')')
				{
					c[i] = 1;
				}
				else
				{
					c[i] = 0;
				}
			}
			for (i = 1;i < String.valueOf(s[k]).length();i++) //??i??????????
			{
				for (j = 0;j < String.valueOf(s[k]).length() - i;j++)
				{
					if (c[j] == -1 && c[j + i] == 1)
					{
						c[j] = 0;
						c[j + i] = 0;
					}
				}
			}
			for (i = 0;i < String.valueOf(s[k]).length();i++)
			{
				if (c[i] == 0)
				{
					System.out.print(" ");
				}
				else if (c[i] == -1)
				{
					System.out.print("$");
				}
				else if (c[i] == 1)
				{
					System.out.print("?");
				}
			}
			System.out.print("\n");
			k++;
		}
		return 0;
	}
}
