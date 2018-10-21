package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int[] p = new int[200];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int [200])malloc(200 * 200 * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < 200;i++)
		{
			for (j = 0;j < 200;j++)
			{
				*(p[i] + j) = -32767;
			}
		}
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
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[i] + j = tempVar3;
				}
			}
		}
		for (k = 0;k <= n + m - 2;k++)
		{
			for (i = 0;i <= k != 0 && i < n;i++)
			{
				j = k - i;
				if (*(p[i] + j) > -32767)
				{
				System.out.printf("%d\n",*(p[i] + j));
				}
			}
		}
	}

}

