package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][100];
		String b = new String(new char[1000]);
		int n;
		int i;
		int k = 0;
		int j;
		int sum = 0;
		int word = 0;
		char c;
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				a[i][j] = b.charAt(k);
				k++;
				if (a[i][j] == ' ')
				{
					a[i][j] = '\0';
					break;
				}
			}
		}

		for (i = 0;(c = b.charAt(i)) != '\0';i++)
		{
			if (c == ' ')
			{
				word = 0;
			}
			else if (word == 0)
			{
				word = 1;
				sum++;
			}
		}
		n = String.valueOf(a[sum - 1]).length();
		a[sum - 1][n] = '\0';
		for (i = 0;i < sum;i++)
		{
			System.out.printf("%s",a[sum - 1 - i]);
			if (sum - 1 - i != 0)
			{
				System.out.print(" ");
			}
		}
	}

}
