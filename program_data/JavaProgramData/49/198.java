package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[505]);
		int i;
		int j;
		int k;
		a = new Scanner(System.in).nextLine();
		for (i = 2;i < a.length();i++)
		{
			for (j = 0;j <= a.length() - i;j++)
			{
				for (k = 0;k < i;k++)
				{
					if (a.charAt(k + j) != a.charAt(i + j - 1 - k))
					{
						break;
					}
				}
				if (k == i)
				{
					for (k = j;k < i + j;k++)
					{
						System.out.printf("%c",a.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
