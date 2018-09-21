package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0;
		int i;
		int j;
		int q = 0;
		int m = 1;
		int l = 0;
		int n;
		int[] a = new int[300];
		int[] b = new int[300];
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[k++] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
		}while (c != '\n');
		b[0] = a[0];
		for (i = 1;i < k;i++)
		{
			n = 0;
			for (j = 0;j < i;j++)
			{
				if (a[j] == a[i])
				{
					n = n++;
				}
			}
			if (n == 0)
			{
				b[m] = a[i];
				m = m++;
			}
		}
		//for (i=0;i<m;i++)
	//	printf("%d %d\n",b[i],m);
		for (i = 0;i < m;i++)
		{
			n = 0;
			for (j = 0;j < m;j++)
			{
				if (b[j] > b[i])
				{
					n = n++;
				}
			}
		//	printf("%d\n",n);
			if (n == 1)
			{
				q = i;
				l = l++;
			}
		}
		if (l == 1)
		{
		System.out.printf("%d\n",b[q]);
		}
		else
		{
			System.out.print("No\n");
		}
		return 0;
	}

}

