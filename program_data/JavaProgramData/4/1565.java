package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[120];
		int i;
		int j;
		int k;
		int n;
		int m;
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int [120])malloc(200 * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] + j = tempVar3;
				}
			}
		}
		/*for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
				printf("%d ",*(*(a+i)+j));
		}*/
		for (k = 0;k <= n + m - 2;k++) //k?i?j???????????k?0?n+m-2?????
		{
			for (i = 0;(i <= k) && (i < n);i++) //?????k???i?0???i??????i<=k?i<n
			{
				j = k - i;
				if (j < m)
				{
				System.out.printf("%d\n",*(a[i] + j));
				}
			}
		}
	}
}

