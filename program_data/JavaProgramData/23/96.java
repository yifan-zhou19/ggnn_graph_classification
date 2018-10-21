package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char[][] b = new char[100][100];
		int n;
		int i;
		int j;
		n = 0;
		while (scanf("%s", a) != EOF)
		{
			  j = a.length();
			  for (i = 0;i < j;i++)
			  {
			  b[n][i] = a.charAt(i);
			  }
			  n++;
		}
		for (i = 0;i < n - 1;i++)
		{
		System.out.printf("%s ",b[n - i - 1]);
		}
		System.out.printf("%s",b[0]);
		return 0;
	}
}
