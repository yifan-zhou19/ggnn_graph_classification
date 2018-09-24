package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String t = new String(new char[101]);
		int i;
		int j;
		int k;
		int c;
		int[] b = new int[101];
		int n;
		for ((a; = ConsoleInput.readToWhiteSpace(true)).length() > 0)
		{
			n = a.length();
			for (i = 0;i < n;i++)
			{
				b[i] = 0;
				t = tangible.StringFunctions.changeCharacter(t, i, ' ');
			}
		for (i = 0;i <= n;i++)
		{

			if (a.charAt(i) == ')')
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (a.charAt(j) == '(' && b[j] == 0)
					{
						b[i] = 1;
						b[j] = 1;
						break;
					}
				}
					if (j == -1)
					{
						c++;
						t = tangible.StringFunctions.changeCharacter(t, i, '?');
					}
			}
			if (a.charAt(i) == '\0')
			{
				for (k = 0;k < i;k++)
				{
					if (a.charAt(k) == '(' && b[k] == 0)
					{
						c++;
						t = tangible.StringFunctions.changeCharacter(t, k, '$');
					}
				}
			}
		}
		System.out.print(a);
		System.out.print("\n");
		if (c != 0)
		{
			i = 0;
			while (t.charAt(i) == ' ')
			{
				i++;
			}
			k = n - 1;
			while (t.charAt(k) == ' ')
			{
				k--;
			}
			for (j = i;j <= k;j++)
			{
			System.out.print(t.charAt(j));
			}
		}
		System.out.print("\n");
		}
		return 0;
	}






}

