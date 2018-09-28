package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[300]);
		a = new Scanner(System.in).nextLine();
		int b;
		int[] d = new int[50];
		b = a.length();
		int i;
		int j = 0;
		int k = 0;
		char[][] c = new char[50][20];
		for (i = 0;i < b;i++)
		{
			if (a.charAt(i) != ' ')
			{
				c[k][j] = a.charAt(i);
				j++;
			}
			else
			{
				c[k][j] = '\0';
				k++;
				j = 0;
			}
		}
		c[k][j] = '\0';

			for (i = 0;i <= k;i++)
			{
		   d[i] = String.valueOf(c[i]).length();
			}
			int max = d[0];
			int min = d[0];
			for (i = 0;i <= k;i++)
			{
				if (d[i] > max)
				{
					max = d[i];
				}
				else if (d[i] < min)
				{
					min = d[i];
				}
			}
		  int h = 0;
		  int[] e = new int[10];
		  int[] f = new int[10];
		  int g = 0;
			for (i = 0;i <= k;i++)
			{
				if (d[i] == max)
				{
					e[h] = i;
					  h++;
				}
				else if (d[i] == min)
				{
					f[g] = i;
					g++;
				}
			}
			System.out.printf("%s\n",c[e[0]]);
			System.out.printf("%s\n",c[f[0]]);
	}


}
