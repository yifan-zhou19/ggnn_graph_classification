package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[501]);
		int i;
		int j;
		int l;
		int n;
		int k;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (l = 2;l <= n;l++)
		{
			for (i = 0;i <= n - l;i++)
			{
				k = 1;
				for (j = 0;j <= l / 2;j++)
				{
					if (a.charAt(i + j) == a.charAt(i + l - 1 - j))
					{
						k = k * 1;
					}
					else
					{
						k = k * 0;
						break;
					}
				}
				if (k != 0)
				{
					for (j = 0;j < l;j++)
					{
						System.out.printf("%c",a.charAt(i + j));
					}
					System.out.print("\n");
				}
			}
		}
	}
}
