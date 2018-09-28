package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		char[][] b = new char[100][100];
		int n = 1;
		int i;
		int num = 0;
		int j;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;)
		{
			if (a.charAt(i) != ' ')
			{
				j = 0;
				do
				{
					b[num][j] = a.charAt(i);
					i++;
					j++;
				}while (a.charAt(i) != ' ');
				b[num][j] = '\0';
				num++;
			}
			else
			{
				i++;
			}
		}
		for (i = num - 1;i >= 0;i--)
		{
			if (i < num - 1)
			{
				System.out.print(' ');
			}
			System.out.printf("%s",b[i]);
		}
	}
}
