package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[124]);
		String p = str;
		int i;
		int j;
		int n;
		int k;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = n - 1,j = i;i > 0;i--)
		{
			if (*(p.Substring(i)) == ' ')
			{
				for (k = i + 1;k <= j;k++)
				{
					System.out.printf("%c%s",*(p.Substring(k)),k == j != 0? " ":"");
				}
				j = i - 1;
			}
		}
		for (i = 0; * (p.Substring(i)) != ' ' && *(p.Substring(i)) != '\0';i++)
		{
			System.out.printf("%c",*(p.Substring(i)));
		}

	}

}
