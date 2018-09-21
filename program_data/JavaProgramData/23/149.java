package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[101]);
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int len;
		int j;
		int k;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		j = k = 0;
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) != ' ')
			{
				a[k][i - j] = s.charAt(i);
			}
			else
			{
				k++;
				j = i + 1;
			}
		}
		for (k - 1;k > 0;k--)
		{
			System.out.printf("%s ",a[k]);
		}
		System.out.printf("%s",a[0]);
	}
}
