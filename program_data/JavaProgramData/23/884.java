package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		char[][] b = new char[50][20];
		a = new Scanner(System.in).nextLine();
		int len;
		int i;
		int j = 0;
		int t = 0;
		int m;
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) != ' ')
			{
				b[t][j] = a.charAt(i);
				j++;
				m = t;
			}
			if (a.charAt(i) == ' ')
			{
				b[t][j] = '\0';
				t++;
				j = 0;
			}
		}
		b[t][j] = '\0';
		for (i = m;i > 0;i--)
		{
		System.out.printf("%s ",b[i]);
		}
	System.out.printf("%s",b[0]);
	}
}
