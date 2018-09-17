package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		int x;
		int s;
		int c;
		int y;
		int e = 0;
		int t;
		int q;
		int n = 0;
		int j;
		int[] b = new int[1000];
		int i;
		int[] a = new int[1000];
		int num;
		num = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		s = x;
		c = y;
		if (x == 1 || y == 1)
		{
			System.out.print("1\n");
		}
		else
		{
		do
		{
			x = x / 2;
			n++;
		} while (x != 1);

		do
		{
			e++;
			y = y / 2;
		} while (y != 1);

		e++;
		n++;


		for (i = 1;i <= n;i++)
		{
			a[i] = s;
			s = s / 2;
		}

		for (j = 1;j <= e;j++)
		{
			b[j] = c;
			c = c / 2;
		}

		for (t = 1;t <= n;t++)
		{
			for (q = 1;q <= e;q++)
			{
			if (a[t] == b[q])
			{
					System.out.printf("%d\n",b[q]);
				num = 0;
					break;
			}
			}
			if (num == 0)
			{
				break;
			}

		}
		}
	}
}

