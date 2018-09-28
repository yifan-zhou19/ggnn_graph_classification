package <missing>;

public class GlobalMembers
{
	public static int max_people(int[] x, int[] y, int num)
	{
		int i;
		int j;
		int max = 0;
		int temp;
		for (i = 0;i < 1000;i++)
		{
			temp = 0;
			for (j = 0;j < num;j++)
			{
				if ((i >= x[j]) && (i < y[j]))
				{
					temp++;
				}
			}

			if (temp > max)
			{
				max = temp;
			}
		}
		return max;
	}


	public static void Main()
	{
		int i;
		int num = 0;
		int[] x = new int[8000];
		int[] y = new int[8000];
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[num++] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
		}while (c != '\n');
		num = 0;
		do
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[num++] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
		}while (c != '\n');
		System.out.printf("%d ",num);
		int max = max_people(x, y, num);
		System.out.printf("%d",max);
	}
}

