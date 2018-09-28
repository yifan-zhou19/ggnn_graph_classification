package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[20][20];
		String temp = new String(new char[10]);
		int n = 0;
		int i;
		int j;
		while (scanf("%s",a[n]) != EOF)
		{
			n++;
		}
		i = 0;
		j = n - 1;
		do
		{
			temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		i++;
		j--;
		} while (i <= j);
		System.out.printf("%s",a[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %s",a[i]);
		}
	}
}
