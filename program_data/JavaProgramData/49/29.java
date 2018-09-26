package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[501]);
		int i;
		int j;
		int k;
		int x;
		int count = 0;
		int flag = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 2;i <= s.length();i++)
		{
			for (j = 0;(j + i) <= s.length();j++)
			{
				count = 0;
				flag = 0;
				for (k = 0;k < (i / 2);k++)
				{
					if (s.charAt(j + k) == s.charAt(j + i - k - 1))
					{
						count++;
					}

				}
				if (count == i / 2)
				{
					for (k = 0;k < i;k++)
					{
					System.out.printf("%c",s.charAt(j + k));
					}
					System.out.print("\n");
				}
			}
		}
	}
}
