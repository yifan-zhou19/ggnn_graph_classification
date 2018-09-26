package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i = 0;
		int j = 0;
		int l = 0;
		int k;
		int c;
		int[] t = new int[3000];
		int d;
		int flag = 1;
		int e = 0;
		int num;
		char[][] a = new char[3000][500];
		char[][] b = new char[1000][500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (c = m;c <= n;c++)
		{
			k = Math.sqrt(c);
			for (i = 2;i <= k;i++)
			{
				if (c % i == 0)
				{
					break;
				}
			}
				if (i >= k + 1 && c != 1)
				{
					t[j] = c;
				//	printf("%d\n",c);
					j++;
				}
		}
		if (j == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < j;i++)
			{
				e = 0;
				while (t[i] != 0)
				{
					a[i][e] = t[i] % 10 + '0';
					t[i] = t[i] / 10;
					e++;
				}
				a[i][e] = '\0';
			//	printf("%s\n",a[i]);
			}
			e = 0;
			for (i = 0;i < j;i++)
			{

				for (l = 0;l < String.valueOf(a[i]).length() / 2;l++)
				{
					d = String.valueOf(a[i]).length() - 1 - l;
					if (a[i][l] != a[i][d])
					{
						flag = 0;
						break;
					}
					else
					{
						flag = 1;
					}
				}
				if (flag != 0)
				{
					for (l = 0;l < String.valueOf(a[i]).length();l++)
					{
						b[e][l] = a[i][l];
					}
					b[e][l] = '\0';
				   //   printf("%s\n",b[e]);
					e++;
					//printf("%d\n",e);
				}
			}
			num = e-1;
			//printf("%d\n",num);
		}
			if (e == 0)
			{
				System.out.print("no");
			}
			else
			{
				for (i = 0;i < num;i++)
				{
					System.out.printf("%s,",b[i]);
				}
				System.out.printf("%s",b[i]);
			}
	}
}

