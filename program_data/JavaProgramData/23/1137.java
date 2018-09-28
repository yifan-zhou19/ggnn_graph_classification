package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		char[][] a = new char[100][100];
		j = 1;
		k = 0;
		for (i = 0;i < str.length();i++)
		{
			a[j][k] = str.charAt(i);
			k = k + 1;
			if (str.charAt(i + 1) == ' ')
			{
				a[j][k] = '\0';
				j = j + 1;
				k = 0;
							   i++;
			}
			if (str.charAt(i + 1) == '\0')
			{
				a[j][k] = '\0';
			}
		}
		for (i = j;i >= 1;i--)
		{
			System.out.printf("%s",a[i]);
			if (i != 1)
			{
				System.out.print(" ");
			}
		}
	return 0;
	}

}
