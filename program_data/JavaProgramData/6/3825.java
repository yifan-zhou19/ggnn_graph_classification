package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,i,k,m,n,t,sum[100]={0},j,q,x;
		int p;
		int i;
		int k;
		int m;
		int n;
		int t;
		int[] sum = new int[100];
		int j;
		int q;
		int x;
//C++ TO JAVA CONVERTER TODO TASK: The following line could not be converted:
	scanf("%d\n%",&k);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(10000 * (Integer.SIZE / Byte.SIZE));
		for (x = 0;x < k;x++)
		{
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
		for (i = 0;i < m * n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p + i = Integer.parseInt(tempVar4);
			}
		}
		for (j = 0;j < n;j++)
		{
		sum[x] = sum[x] + (*(p + j)) + (*(p + n * (m - 1) + j));
		}
		for (q = 1;q < m - 1;q++)
		{
		sum[x] = sum[x] + (*(p + q * n)) + (*(p + q * n + n - 1));
		}
		}
		for (x = 0;x < k;x++)
		{
			System.out.printf("%d\n",sum[x]);
		}
	}
}

