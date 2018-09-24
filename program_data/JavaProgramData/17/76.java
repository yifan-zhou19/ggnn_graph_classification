package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String z = new String(new char[101]);
		int i;
		int j;
		int[] l = new int[101];
		int[] r = new int[101];
		while (scanf("%s",z) != EOF)
		{
			for (i = 0;i < 101;i++)
			{
				l[i] = 0;
				r[i] = 0;
			}
			for (i = 0;i < z.length();i++)
			{
				if (z.charAt(i) == '(')
				{
					l[i] = 1;
				}
				if (z.charAt(i) == ')')
				{
					r[i] = 1;
				}
			}
			for (i = 0;i < z.length();i++)
			{
				if (l[i] == 1)
				{
					for (j = i + 1;j < z.length();j++)
					{
						if (l[j] == 1)
						{
							l[i]++;
						}
						if (r[j] == 1)
						{
							l[i]--;
						}
						if (l[i] == 0)
						{
							r[j] = 0;
							break;
						}
					}
				}
			}
			System.out.printf("%s\n",z);
			for (i = 0;i < z.length();i++)
			{
				if (l[i] != 0)
				{
					System.out.print("$");
				}
				else if (r[i] != 0)
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}
