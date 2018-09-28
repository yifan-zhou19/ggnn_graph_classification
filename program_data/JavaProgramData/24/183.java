package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[50][20];
		int i;
		i = 0;
		while (scanf("%s", str[i]) != EOF)
		{
			i++;
		}
		int n = i - 1;
		int[] a = new int[50];
		int j;
		int k;
		for (i = 0;i <= n;i++)
		{
			a[i] = String.valueOf(str[i]).length();
		}
		int l = 0;
		int m = 0;
		int b = a[0];
		int c = a[0];
		for (j = 1;j <= n;j++)
		{
			if (a[j] > b)
			{
				l = j;
				b = a[j];
			}
			if (a[j] < c)
			{
				m = j;
				c = a[j];
			}
		}
		System.out.printf("%s\n%s\n",str[l],str[m]);
		return 0;
	}


}
