package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		char[][] b = new char[10][10];
		char c = ' ';
		int i;
		int j = 0;
		int l;
		int h = 0;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) != ' ')
			{
				b[j][h++] = a.charAt(i);
			}
			else
			{
				b[j][h] = 0;
				j++;
				h = 0;
			}
		}
		b[j][h] = 0;
		System.out.printf("%s",b[j]);
		for (i = j - 1;i >= 0;i--)
		{
			System.out.printf("%c%s",c,b[i]);
		}
		System.out.print("\n");

	}
}
