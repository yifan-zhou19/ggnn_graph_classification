package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int mingliu = new int(int k,int * *pp,int n,int count);
		int[][] pp;
		int n;
		int mingliushu = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		pp = new int[n * n + 1];
		int q = 0;
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   pp[q] = (int)malloc((Integer.SIZE / Byte.SIZE) * 2);
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   pp[q] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   pp[q] + 1 = Integer.parseInt(tempVar3);
		   }
		   if (pp[q] == 0 && *(pp[q] + 1) == 0)
		   {
			   break;
		   }
		   q++;
		}
		for (int i = 0;i < q;i++)
		{
			if (*(pp[i] + 1) >= 0)
			{
			mingliushu += mingliu(*(pp[i] + 1), pp, n, q);
			}
		}
		if (mingliushu == 0)
		{
			System.out.print("NOT FOUND");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pp);
		pp = null;
		return 0;
	}



	public static int mingliu(int k, int[][] pp, int n, int count) //k??????????????
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (int i = 0;i < n;i++)
		{
			*(a + i) = 0;
		}
		int value = 1;
				for (int j = 0;j < count;j++)
				{
					if (*(pp[j] + 1) == k)
					{
						*(pp[j] + 1) = -k - 1;
						*(a + pp[j][0]) = 1;

					}
				}
				*(a + k) = 1;
				for (int j = 0;j < n;j++)
				{
					if (*(a + j) == 0)
					{
						value = 0;
						break;
					}
				}
				if (value == 1)
				{
					System.out.printf("%d",k);
				}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(a);
	return value;
	}
}

