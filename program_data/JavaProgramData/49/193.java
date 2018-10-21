package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[500]);
		int lenth;
		int i;
		int l;
		int j;
		int counter;
		str = new Scanner(System.in).nextLine();
		lenth = str.length();
		for (i = 0;i <= lenth - 2;i++)
		{
			if (str.charAt(i) == str.charAt(i + 1))
			{
				System.out.printf("%c%c\n",str.charAt(i),str.charAt(i + 1));
			}
		}
		for (l = 3;l <= lenth;l++)
		{
			for (i = 0;i <= lenth - l;i++)
			{
				counter = 0;
				for (j = 0;j <= l - 1;j++)
				{
					if (str.charAt(i + j) == str.charAt(i + l - j - 1))
					{
						counter += 1;
					}
				}
				if (counter == l)
				{
					for (j = 0;j <= l - 2;j++)
					{
						System.out.printf("%c",str.charAt(i + j));
					}
					System.out.printf("%c\n",str.charAt(i + l - 1));
				}
			}
		}
		return 0;
	}

}
