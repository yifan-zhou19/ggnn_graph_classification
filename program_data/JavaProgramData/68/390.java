package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int A;
		int B;
		int a;
		int b;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 6;k <= n;k = k + 2)
		{
			for (A = 3;A <= k / 2;A = A + 2)
			{
				for (a = 3;a <= Math.sqrt(A);a = a + 2)
				{
					if (A % a == 0)
					{
						break;
					}
				}
					if (a > Math.sqrt(A))
					{
						B = k - A;
					}
					for (b = 3;b <= Math.sqrt(B);b = b + 2)
					{
						if (B % b == 0)
						{
							break;
						}
					}
						if (b > Math.sqrt(B))
						{
							p = A;
							q = B;
							System.out.printf("%d=%d+%d\n",k,p,q);
							break;
						}
			}
		}
	}

}

