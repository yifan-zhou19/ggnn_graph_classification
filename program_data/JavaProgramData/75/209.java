public class men
{
	public int x;
	public int y;
}

package <missing>;

public class GlobalMembers
{
	public static men[] time = tangible.Arrays.initializeWithDefaultmenInstances(1000);

	public static int Main()
	{
		int i = 0;
		int j;
		int max = 0;
		int n;
		int sum;
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				time[i].x = Integer.parseInt(tempVar);
			}
			i++;
		}while ((c = System.in.read()) != '\n');
		i = 0;
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				time[i].y = Integer.parseInt(tempVar2);
			}
			i++;
		}while ((c = System.in.read()) != '\n');
		n = i;
		System.out.printf("%d ",n);
		for (i = 0;i < 1000;i++)
		{
			sum = 0;
			for (j = 0;j < n;j++)
			{
				if (i >= time[j].x != 0 && i < time[j].y)
				{
					sum++;
				}
			}
			if (sum > max)
			{
				max = sum;
			}
		}
		System.out.printf("%d\n",max);
		return 0;
	}
}

