package <missing>;

public class GlobalMembers
{
	public static int Isprime(int k)
	{
		int j;
		for (j = 2;j < k;j++)
		{
			if (k % j == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Ishuiwen(int k)
	{
		int j;
		int p;
		int q;
		int sum;
		int temp;
		j = 0;
		temp = k;
		while (temp > 0) //why not k/pow(10,j)>0//
		{
			j++;
			temp = temp / 10;
		}

		p = j;

		q = k;
		sum = 0;
		while (k / (Math.pow(10,j)) < k)
		{
			sum = sum + (q % 10) * (int)Math.pow(10,(j - 1));
			q = q / 10;
			j--;
		}


		if (sum == k)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int m;
		int n;
		int i;
		int t;
		int[] a = new int[100];
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


		t = 0;
		for (i = m;i <= n;i++)
		{
			if (Isprime(i) != 0)
			{
				if (Ishuiwen(i) != 0)
				{
					a[t] = i;
					t++;
				}
			}
		}


		if (t == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i < t;i++)
			{
				System.out.printf(",%d",a[i]);
			}
			System.out.print("\n");
		}

		return 0;
	}

}

