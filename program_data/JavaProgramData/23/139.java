package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int n;
	public static int p;
	public static int k;
	public static String a = new String(new char[100]);
	public static char[][] s = new char[100][30];
	public static void Main()
	{
		a = new Scanner(System.in).nextLine();
		n = a.length();
		p = 0;
		k = 0;
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != ' ')
			{
				s[k][p++] = a.charAt(i);
			}
			else
			{
				s[k][p] = 0;
				p = 0;
				k++;
			}
		}
		for (i = k;i > 0;i--)
		{
			System.out.printf("%s ",s[i]);
		}
		System.out.printf("%s\n",s[0]);
	}

}
