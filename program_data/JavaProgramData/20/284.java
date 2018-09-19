package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int[] len = new int[100];
		char[][] a = new char[100][19];
		char[][] str = new char[100][10];
		char[][] substr = new char[100][3];
		char max;
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 19;j++)
			{
				a[i][j] = '\0';
			}
		}
		a[0] = new Scanner(System.in).nextLine();
		for (i = 1;;i++)
		{
			if (String.valueOf(a[i - 1]).length() == 0)
			{
				break;
			}
			else
			{
				a[i] = new Scanner(System.in).nextLine();
			}
		}
		n = i;
		for (i = 0;i < n;i++)
		{
			len[i] = String.valueOf(a[i]).length();
			a[i][len[i] - 4] = '\0';
			substr[i][0] = a[i][len[i] - 3];
			substr[i][1] = a[i][len[i] - 2];
			substr[i][2] = a[i][len[i] - 1];
		}

		for (i = 0;i < n;i++)
		{
			max = 0;
			for (j = 0;a[i][j] != '\0';j++)
			{
				max = max > a[i][j]?max:a[i][j];
			}
			for (j = 0;a[i][j] != max;j++)
			{
				System.out.printf("%c",a[i][j]);
			}
			System.out.printf("%c",max);
			for (k = 0;k < 3;k++)
			{
				System.out.printf("%c",substr[i][k]);
			}
			j++;
			for (;a[i][j] != '\0';j++)
			{
				System.out.printf("%c",a[i][j]);
			}
			System.out.print("\n");
		}
	}

}
