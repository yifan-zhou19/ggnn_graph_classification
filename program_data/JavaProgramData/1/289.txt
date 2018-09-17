package <missing>;

public class GlobalMembers
{
	public static int t;
	public static int a;
	public static int flag;
	public static int a1;
	/*bool prime(int k)
	{
		int j, sqrt_k;
		if (k == 2)
			return 1;
		else
		{
			sqrt_k = sqrt((double)k);
			for (j = 2; j <= sqrt_k; j++)
			{
				if (k % (int)j == 0)
					break;
			}
			if (j == sqrt_k + 1)
				return 1;
			else
				return 0;
		}
	}
	/*
	void find(int m)
	{
		int i;
		if (prime(m))
		{
			flag = 1;
			t++;
		//	cout << t << endl;
			return;
		}
		for (i = 2; i <= sqrt((double) m); i++)
		{
			if ((m % i == 0) && (a1 <= i))
			{
			//	cout << a1 << 2<< endl;
				//cout << i <<  " " << 1 <<endl;
				a1 = i;
				//if (!prime(m / i))
					t++;
			//	cout << t << endl;
				find(m / i);
			}
		}
		return;
	}*/
	public static void find(int m, int min)
	{
		int i;
		//int a[];
		for (i = 2; i <= Math.sqrt((double)m); i++)
		{
			if (m % i == 0)
			{
				if (i >= min)
				{
				//if (a1 >= i)
					t++;
			//	if (!/*((m / i > i) && */(prime(m / i)))
				//	cout << t << " ";
				//	cout <<i<<" " << m / i << " " << t <<endl;
				//	t++;
				//	cout << " " << a1 <<endl;
					//cout << t<<endl;
				//	a1 = i;
					min = i;
					//cout << min << endl;
					find(m / i, min);

				}

			}
		}
		/*if (i == (int)sqrt((double)m) - 1)
			return;*/
		return;
	}
	public static int Main()
	{
		int n;
		int ii;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (ii = 1; ii <= n; ii++)
		{
			t = 0;
			flag = 0;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		//	if (prime(a)) t--;
			a1 = a;
			find(a, 2);
			System.out.print(t + 1);
			System.out.print("\n");
		}

		return 0;
	}
}

