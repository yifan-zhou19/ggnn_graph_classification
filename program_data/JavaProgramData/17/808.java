package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String str = "0";
		int i;
		int j;
		int len;
		int zuo;
		int you;
		int[] a = new int[100];
		while (scanf("%s",str) != EOF)
		{
			len = str.length();
			for (i = 0;i < len;i++)
			{
				a[i] = 0;
			}
			for (i = len - 1;i >= 0;i--)
			{
				if (str.charAt(i) == '(')
				{
					zuo = 0;
					you = 0;
					for (j = i + 1;j < len;j++)
					{
						if (str.charAt(j) == '(' && a[j] != 1)
						{
							zuo++;
						}
						else if (str.charAt(j) == ')')
						{
							you++;
						}
					}
					if (you < zuo + 1)
					{
						a[i] = 1;
					}
				}
			}
			for (i = 0;i < len;i++)
			{
				if (str.charAt(i) == ')')
				{
					zuo = 0;
					you = 0;
					for (j = 0;j < i;j++)
					{
						if (str.charAt(j) == '(')
						{
							zuo++;
						}
						else if (str.charAt(j) == ')' && a[j] != -1)
						{
							you++;
						}
					}
					if (zuo < you + 1)
					{
						a[i] = -1;
					}
				}
			}
			System.out.printf("%s\n",str);
			for (i = 0;i < len;i++)
			{
				if (a[i] == 0)
				{
					System.out.print(" ");
				}
				else if (a[i] == 1)
				{
					System.out.print("$");
				}
				else
				{
					System.out.print("?");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}


}
