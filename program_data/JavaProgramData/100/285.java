package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[400]);
		char c;
		int n;
		int i;
		int j;
		int[] a = new int[400];
		int t;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				for (j = i;j < n;j++)
				{
					if (str.charAt(j) == str.charAt(i))
					{
						a[i]++;
					}
				}
				for (j = i + 1;j < n;j++)
				{
					if (str.charAt(j) == str.charAt(i))
					{
						str = tangible.StringFunctions.changeCharacter(str, j, '~');
					}
				}
			}
			else
			{
				str = tangible.StringFunctions.changeCharacter(str, i, '~');
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0)
			{
				break;
			}
		}
		if (i == n)
		{
			System.out.print("No\n");
		}
		if (i < n)
		{
			for (i = 0;i < n;i++)
			{
				for (j = i + 1;j < n;j++)
				{
					if (str.charAt(j) < str.charAt(i))
					{
						c = str.charAt(i);
						str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(j));
						str = tangible.StringFunctions.changeCharacter(str, j, c);
					t = a[i];
					a[i] = a[j];
					a[j] = t;
					}
				}
			}
		}
			for (i = 0;i < n;i++)
			{
				if (a[i] != 0)
				{
					System.out.printf("%c=%d\n",str.charAt(i),a[i]);
				}
			}
	}

}

