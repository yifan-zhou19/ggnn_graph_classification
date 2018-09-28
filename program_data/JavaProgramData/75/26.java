package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] arv = new int[1000];
		int[] lve = new int[1000];
		int min = 0;
		int max = 0;
		int num;
		int sum = 0;
		int person = 0;
		char c;
		int i;
		int j;
		int k;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				arv[i] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
			if (min > arv[i])
			{
				min = arv[i];
			}
			if (c == '\n')
			{
				num = i + 1;
				break;
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			lve[0] = Integer.parseInt(tempVar2);
		}
		max = lve[0];
		for (i = 1;i < num;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead(",");
			if (tempVar3 != null)
			{
				lve[i] = Integer.parseInt(tempVar3);
			}
			if (lve[i] > max)
			{
				max = lve[i];
			}
		}
		for (j = min;j <= max - 1;j++) //min,max-1~min+1,max
		{
			for (k = 0;k < num;k++)
			{
				if (arv[k] <= j != 0 && j + 1 <= lve[k])
				{
					sum++;
				}
			}
			if (sum > person)
			{
				person = sum;
			}
			sum = 0;
		}
		System.out.printf("%d %d\n",num,person);
		return 0;
	}

}

