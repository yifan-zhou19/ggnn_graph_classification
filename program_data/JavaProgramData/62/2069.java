package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[100]);
		int i;
		int j = 0;
		int k = 0;
		while (k < 100)
		{
			ch = tangible.StringFunctions.changeCharacter(ch, k, System.in.read());
			if (ch.charAt(k) == '\n')
			{
			break;
			}
			k++;
		}
		for (i = 0;i < k;i++)
		{
			if (ch.charAt(i) == 32)
			{
				j++;
			}
			else
			{
				j = 0;
			}

			if (j < 2)
			{
				System.out.printf("%c",ch.charAt(i));
			}
		}
		return 0;
	}

}

