package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][100];
		char c;
		int i;
		int[] b = new int[100];
		int j;
		int n;
		int k;
		for (j = 0;;j++)
		{
		i = 0;
		c = System.in.read();
		if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'z') || c == '(' || c == ')'))
		{
			break;
		}
		a[j][i] = c;
		i++;
		while ((c = System.in.read()) != '\n')
		{
			a[j][i] = c;
			i++;
		}
		b[j] = i;
		}
		n = j;
		for (j = 0;j < n;j++)
		{
		for (i = 0;i < b[j];i++)
		{
			System.out.printf("%c",a[j][i]);
		}
		System.out.print('\n');
		for (i = 0;i < b[j];i++)
		{
			if ((a[j][i] >= 'a' && a[j][i] <= 'z') || (a[j][i] >= 'A' && a[j][i] <= 'Z'))
			{
				a[j][i] = ' ';
			}
		}
		for (i = 0;i < b[j];i++)
		{
			if (a[j][i] == ')')
			{
				for (k = i - 1;k > -1;k--)
				{
					if (a[j][k] == '(')
					{
						break;
					}
				}
				if (k != -1)
				{
					a[j][k] = ' ';
					a[j][i] = ' ';
				}
			}
		}
		for (i = 0;i < b[j];i++)
		{
			if (a[j][i] == '(')
			{
				a[j][i] = '$';
			}
			if (a[j][i] == ')')
			{
				a[j][i] = '?';
			}
		}
		for (i = 0;i < b[j];i++)
		{
			System.out.printf("%c",a[j][i]);
		}
		System.out.print("\n");
		}
	}
}
