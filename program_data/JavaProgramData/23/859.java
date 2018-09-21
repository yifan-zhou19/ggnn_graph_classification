package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
		char[][] a = new char[100][30];
		int i;
		int j;
		int k;
		s = new Scanner(System.in).nextLine();
		for (i = 0, j = 0, k = 0;i < 100 && s.charAt(i) != 0;i++)
		{
			if (s.charAt(i) == ' ')
			{
				a[j][k] = 0;
				j++;
				k = 0;
			}
			else
			{
				a[j][k] = s.charAt(i);
				k++;
			}
			a[j][k] = 0;
		}
		for (i = j;i > 0;i--)
		{
			for (k = 0;k < 30 && a[i][k] != 0;k++)
			{
				System.out.printf("%c",a[i][k]);
			}
			System.out.print(" ");
		}
		for (k = 0;k < 30 && a[0][k] != 0;k++)
		{
			System.out.printf("%c",a[0][k]);
		}
	}

}
