package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		s = new Scanner(System.in).nextLine();
		int len;
		len = s.length();
		int n;
		int i;
		int j;
		int judge;
		for (n = 2;n <= len;n++)
		{
			for (j = 0;j < len - n + 1;j++)
			{
				judge = 1;
				for (i = 0;i < n;i++)
				{
					if (n + j - i - 1 >= len)
					{
						break;
					}
					else
					{
						if (s.charAt(i + j) != s.charAt(n - 1 - i + j))
						{
							judge = 0;
						}
					}
				}
				if (judge == 1)
				{
					for (i = 0;i < n;i++)
					{
						System.out.printf("%c", s.charAt(i + j));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}




}
