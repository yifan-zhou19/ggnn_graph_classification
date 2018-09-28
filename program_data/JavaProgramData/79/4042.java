package <missing>;

public class GlobalMembers
{
	public static int king(int n,int m)
	{
		int num;
		int k;
		int i;
		int j;
		int total = 0;
		int[] a = new int[300];

		for (i = 1;i <= n;i++)
		{
			a[i] = i;
		}
		for (j = 1;;j++)
		{
				k = j;

			num = 0;
			do
			{

				if (j % n != 0)
				{
				   if (a[j % n] != 0)
				   {
					num++;
				   }
				}
				else
				{
					if (a[n] != 0)
					{
						num++;
					}
				}
				if (num < m)
				{
					j++;
				}
			}while (num < m);
			if (j % n != 0)

			{
				a[j % n] = 0;
				total++;
			}
			else
			{
				a[n] = 0;
				total++;
			}
		if (total == n)
		{
			break;
		}
		}
		if (j % n != 0)
		{
			return (j % n);
		}
		else
		{
			return (n);
		}
	}
	public static void Main()
	{
		int l;
		int n;
		int m;
		int[] c = new int[20];
		int s;
		for (l = 0;;l++)
		{
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

			if (n == 0)
			{
				s = l;
				c[l] = 0;
				break;
			}
			c[l] = king(n, m);


		}
		l = 0;
		for (l = 0;l < s;l++)
		{

			System.out.printf("%d\n",c[l]);
		}




	}
}

