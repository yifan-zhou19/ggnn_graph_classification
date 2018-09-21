package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[200][20];
		char c;
		int[] b = new int[200];
		int i = 0;
		int j = 0;
		int n;
		int max;
		int min;
		int s;
		int t;
		while ((c = System.in.read()) != EOF)
		{
				if (c == ' ' || c == ',')
				{
			a[i][j] = 0;
			b[i] = j;
		i++;
		j = 0;
				}
			else
			{
				a[i][j++] = c;
			}
		}
		n = i;
		a[i][--j] = 0;
		b[i] = j;

		s = t = 0;
		max = min = b[0];
		for (i = 1;i <= n;i++)
		{
			if (b[i] > max)
			{
			max = b[i];
			t = i;
			}
			else if (b[i] < min && b[i]>0)
			{
				min = b[i];
				s = i;
			}
		}
		System.out.println(a[t]);
		System.out.println(a[s]);
	}
}
