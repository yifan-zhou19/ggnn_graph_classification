package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int j;
		int k = 0;
		int l;
		String a = new String(new char[200]);
		char[][] b = new char[20][20];
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = n - 1,j = 0;i >= 0;i--)
		{
			if (a.charAt(i) != ' ')
			{
				b[j][k] = a.charAt(i);
				k++;
			}
			else
			{
				for (l = k - 1;l >= 0;l--)
				{
					System.out.printf("%c",b[j][l]);
				}
				System.out.print(" ");
				k = 0;
				j = j + 1;
			}
		}
		for (l = k - 1;l >= 0;l--)
		{
			System.out.printf("%c",b[j][l]);
		}
	}
}
