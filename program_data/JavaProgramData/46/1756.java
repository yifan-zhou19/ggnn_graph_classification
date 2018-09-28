package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		int m;
		int i;
		int j;
		int k;
		int p;
		int q;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		p = (n - 1) / 2;
		q = (m - 1) / 2;
		for (k = 0;k <= p != 0 && k <= q;k++)
		{
			for (i = k,j = k;j < m - k;j++)
			{
				sum++;
				System.out.printf("%d\n",a[i][j]);
				if (sum == n * m)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto end;
				}
			}
			for (j = m - 1 - k,i = k + 1;i < n - k;i++)
			{

				sum++;
				System.out.printf("%d\n",a[i][j]);
				if (sum == n * m)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto end;
				}
			}

			for (i = n - 1 - k,j = m - k - 2;j >= k;j--)
			{
				sum++;
				System.out.printf("%d\n",a[i][j]);
				if (sum == n * m)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto end;
				}
			}

			for (j = k,i = n - k - 2;i >= k + 1;i--)
			{
				sum++;
				System.out.printf("%d\n",a[i][j]);
				if (sum == n * m)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto end;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		end:
		return 0;
	}


}

