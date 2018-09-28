package <missing>;

public class GlobalMembers
{
	public static int f(int i)
	{
		int j;
		int w;
		w = 0;
		if (i <= 2)
		{
			w = 1;
		}
		else
		{
		for (j = 2;j < i;j++)
		{
			if (i % j == 0)
			{
				w = 1;
			}
		}
		}
		return (w);
	}

	public static void Main()
	{
	int m;
	int n;
	int i;
	int[] num = new int[100];
	int j;
	int a;
	int sum;
	int I;
	int w;
	int[] ans = new int[100];
	int K;
	int k;
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
	for (i = m,k = 0,w = 0;i <= n;i++)
	{
		I = i;
		a = (int)Math.log10(i);
		for (j = 1;j <= a + 1;j++)
		{
			num[j] = i / (int)Math.pow(10,a - j + 1);
			i = i % (int)Math.pow(10,a - j + 1);
		}
		for (j = a + 1,sum = 0;j >= 1;j--)
		{
		sum = sum + num[j] * (int)Math.pow(10,j - 1);
		}
		if (I == sum)
		{
			if (f(I) == 0)
			{
				ans[k] = I;
				k++;
			}
		}
		i = I;
	}
	if (k == 0)
	{
		System.out.print("no");
	}
	else
	{
	K = k - 1;
	for (k = 0;k < K;k++)
	{
		System.out.printf("%d,",ans[k]);
	}
	System.out.printf("%d",ans[k]);
	}
	}
}

