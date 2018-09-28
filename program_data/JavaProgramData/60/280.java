package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int i;
		int j;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] c = new int[n];
		int a = 0;
		int d = 0;
		int e = 0;
		for (i = 2;i <= n;i++)
		{
						for (k = 2;k < i;k++)
						{
										b = i % k;
										if (b == 0)
										{
										break;
										}
										else
										{
										a = a + 1;
										}
						}
						if (a == i - 2)
						{
								   c[d] = i;
								   d = d + 1;
						}
						a = 0;
		}

		for (j = 0;j <= (n / 2);j++)
		{
			 if ((c[j] + 2) == c[j + 1])
			 {
				System.out.printf("%d %d\n",c[j],c[j + 1]);
			 e = e+1;
			 }
		}
		if (e == 0)
		{
		System.out.print("empty");
		}
		System.in.read();
		System.in.read();



	}
}

