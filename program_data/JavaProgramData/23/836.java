package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int n;
		int i;
		int j;
		int k;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		k = n;
		for (i = n - 1;i >= 0;i--)
		{
			if (str.charAt(i) == ' ')
			{
				for (j = i + 1;j < k;j++)
				{
					System.out.printf("%c",str.charAt(j));
				}
				k = i;
				System.out.print(" ");
			}
		}
		for (j = 0;j < k;j++)
		{
			System.out.printf("%c",str.charAt(j));
		}
	}
}
