package <missing>;

public class GlobalMembers
{
	public static int o;
	public static void Main()
	{
		void insert(char x[],char y[],int z,char w[]);
		int max = char p[];
		String str = new String(new char[20]);
		String substr = new String(new char[4]);
		char[] f = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int m;
		int n;
		while (scanf("%s%s",str,substr) != EOF)
		{
			o = str.length();
			m = max(str);
			insert(str, substr, m, f);
			for (n = 0;n < o + 3;n++)
			{
				System.out.printf("%c",f[n]);
			}
			System.out.print("\n");
		}
	}
	public static int max(String p)
	{
		int i;
		int l;
		int d = 0;
		l = p.length();
		for (i = 0;i < l;i++)
		{
			if (p[i].compareTo(p[d]) > 0)
			{
				d = i;
			}
		}
		return d;
	}
	public static void insert(String x, String y, int z, String w)
	{
		int j;
		int k;
		for (j = 0,k = 0;k <= z;j++,k++)
		{
			w[j] = x[k];
		}
		for (j = z + 1,k = 0;k < 3;k++,j++)
		{
			w[j] = y[k];
		}
		for (j = z + 4,k = z + 1;k < o;k++,j++)
		{
			w[j] = x[k];
		}
	}

}
