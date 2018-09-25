package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = int k; //???????
		int g = int k; //????????
		int length = int k; //????????
		int i;
		int m;
		int n;
		int N = 0;
		int[] a = new int[1000]; //????????
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
		for (i = m;i <= n;i++)
		{
			if (i % 2 != 0)
			{
				if (f(i) != 0 && g(i) != 0)
				{
					N++;
				a[N - 1] = i;
				}
			}
			else if (i == 2)
			{
					N++;
				a[N - 1] = i;
			}
		}
		if (N == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = 0;i < N - 1;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d\n",a[N - 1]);
		}
	}

	public static int f(int k)
	{
		int i;
		int p;
		if (k >= 4)
		{
			p = Math.sqrt(k);
			for (i = 2;i <= p;i++)
			{
			if (k % i == 0)
			{
			return 0;
			break;
			}
			else if (i == p)
			{
				return 1;
			}
			}
		}
		else if (k == 3)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int g(int k)
	{
		int p;
		int i;
		int q;
		int r;
		if (k >= 10)
		{
			p = length(k);

		   for (i = 1;i <= p / 2;i++)
		   {
			   q = k / Math.pow(10,i - 1);
			  r = (int)(k / Math.pow(10,p - i));
			if ((q % 10) != r % 10)
			{
				return 0;
			break;
			}
			else if (i == p / 2)
			{
				return 1;
			}
		   }
		}
		else if (k > 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int length(int k) //?????????
	{
		int i;
		int m = 1;

		for (i = 1;;i++)
		{
			if (k >= Math.pow(10,i))
			{
				m++;
			}
			else
			{
				break;
			}
		}
		return m;
	}







}

