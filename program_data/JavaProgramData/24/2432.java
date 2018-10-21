package <missing>;

public class GlobalMembers
{
	public static int min(int[] b, int n)
	{
		int i;
		int j;
		int k;
		int mini;
		int[] c = new int[200];
		for (i = 0;i < n;i++)
		{
			c[i] = b[i];
		}
		for (i = 0;i < n;i++)
		{
		for (j = i;j < n;j++)
		{
		if (c[i] < c[j])
		{
			k = c[i];
			c[i] = c[j];
			c[j] = k;
		}
		}
		}
		mini = c[n - 1];
		return mini;
	}
	public static int max(int[] b, int n)
	{
		int i;
		int j;
		int k;
		int maxi;
		int[] c = new int[200];
		for (i = 0;i < n;i++)
		{
			c[i] = b[i];
		}
		for (i = 0;i < n;i++)
		{
		for (j = i;j < n;j++)
		{
		if (c[i] < c[j])
		{
			k = c[i];
			c[i] = c[j];
			c[j] = k;
		}
		}
		}
		maxi = c[0];
		return maxi;
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int N;
		int M;
		String a = new String(new char[4000]);
		char[][] c = new char[200][30];
		a = new Scanner(System.in).nextLine();
		for (i = 0,n = 1,m = 0,j = 0;a.charAt(i) != '\0';i++)
		{
			if ((a.charAt(i) == ' ' || a.charAt(i) == ',') && a.charAt(i - 1) != ',')
			{
				n++;
				m++;
				j = 0;
			}
			else if (a.charAt(i - 1) != ',')
			{
			c[m][j] = a.charAt(i);
			j++;
			}
		}
		int[] b = new int[n];
		for (j = 0;j < n;j++)
		{
			b[j] = String.valueOf(c[j]).length();
		}
		N = max(b, n);
		M = min(b, n);
		for (i = 0;i < n;i++)
		{
		if (b[i] == N)
		{
		System.out.printf("%s\n",c[i]);
		break;
		}
		}
		for (i = 0;i < n;i++)
		{
		if (b[i] == M)
		{
		System.out.printf("%s\n",c[i]);
		break;
		}
		}
		return 0;

	}

}
