package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		char[][] c = new char[100][101];
		int i;
		int n;
		int p;
		int q;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
		}
		//printf("%s,%s\n",a,b);
		for (i = 0;i < n;)
		{
			for (t = 0,p = String.valueOf(a[i]).length() - 1,q = String.valueOf(b[i]).length() - 1;p >= 0;p--,q--)
			{
				if (p >= 0 && q >= 0 && a[i][p] >= b[i][q])
				{
					t = 0;
					c[i][p] = a[i][p] - b[i][q] + t;
				}
				else if (p >= 0 && q >= 0 && a[i][p] < b[i][q])
				{
					t = 1;
					c[i][p] = a[i][p] + t * 10 - b[i][q];
					a[i][p - 1] = a[i][p - 1] - 1;
				}
				else if (p >= 0 && q < 0)
				{
					t = 0;
					c[i][p] = a[i][p] - 48;
				}
				//printf("%d,%d\n",p,c[i][p]);
				c[i][p] += 48;
			}
			//printf(" %d\n",strlen(a));
			c[i][String.valueOf(a[i]).length()] = '\0';
			i++;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",c[i]);
		}
		return 0;
	}
}

