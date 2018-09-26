package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b = 1;
		int i;
		int n;
		int m;
		int j;
		int[] q = new int[5000];
		int t = 0;
		int w = 0;
		int p;
		int[] k = new int[5000];
		int temp;
		int c = 0;
		int[] o = new int[100];

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
	if (i % 2 == 0)
	{
		b = 0;
	}
	for (j = 3;j <= Math.sqrt(i);j = j + 2)
	{
			if (i % j == 0)
			{
				b = 0;
				break;
			}
	}
		if (b != 0)
		{
			q[t] = i;
		t++;
		}
		b = 1;
		}
		for (i = 0;i < t;i++)
		{
			k[i] = 0;
					temp = q[i];
			while (temp != 0)
			{
		k[i] = k[i] * 10 + temp % 10;
		temp = temp / 10;

			}
		}
		for (i = 0;i < t;i++)
		{

	if (k[i] == q[i] && k[i] != 0)
	{
	o[c] = q[i];
	c++;
	}
		}
	if (c == 0)
	{
		System.out.print("no");
	}
	else
	{
	for (i = 0;i < c;i++)
	{
	i == 0?System.out.printf("%d",o[i]):printf(",%d",o[i]);
	}
	}
	}

}

