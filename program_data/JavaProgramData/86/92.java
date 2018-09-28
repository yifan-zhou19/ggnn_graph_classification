package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int times;
		int[] a = new int[60];
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
			n--;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < k;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
			}
			times = 60;
			i = 0;
			while (i < k && a[i] < times)
			{
				if (times - 3 < a[i])
				{
					times = a[i];
				}
				else
				{
					times = times - 3;
				}
				i++;
			}
			System.out.printf("%d\n",times);
		}
	}
}

