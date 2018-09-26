package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a,sum,i,k,n,m,j=0;
	int a;
	int sum;
	int i;
	int k;
	int n;
	int m;
	int j = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= k;i++)
	{
		sum = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc((Integer.SIZE / Byte.SIZE) * (n * m));
		for (j = 0;j < n * m;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a + j = Integer.parseInt(tempVar4);
			}
			if ((j + 1 <= n) || (j>(n * m - n - 1)) || ((j + 1) % n == 1) || ((j + 1) % n == 0))
			{
				sum += *(a + j);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			 free(a);
		System.out.printf("%d\n",sum);
	}

	}

}

