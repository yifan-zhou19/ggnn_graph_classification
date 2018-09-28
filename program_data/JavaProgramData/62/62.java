package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char[][] b = new char[100][100];
		int i;
		int m = 0;
		int k = 0;
		int d = 0;
		a = new Scanner(System.in).nextLine();
		a += " ";
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			k = 0;
			d = 0;
			while ((a.charAt(i) != ' ') && (a.charAt(i) != '\0'))
			{
				b[m][k] = a.charAt(i);
				k++;
				i++;
				d = 1;
			}
			if (d == 1)
			{
			b[m][k] = '\0';
			m++;
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%s ",b[i]);
		}
		System.out.printf("%s",b[m - 1]);
		return 0;
	}





}
