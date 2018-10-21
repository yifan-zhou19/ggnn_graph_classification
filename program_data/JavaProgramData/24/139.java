package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int i;
		int b;
		int j;
		int m;
		int n;
		int e;
		char[][] str = new char[100][50];
		String gold = new String(new char[500]);
		char c;
		gold = new Scanner(System.in).nextLine();
		e = gold.length();
		a = 0;
		b = 0;
		i = 0;
		for (a = 0;a <= e;a++)
		{
			if (gold.charAt(a) != ' ')
			{
				str[i][b] = gold.charAt(a);
				b++;
			}
			if (gold.charAt(a) == ' ')
			{
				i++;
				b = 0;
			}
		}
		m = 0;
		n = 0;
		for (j = 0;j <= i;j++)
		{
			if (String.valueOf(str[j]).length() > String.valueOf(str[m]).length())
			{
				m = j;
			}
			if (String.valueOf(str[j]).length() < String.valueOf(str[n]).length())
			{
				n = j;
			}
		}
		System.out.printf("%s\n%s\n",str[m],str[n]);
	}

}
