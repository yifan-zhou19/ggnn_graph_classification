package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[510]);
		int m;
		int s;
		int i;
		int j;
		int k;
		str = new Scanner(System.in).nextLine();
		for (j = 1;j < str.length() - 1;j++)
		{
			for (i = 0;i < str.length();i++)
			{
			  m = j + 1;
			  for (s = i;s <= m / 2 - 1 + i;s++)
			  {
				if (str.charAt(s) != str.charAt(m - s - 1 + i + i))
				{
					break;
				}
			  }
			  if (s == m / 2 + i)
			  {
					for (s = i;s <= i + j;s++)
					{
						System.out.printf("%c",str.charAt(s));
					}
					System.out.print("\n");
			  }
			}
		}
		return 0;
	}
}
