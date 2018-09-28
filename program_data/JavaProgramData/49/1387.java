package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		String a = new String(new char[501]);
		a = new Scanner(System.in).nextLine();
		for (j = 2;j < a.length();j = j + 2)
		{
			for (i = 0;i < a.length();i++)
			{
				int d = 0;
				for (k = j / 2;k >= 0;k--)
				{
					if (a.charAt(i + k) == a.charAt(i + j - k - 1))
					{
						continue;
					}
					else
					{
						d = 1;
						break;
					}
				}
				if (d == 0)
				{
					for (l = i;l < i + j;l++)
					{
						System.out.printf("%c",a.charAt(l));
					}
					System.out.print('\n');
				}
			}
		}
		return 0;
	}
}
