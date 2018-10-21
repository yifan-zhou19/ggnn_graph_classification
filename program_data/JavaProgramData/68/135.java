package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static isprime(int i) // ??i????,�?�?�?i�
	{
		int j;
		int flag = 1;
		double k;
		k = Math.sqrt(i);
		for (j = 2;j <= k;j++) //????2???6?????????�2???�??
		{
			if (i % j == 0)
			{
				flag = 0;
				break;
			}
		}
			return flag;
	}

	public static int Main()
	{
		int n;
		int i;
		int c;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (c = 6;c <= n;c += 2)
		{
			for (i = 3;i < c;i++)
			{
				a = isprime(i);
				if (a == 1)
				{
					//printf("a%d\n",a);
					b = c - i;
					//printf("b%d\n",b);
					int k;
					k = isprime(b);
					//printf("c%d\n",k);
					if (k == 1)
					{
						break;
					}
				}



			}
			System.out.printf("%d=%d+%d\n",c,i,b);

		}
		return 0;
	}

}

