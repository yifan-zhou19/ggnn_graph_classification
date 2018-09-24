package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] c = new char[100][100];
		int i;
		int j;
		int m = 0;
		int n = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
		  if (s.charAt(i) == ' ')
		  {
			n++;
			c[n][0] = s.charAt(i + 1);
			m = 1;
			i++;
		  }
		  else
		  {
			c[n][m] = s.charAt(i);
			m++;
		  }
		}
		for (i = 0;i <= n;i++)
		{
		  if (strcmp(c[i],a) == 0)
		  {
		   c[i] = b;
		  }
		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%s ",c[i]);
		}
		System.out.printf("%s",c[n]);

		return 0;


	}
}
