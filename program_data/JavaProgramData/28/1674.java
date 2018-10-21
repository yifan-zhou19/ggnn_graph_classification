package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[3000]);
		char[][] b = new char[300][30];
		int i;
		int n;
		int len;
		int j = 0;
		int k = 0;
		int[] l = new int[300];
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) != ' ')
			{
				b[j][k] = a.charAt(i);
				k++;
			}
			else
			{
				if (a.charAt(i - 1) != ' ')
				{
				  b[j][k] = '\0';
				  k = 0;
				}
				if (a.charAt(i + 1) != ' ')
				{
				   j++;
				}
			}
		}
		b[j][k] = '\0';
		for (n = 0;n < j;n++)
		{
			l[n] = String.valueOf(b[n]).length();
			System.out.printf("%d,",l[n]);
		}
		l[j] = String.valueOf(b[j]).length();
		System.out.printf("%d",l[j]);
		return 0;
	}

}
