package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		int h = 0;
		int k = 0;
		int m = 0;
		String str = new String(new char[500]);
		str = new Scanner(System.in).nextLine();
		a = str.length();
		for (j = 1;j < (a - 1);j++)
		{
			for (i = 0;(i + j) < a;i++)
			{
				if ((j - 1) % 2 == 0)
				{
					for (k = 0;k <= (j - 1) / 2;k++)
					{
						if (str.charAt(i + k) != str.charAt(i + j - k))
						{
							h = 1;
						}
					}
				}
				else
				{
				   for (k = 0;k <= j / 2;k++)
				   {
						if (str.charAt(i + k) != str.charAt(i + j - k))
						{
							h = 1;
						}
				   }
				}
				if (h == 0)
				{
				for (h = 0;h < j;h++)
				{
					System.out.printf("%c",str.charAt(i + h));
				}
					System.out.printf("%c\n",str.charAt(i + j));
				}
				h = 0;
			}
		}

		return 0;
	}
}
