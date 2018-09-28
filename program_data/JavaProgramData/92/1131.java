package <missing>;

public class GlobalMembers
{
	public static int getcmp(int a,int b)
	{
		if (a > b)
		{
			return 1;
		}
		else if (a < b)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	public static int cmp(Object a, Object b)
	{
		return *(int)b - (int)a;
	}

	public static int Main()
	{
		int n;
		int i;
		int temp;
		int[] khorse = new int[1000];
		int[] thorse = new int[1000];
		int profit;
		int profitold;
		int k;
		for (;;)
		{
			profitold = -1000000;
			k = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(khorse,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(thorse,0,(Integer.SIZE / Byte.SIZE));
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;++i)
			{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   thorse[i] = Integer.parseInt(tempVar2);
			   }
			}
			for (i = 0;i < n;++i)
			{
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   khorse[i] = Integer.parseInt(tempVar3);
			   }
			}
			qsort(thorse,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(khorse,n,(Integer.SIZE / Byte.SIZE),cmp);
			for (;k <= n;)
			{
				profit = 0;
				for (i = 0;i < k;++i)
				{
					profit += getcmp(thorse[n - 1 - i], khorse[i]) * 200;
				}
				for (i = 0;i < n - k;++i)
				{
					profit += getcmp(thorse[i], khorse[i + k]) * 200;
				}
				if (profit < profitold)
				{
					break;
				}
				profitold = profit;
				k++;
			}
			System.out.printf("%d\n",profitold);
		}
	}

}

