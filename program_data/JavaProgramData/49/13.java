package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[1000]);
		int n;
		int i;
		int j;
		int k;
		int m;
		int count = 0;
		s = new Scanner(System.in).nextLine();
		n = s.length();

		for (k = 2;k <= n;k = k + 2)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < k / 2;j++)
				{
					if (s.charAt(i + j) == s.charAt(i + k - j - 1))
					{
						count++;
					}
					if (j == k / 2 - 1 && count == k / 2)
					{
						for (m = i;m < i + k;m++)
						{
							System.out.printf("%c",s.charAt(m));
						}
						System.out.print("\n");
						count = 0;
					}
					else if (j == k / 2 - 1 && count != k / 2)
					{
						count = 0;
					}
				}
			}
		}
	}
}
