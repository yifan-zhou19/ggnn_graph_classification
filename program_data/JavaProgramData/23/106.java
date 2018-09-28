package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		char[][] str = new char[100][100];
		int i;
		int j = 0;
		int k = 0;
		int l;
		int n = 0;
		int p;
		int q;
		char c;
		for (p = 0;p < 100;p++)
		{
			for (q = 0;q < 100;q++)
			{
				str[p][q] = '\0';
			}
		}
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 0;i < l;i++)
		{
			if ((c = s.charAt(i)) != ' ')
			{
				if ((c = s.charAt(i + 1)) == ' ' || (c = s.charAt(i + 1)) == '\0')
				{
					n++;
				}
			}
		}
		for (i = 0,j = 0;i < l;i++)
		{
			if ((c = s.charAt(i)) != ' ')
			{
				str[j][k] = s.charAt(i);
				k++;
			}
			else
			{
				j++;
				k = 0;
			}
		}
		for (j = 0;j < n - 1;j++)
		{
			System.out.printf("%s ",str[n - 1 - j]);
		}
		System.out.printf("%s",str[0]);
	}
}
