package <missing>;

public class GlobalMembers
{
	public static int compare(Object x, Object y)
	{
		return *((int)x) - (int)y;
	}
	public static int Main()
	{
		while (true)
		{
		int n;
		int i;
		int k = 0;
		int sum = 0;
		int tou;
		int wei;
		int[] tian = new int[1000];
		int[] qiwa = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
		break;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tian[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				qiwa[i] = Integer.parseInt(tempVar3);
			}
		}
		tou = n - 1;
		wei = n - 1;
		qsort(tian,n,(Integer.SIZE / Byte.SIZE),compare);
		qsort(qiwa,n,(Integer.SIZE / Byte.SIZE),compare);
		for (i = 0;i <= wei;)
		{
			if (tian[i] > qiwa[k])
			{
				sum = sum + 200;
				k++;
				i++;
				continue;
			}
			if (tian[i] < qiwa[k])
			{
				sum = sum - 200;
				tou--;
				i++;
				continue;
			}
			if (tian[i] == qiwa[k])
			{
				if (tian[wei] > qiwa[tou])
				{
					sum = sum + 200;
					wei--;
					tou--;
					continue;
				}
				else
				{

				if (tian[i] == qiwa[tou])
				{
					tou--;
					i++;
					continue;
				}
				else
				{
					sum = sum - 200;
					tou--;
					i++;
					continue;
				}
				}
			}
		}
		System.out.printf("%d\n",sum);


		}
	}
}

