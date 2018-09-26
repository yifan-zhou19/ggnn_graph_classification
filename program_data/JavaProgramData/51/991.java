package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int chsum = 0;
		int l = 0;
		int t = 0;
		int maxnum = 1;
		int[] a = new int[600];
		char[][] ch = new char[600][10];
		String ch1 = new String(new char[700]);
		String temp = new String(new char[10]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ch1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = ch1.length();
		for (k = 0;k <= l - n;k++)
		{
			for (j = 0;j < n;j++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, j, ch1.charAt(k + j));
			}
			t = 0;
			for (i = 1;i <= chsum;i++)
			{
				t = 1;
				for (j = 0;j < n;j++)
				{
					if (ch[i][j] != temp.charAt(j))
					{
						t = 0;
						break;
					}
				}
				if (t == 1)
				{
					a[i]++;
					if (a[i] > maxnum)
					{
						maxnum = a[i];
					}
					break;
				}
			}
			if (t == 0)
			{
				chsum++;
				for (i = 0;i < n;i++)
				{
					ch[chsum][i] = temp.charAt(i);
				}
				a[chsum]++;
			}
		}
		if (maxnum > 1)
		{
		System.out.print(maxnum);
		System.out.print("\n");
		for (i = 1;i <= chsum;i++)
		{
			if (a[i] == maxnum)
			{
				for (j = 0;j < n;j++)
				{
					System.out.print(ch[i][j]);
				}
				System.out.print("\n");
			}
		}
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

