package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int[] p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *D;
		int D;
		p = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		D = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i] = Integer.parseInt(tempVar3);
			}
		}

		for (j = 0;j < n;j++)
		{
			if (j <= (m - 1))
			{
				D[j] = p[n - m + j];
			}
			if (j > (m - 1))
			{
				D[j] = p[j - m];
			}
		}


		for (k = 0;k < n;k++)
		{
			if (k < (n - 1))
			{
			System.out.printf("%d ",D[k]);
			}
			else
			{
				System.out.printf("%d",D[k]);
			}

		}

	}


}

