package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[200]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] w = new char[100][20];
		int len;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		len = s.length();
		int i;
		int j;
		int n = 0;
		int k = 0;
		for (i = 0;i <= len;i++)
		{
			if (s.charAt(i) == 32)
			{
				w[n][k] = '\0';
				n++;
				k = 0;
			}
			else
			{
				w[n][k] = s.charAt(i);
				k++;
			}
		}
		for (j = 0;j <= n;j++)
		{
			if (strcmp(w[j],a) == 0)
			{
				w[j] = b;
			}
			if (j == 0)
			{
				System.out.printf("%s",w[j]);
			}
			else
			{
				System.out.printf(" %s",w[j]);
			}
		}
		return 0;
	}
}
