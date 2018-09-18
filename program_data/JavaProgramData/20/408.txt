package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int n;
		int m;
		char[][] a = new char[10000][20];
		char[][] b = new char[10000][14];
		String p;
		String max;
		while ((scanf("%s %s", a[i], b[i])) != EOF)
		{
			n = String.valueOf(a[i]).length();
			p = b[i][2];
			max = a;
			for (j = 0;j < n - 1;j++)
			{
				if (max < a[i][j + 1])
				{
					max = a[i][j + 1];
				}
			}
			/*printf("%d\n%c\n%c\n",n,*(max+1),*p);*/
			for (j = 1;j < 10;j++)
			{
				*(p.Substring(j)) = *(max.Substring(j));
				*(max.Substring(j)) = '\0';
			}
			System.out.printf("%s\n",strcat(a[i],b[i]));
		}
	}
}
