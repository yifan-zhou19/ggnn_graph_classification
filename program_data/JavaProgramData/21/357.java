public class num
{
   public int a;
   public double b;
}

package <missing>;

public class GlobalMembers
{
	public static num[] num = tangible.Arrays.initializeWithDefaultnumInstances(300);
	public static void Main()
	{
		int n;
		int i;
		int j;
		double sum = 0;
		double t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i].a = Integer.parseInt(tempVar2);
			}
			sum = sum + num[i].a;
		}
		t = sum / n;
		for (i = 0;i < n;i++)
		{
			if (num[i].a > t)
			{
				num[i].b = num[i].a - t;
			}
			else
			{
				num[i].b = t - num[i].a;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (num[j].b < num[j + 1].b)
				{
					num[300] = num[j];
					num[j] = num[j + 1];
					num[j + 1] = num[300];
				}
			}
		}
		if (num[0].b != num[1].b)
		{
			System.out.printf("%d\n",num[0].a);
		}
		else if (num[0].b == num[1].b)
		{
			System.out.printf("%d",num[0].a);
			System.out.printf(",%d\n",num[1].a);
		}
	}


}

