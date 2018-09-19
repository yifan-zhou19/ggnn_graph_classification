package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[101]);
		int i;
		int[] a = new int[101];
		int k;
		int j;
		for (i = 0;i <= 100;i++)
		{
			a[i] = 1;
		}
		while (scanf("%s",ch) != EOF)
		{
			System.out.println(ch);
			i = 0;
			do
			{
				if ((ch.charAt(i) >= 'a' && ch.charAt(i) <= 'z') || (ch.charAt(i) >= 'A' && ch.charAt(i) <= 'Z'))
				{
					a[i] = 0;
				}
				if (ch.charAt(i) == ')')
				{
					for (k = i - 1;k >= 0;k--)
					{
						if ((ch.charAt(k) == '(') && a[k] == 1)
						{
							a[k] = 0;
							a[i] = 0;
							break;
						}
					}
				}
				i++;
			} while (ch.charAt(i) != '\0');
			j = i - 1;
			for (i = 0;i <= j;i++)
			{
				if (a[i] == 0)
				{
					System.out.print(" ");
				}
				else
				{
					if (ch.charAt(i) == '(')
					{
						System.out.print("$");
					}
					else
					{
						System.out.print("?");
					}

				}
			}
			System.out.print("\n");
			for (i = 0;i <= 100;i++)
			{
				a[i] = 1;
				ch = tangible.StringFunctions.changeCharacter(ch, i, 'a');
			}

		}
		return 0;
	}
}

