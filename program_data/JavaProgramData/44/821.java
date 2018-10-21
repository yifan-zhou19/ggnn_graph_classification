package <missing>;

public class GlobalMembers
{
	public static int FAN(int num)
	{
		int[] a = new int[100000];
		int i;
		int wei;
		int b;
		int c;
		int f = 0;
		wei = Math.log10(num) + 1;
		for (i = 1;i <= wei - 1;i++)
		{
			b = Math.pow(10,i);
			c = Math.pow(10,i - 1);
			a[i] = (num - num / b * b) / c;
		}
		a[i] = num / b;
		for (i = wei;i >= 1;i--)
		{
			f = f + a[i] * (Math.pow(10,wei - i));
		}
		return f;
	}
	public static int Main()
	{
		int N;
		int M;
		int i;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				N = Integer.parseInt(tempVar);
			}
			if (N == 0)
			{
				System.out.print("0\n");
			}
			else
			{
				if (N > 0)
				{
					System.out.printf("%d\n",FAN(N));
				}
				else
				{
					M = -N;
					System.out.printf("-%d\n",FAN(M));
				}
			}
		}
		return 0;
	}

}

