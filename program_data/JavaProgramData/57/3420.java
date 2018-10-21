package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[2]);
		String word = new String(new char[32]);
		int i;
		int j;
		int k;
		int len;
		int n;
		x = new Scanner(System.in).nextLine();
		n = Integer.parseInt(x);
		for (i = 0;i < n;i++)
		{
			word = new Scanner(System.in).nextLine();
			len = word.length();
			if (word.charAt(len - 1) == 'g')
			{
				for (j = 0;j < len - 3;j++)
				{
					System.out.printf("%c",word.charAt(j));
				}
				System.out.print("\n");
			}
			else
			{
				for (k = 0;k < len - 2;k++)
				{
					System.out.printf("%c",word.charAt(k));
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}
