package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[60];
	public static int[] b = new int[60];
	public static final String c = "";
	public static char ch;
	public static int n = 0;
	public static int m = 0;
	public static int search1(int p) //???????????????????
	{
		int i = p + 1;
		int j;
		while (c.charAt(i) == '(' || (c.charAt(i) == '{') || (c.charAt(i) == '[') || c.charAt(i) == '<')
		{
			j = search1(i); //??
			i = j + 1;
		}
		a[m] = p;
		b[m] = i;
		m++;
		return i;
	}
	public static int Main()
	{
		int i = 0;
		cin.get(ch);
		while (ch != '\n')
		{
			c = tangible.StringFunctions.changeCharacter(c, n, ch);
			n++;
			cin.get(ch);
		}
		while (i < n)
		{
			i = search1(i) + 1;
		}
		for (i = 0; i < m; i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
			System.out.print(b[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

