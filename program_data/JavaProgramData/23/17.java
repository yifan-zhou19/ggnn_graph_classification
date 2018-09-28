package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		char[][] string = new char[100][100];
		char c;
		int i;
		int j;
		int k;
		int t;
		str = new Scanner(System.in).nextLine();
		j = 0;
		k = 0;
		for (i = 0;;i++)
		{
			c = str.charAt(i);
			if (c != ' ' && c != '\0')
			{
				String[j][k] = c;
				k = k + 1;
			}
			else if (c == ' ')
			{
				String[j][k] = '\0';
				j = j + 1;
				k = 0;
			}
			else
			{
				String[j][k] = '\0';
				break;
			}
		}
		t = j;
		for (j = t;j > 0;j--)
		{
		   System.out.printf("%s ",string[j]);
		}
		System.out.printf("%s\n",string[0]);
	}

}
