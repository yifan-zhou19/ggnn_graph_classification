package <missing>;

public class GlobalMembers
{
	public static void order(String ch, int n)
	{
		int temp;
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (ch[j].compareTo(ch[j + 1]) > 0)
				{
					temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;
				}
			}
		}
	}
	public static void Main()
	{
		String ch1 = new String(new char[1000]);
		String ch2 = new String(new char[1000]);
		char c;
		int i;
		int j;
		int k;
		int l = 1;
		for (k = 0;k < 1000;k++)
		{
			ch1 = tangible.StringFunctions.changeCharacter(ch1, k, ' ');
			ch2 = tangible.StringFunctions.changeCharacter(ch2, k, ' ');
		}
		for (i = 0;i < 1000 && (c = System.in.read()) != ' ';i++)
		{
			ch1 = tangible.StringFunctions.changeCharacter(ch1, i, c);
		}
		for (j = 0;j < 1000 && (c = System.in.read()) != '\n';j++)
		{
			ch2 = tangible.StringFunctions.changeCharacter(ch2, j, c);
		}
		order(ch1, i + 1);
		order(ch2, j + 1);
		for (k = 0;k < 1000 && l == 1;k++)
		{
			if (ch1.charAt(k) != ch2.charAt(k))
			{
				l = 0;
				break;
			}
		}
		if (l == 1)
		{
			System.out.print("YES\n");
		}
		if (l == 0)
		{
			System.out.print("NO\n");
		}
	}
}

