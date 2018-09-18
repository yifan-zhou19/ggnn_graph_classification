package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] string = new char[100][100];
		String str = new String(new char[1000]);
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		int i;
		int count = 0;
		for (i = 0;i < len + 1;i++)
		{
			if (str.charAt(i) == ' ' || (str.charAt(i) == '\0'))
			{
				int k;
				int q = 0;
				for (k = i - 1;k >= 0;k--)
				{
					if (str.charAt(k) == ' ')
					{
						break;
					}

				}

				for (++k;k <= i;k++)
				{
					String[count][q] = str.charAt(k);
					q++;
				}
				String[count][q - 1] = '\0';
				count++;
			}
		}
		String from = new String(new char[100]);
		String to = new String(new char[100]);
		from = new Scanner(System.in).nextLine();
		to = new Scanner(System.in).nextLine();
		String nowword;
		int j = 0;
		for (j = 0;j < count;j++)
		{
			nowword = string[j];
			if (strcmp(nowword,from) == 0)
			{
				nowword = to;
			}
		}
		System.out.printf("%s",string[0]);
		for (i = 1;i < count;i++)
		{
			System.out.printf(" %s",string[i]);
		}
		System.out.print("\n");
		return 0;
	}

}
