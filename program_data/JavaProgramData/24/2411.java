package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[250][30];
		char c = 'a';
		String b = new String(new char[30]);
		int i = 0;
		int j = 0;
		int k = 0;
		int l;
		int n;
		int m;
		int x;
		int z;
		int y;
		int[] d = new int[250];
		int flag;
		while (c != '\n')
		{
			c = System.in.read();
			if (c != ' ' && c != ',' && c != '\n')
			{
				a[i][j] = c;
				j++;
				flag = 1;
			}
			if (c == ' ' && flag == 1 || c == ',' && flag == 1 || c == '\n' && flag == 1)
			{
				a[i][j] = '\0';
				d[i] = j;
				j = 0;
				i++;
				flag = 0;
			}
		}
		 n = i;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (d[i] > d[j] || d[i] == d[j] && i <= j)
				{
					k++;
				}
			}
			if (k == n)
			{
				break;
			}
			else
			{
				k = 0;
			}
		}
		System.out.printf("%s\n",a[i]);
	k = 0;
	 for (i = 0;i < n;i++)
	 {
			for (j = 0;j < n;j++)
			{
				if (d[i] < d[j] || d[i] == d[j] && i <= j)
				{
					k++;
				}
			}
			if (k == n)
			{
				break;
			}
			else
			{
				k = 0;
			}
	 }
		System.out.printf("%s\n",a[i]);
	}

}
