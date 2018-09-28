package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int num;
		int j;
		int l;
		String c = new String(new char[101]);
		char[][] a = new char[50][30];
		c = new Scanner(System.in).nextLine();
		l = c.length();
		num = 0;
		j = 0;
		for (i = 0;i < l;i++)
		{
			if (c.charAt(i) != ' ')
			{
				a[num][j] = c.charAt(i);
				j++;
			}
			else
			{
				a[num][j] = '\0';
				num++;
				j = 0;
			}
		}
		a[num][j] = '\0';
		for (i = num;i > 0;i--)
		{
			System.out.printf("%s ",a[i]);
		}
		System.out.printf("%s",a[0]);
	}
}
