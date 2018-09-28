package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int num = 0;
		int c;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int[] q = new int[10000];
		int[] z = new int[10000];
		int[] v = new int[10000];
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
		for (i = m,c = 0;i <= n;i++)
		{
			num = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					num = 1;
				}
			}
			if (num == 0)
			{
				a[c] = i;
				z[c] = i;
				v[c] = i;
				c++;

			}
		}
		//printf("%d",c);
		int temp = 0;
		int d;
		int e = 0;
		int word;
		for (i = 0;i < c;i++)
		{
			temp = 0;
			do
			{
				a[i] = a[i] / 10;
				temp++;
			} while (a[i] != 0);

			do
			{
			b[i] = (z[i] % 10) * Math.pow(10,temp - 1) + b[i];
				z[i] = z[i] / 10;
				temp = temp - 1;
			}while (z[i] != 0);
		} //printf("%d\n%d\n",temp,b[0]);
		for (i = 0,e = 0;i < c;i++)
		{
			if (v[i] == b[i])
			{
				q[e] = v[i];
				e++;
			}
		}
		//printf("%d",e);
		if (e == 0)
		{
			System.out.print("no");
		}
		else
		{
		System.out.printf("%d",q[0]);
		for (i = 1;i < e;i++)
		{
			System.out.printf(",%d",q[i]);
		}
		}
		return 0;
	}






}

