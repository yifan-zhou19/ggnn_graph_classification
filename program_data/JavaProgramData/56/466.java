package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] scores = new int[5];
		int a;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 0 && n < 10)
		{
			a = 1;
		}
		else if (n >= 10 && n < 100)
		{
			a = 2;
		}
		else if (n >= 100 && n < 1000)
		{
			a = 3;
		}
		else if (n >= 1000 && n < 10000)
		{
			a = 4;
		}
		else if (n >= 10000 && n <= 99999)
		{
			a = 5;
		}
		for (i = a - 1;i >= 0;i--)
		{
			m = Math.pow(10,i);
			scores[i] = n / m;
			n = n - scores[i] * m;
		}
		for (i = 0;i < a;i++)
		{
			System.out.printf("%d",scores[i]);
		}
		return 0;
	}

}

