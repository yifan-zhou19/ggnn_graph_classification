package <missing>;

public class GlobalMembers
{
	public static int m = 0;
	public static int n;
	public static void Main()
	{
		String a = new String(new char[500]);
		char[][] b = new char[50][20];
		int i;
		int j;
		int k;
		int max = 0;
		int min;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) != ' ')
			{
				n = 0;
				for (j = i;a.charAt(j) != ' ' && a.charAt(j) != '\0';j++, n++)
				{
					b[m][n] = a.charAt(j);
					a = tangible.StringFunctions.changeCharacter(a, j, ' ');
				}
				b[m][n] = '\0';
				m++;
			}
			else
			{
				continue;
			}
		}
		min = String.valueOf(b[0]).length();
		for (i = 0;i < m;i++)
		{
			if (String.valueOf(b[i]).length() > max)
			{
				max = String.valueOf(b[i]).length();
			}
			if (String.valueOf(b[i]).length() < min)
			{
				min = String.valueOf(b[i]).length();
			}
		}
		for (i = 0;i < m;i++)
		{
			if (max == String.valueOf(b[i]).length())
			{
				System.out.printf("%s\n",b[i]);
				break;
			}
		}
		for (i = 0;i < m;i++)
		{
			if (min == String.valueOf(b[i]).length())
			{
				System.out.printf("%s\n",b[i]);
				break;
			}
		}
	}
}

