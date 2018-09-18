package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int i;
		int k;
		int m;
		String s = new String(new char[100]);
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		char[][] z = new char[50][20];
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0,j = 0,k = 0;i < 100;i++)
		{
			if (s.charAt(i) == ' ')
			{
				z[j][k] = '\0';
				j++;
				k = 0;
			}
			if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
			{
				z[j][k] = s.charAt(i);
				k++;
			}
			if (s.charAt(i) == '\0')
			{
				z[j][k] = '\0';
				m = j;
				break;
			}
		}
		for (i = m;i >= 0;i--)
		{
			if (strcmp(a,z[i]) == 0)
			{
				z[i] = b;
			}
		}
		for (i = 0;i <= m;i++)
		{
			if (i < m)
			{
				System.out.printf("%s ",z[i]);
			}
			if (i == m)
			{
				System.out.printf("%s",z[i]);
			}
		}
		return 0;
	}








}
