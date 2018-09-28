package <missing>;

public class GlobalMembers
{
	public static int judge(String ch)
	{
		int len = ch.length();
		for (int i = 0;i <= len / 2;i++)
		{
			if (!ch[i].equals(ch[len - 1 - i]))
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		final String a = "";
		final String b = "";
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int j;
		int k;
		int len;
		int i;

		len = a.length();
		//cout<<len<<endl;
		for (i = 2;i <= len;i++)
		{
			j = 0;
			while (j <= len - i)
			{
				for (k = 0;k < i;k++)
				{
					b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(j + k));
				}

				if (judge(b) != 0)
				{
					System.out.print(b);
					System.out.print("\n");
				}
				j++;
			}
		}
		return 0;
	}

}

