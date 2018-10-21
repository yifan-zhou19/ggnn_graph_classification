package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int i;
		int j;
		int n;
		int length;
		a = new Scanner(System.in).nextLine();
		length = a.length();
		for (i = 0;i < length;i++)
		{
			if (a.charAt(i) == a.charAt(i + 1))
			{
				for (j = i;j < i + 1;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.printf("%c\n",a.charAt(j));
			}
		}
		for (n = 1;n < length;n++)
		{
			for (i = 0;i < length - n - 1;i++)
			{
				if (a.charAt(i + 1) == a.charAt(i))
				{
					if (a.charAt(i + n + 1) == a.charAt(i - n))
					{
						if (a.charAt(i + n) == a.charAt(i - n + 1))
						{
							for (j = i - n;j < i + n + 1;j++)
							{
								System.out.printf("%c",a.charAt(j));
							}
							System.out.printf("%c\n",a.charAt(j));
						}
					}
				}
			}
		}
		return 0;
	}
}
