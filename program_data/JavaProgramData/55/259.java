package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j = 0;
		int k;
		int b;
		int a;
		int[] x = new int[20];
		int[] y = new int[20];
		int M;
		int N = 0;
		String s = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		k = s.length();
		for (i = 0;i < k;i++)
		{
			if (s.charAt(i) > 47 && s.charAt(i) < 58)
			{
				x[i] = s.charAt(i) - 48;
			}
			else if (s.charAt(i) > 64 && s.charAt(i) < 90)
			{
				x[i] = s.charAt(i) - 55;
			}
			else if (s.charAt(i) > 96 && s.charAt(i) < 123)
			{
				x[i] = s.charAt(i) - 87;
			}
		}
		for (i = 0;i < k;i++)
		{
			N = N + x[i] * Math.pow(a,k - i - 1);
		}
		M = N;
		if (N == 0)
		{
			System.out.print("0\n");
		}
		else
		{
		do
		{
			N = N / b;
			j++;
		} while (N >= b);
		for (i = 0;i <= j;i++)
		{
			y[i] = M % b;
			M = M / b;
			if (y[i] < 10)
			{
				y[i] = y[i] + 48;
			}
			else if (y[i] >= 10)
			{
				y[i] = y[i] + 55;
			}
		}
		for (i = j;i >= 0;i--)
		{
			System.out.printf("%c",y[i]);
		}
		}
	}
}

