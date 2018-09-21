package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[101][101];
		String b = new String(new char[101]);
		int i = 1;
		int j = 0;
		int k = 0;
		int l1;
		int l2;
		b = new Scanner(System.in).nextLine();
		l1 = b.length();
		for (j = 0;j < l1;j++)
		{
			if (b.charAt(j) == ' ')
			{
				a[i][k] = '\0';
				i++;
				k = 0;
			}
			else
			{
				a[i][k] = b.charAt(j);
				k++;
			}
		}
		a[i][k] = '\0';
		for (j = i;j >= 1;j--)
		{
			l2 = String.valueOf(a[j]).length();
			for (k = 0;k < l2;k++)
			{
				System.out.printf("%c",a[j][k]);
			}
			if (j != 1)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("\n");
			}
		}
	}


}
