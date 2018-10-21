package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int i;
		int j;
		int k;
		int m;
		a = new Scanner(System.in).nextLine();
		int len = a.length();
		for (i = 2;i <= len;i++)
		{
			for (j = 0;j <= len - i;j++)
			{
				for (k = 0;k < i;k++)
				{
					if (a.charAt(j + k) != a.charAt(j + i - 1 - k))
					{
						break;
					}
				}
				if (k == i)
				{
					for (m = 0;m < i;m++)
					{
						System.out.print(a.charAt(j + m));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
