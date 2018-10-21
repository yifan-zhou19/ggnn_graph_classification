package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int i;
		int j;
		int k;
		a = new Scanner(System.in).nextLine();
		for (i = 2;i <= a.length();i++)
		{
			for (j = 0;j < a.length() + 1 - i;j++)
			{
				for (k = 0;j + k <= j + i - k - 1;k++)
				{
					if (a.charAt(j + k) != a.charAt(j + i - k - 1))
					{
					break;
					}
				}
				if (j + k > j + i - k - 1)
				{
					for (k = 0;k < i;k++)
					{
					System.out.printf("%c",a.charAt(j + k));
					}
					System.out.print("\n");
				}
			}
		}
	}
}
