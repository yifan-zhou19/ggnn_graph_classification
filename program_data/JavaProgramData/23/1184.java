package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[200]);
		char[][] a = new char[100][15];
		int i;
		int j = 0;
		int n;
		int r = 1;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) == ' ')
			{
				a[r][j] = '\0';
				r++;
				j = 0;
			}
			else
			{
				a[r][j] = s.charAt(i);
				j++;
			}
		}
		a[r][j] = '\0';
		System.out.printf("%s",a[r]);
		for (i = r - 1;i > 0;i--)
		{
		System.out.printf(" %s",a[i]);
		}
	}
}
