package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[110]);
		char[][] a = new char[100][100];
		input = new Scanner(System.in).nextLine();
		int i;
		int len;
		int b = 1;
		int j;
		int c = 0;
		int d = 0;
		len = input.length();
		for (i = 0;i < len;i++)
		{
			if (input.charAt(i) == ' ')
			{
				b++;
			}
		}
		for (j = 0;j < b;j++)
		{
			for (i = c;i < len;i++)
			{
				if (input.charAt(i) == ' ')
				{
					break;
				}
				a[j][d] = input.charAt(i);
				d++;
			}
			a[j][d] = '\0';
			d = 0;
			c = i + 1;
		}
		for (j = b - 1;j > 0;j--)
		{
			System.out.printf("%s ",a[j]);
		}
		System.out.printf("%s",a[0]);
		return 0;
	}


}
