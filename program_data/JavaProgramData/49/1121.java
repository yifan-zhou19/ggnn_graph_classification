package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int r;
		int flag;
		int k;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 2;i <= n;i++)
		{
			for (j = 0;j + i - 1 < n;j++)
			{
				flag = 0;
				for (k = 1;k <= i;k++)
				{
					if (a.charAt(j + k - 1) == a.charAt(j + i - k))
					{
						continue;
					}
					else
					{
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					for (r = 1;r <= i;r++)
					{
						System.out.printf("%c",a.charAt(j + r - 1));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
