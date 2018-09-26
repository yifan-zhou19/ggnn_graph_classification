package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int d;
		int prime = int num;
		int m;
		int n;
		int p;
		int q;
		int r;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (r = m;r <= n;r++)
		{
			p = reverse(r);
			q = prime(r);
			if (p == r && q == 1)
			{
				k++;
				if (k == 1)
				{
					System.out.printf("%d",r);
				}
				else
				{
					System.out.printf(",%d",r);
				}
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
	}
	public static int reverse(int d)
	{
		int c;
		int k;
		int i;
		int sum;
		int e;
		int[] b = new int[10];
		k = Math.log10(d);
		for (i = k;i >= 0;i--)
		{
			b[i] = d / Math.pow(10,i);
			d = d - b[i] * Math.pow(10,i);
		}
		for (i = 0;i <= k;i++)
		{
			if (b[i] != 0)
			{
				e = i;
				break;
			}
		}
		sum = b[k];
		for (i = k - 1;i >= e;i--)
		{
			sum = sum + b[i] * Math.pow(10,k - i);
		}
		return (sum);
	}
	public static int prime(int num)
	{
		int k;
		int i;
		k = Math.sqrt(num);
		for (i = 2;i <= k;i++)
		{
			if (num % i == 0)
			{
				break;
			}
		}
		if (i >= k + 1)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}

}

