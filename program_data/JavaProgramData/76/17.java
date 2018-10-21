package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int n;
		int min = 10001;
		int max = 0;
		int i;
		int num;
		int flag;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (t = min + 0.5;t <= max - 0.5;t++)
		{
			flag = 0;
			for (i = 0;i < n;i++)
			{
				if (t >= a[i] != 0 && t <= b[i])
				{
					flag++;
				}
			}
			if (flag == 0)
			{
				System.out.print("no");
				break;
			}
		}
		if (flag != 0)
		{
			System.out.printf("%d %d",min,max);
		}
	}










}

