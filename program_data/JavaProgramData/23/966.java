package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[100]);
		c = new Scanner(System.in).nextLine();
		int i;
		int j;
		int[] a = new int[100];
		int len;
		int n;
		len = c.length();
		c = tangible.StringFunctions.changeCharacter(c, len, ' ');
		j = 0;
		for (i = len;i >= 0;i--)
		{
			if (c.charAt(i) == ' ')
			{
				a[j] = i;
				j++;
			}
		}
		n = j - 1;
		j = 0;
		while (j != n)
		{
			for (i = a[j + 1] + 1;i < a[j];i++)
			{
				System.out.printf("%c",c.charAt(i));
			}
			System.out.print(" ");
			j++;
		}
		for (i = 0;i < a[n];i++)
		{
			System.out.printf("%c",c.charAt(i));
		}
	}

}

