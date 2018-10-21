package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		char[][] a = new char[100][100];
		int i;
		int j = 1;
		int k = 0;
		for (i = 0;i < str.length();i++)
		{
			a[j][k] = str.charAt(i);
			k = k + 1;
			if ((str.charAt(i + 1) == ' ' && str.charAt(i) != ' ') || (str.charAt(i + 1) != ' ' && str.charAt(i) == ' '))
			{
				a[j][k] = '\0';
				j = j + 1;
				k = 0;
			}
		}
		for (i = j;i >= 1;i--)
		{
			System.out.printf("%s",a[i]);
		}
		return 0;
	}
}
