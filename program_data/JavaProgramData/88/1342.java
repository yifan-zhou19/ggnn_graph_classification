package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		String shuru = new String(new char[50]);
		String shuchu = new String(new char[50]);
		String p;
		String q;
		p = shuru;
		q = shuchu;
		while (true)
		{
			shuru = tangible.StringFunctions.changeCharacter(shuru, i, System.in.read());
			if (shuru.charAt(i) == '\n')
			{
				break;
			}
			i++;
		}
		for (int k = 0;k < i;k++)
		{
			if (p >= '0' && p <= '9')
			{
				*(q++) = *(p++);
				j++;
			}
			else if (*(q - 1) == '\n')
			{
				p = p.Substring(1);
			}
			else
			{
				*(q++) = '\n';
				j++;
				p = p.Substring(1);
			}
		}
		for (int k = 0;k < j;k++)
		{
			System.out.print(shuchu.charAt(k));
		}
		return 0;
	}

}

