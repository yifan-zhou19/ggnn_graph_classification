package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int[] maxlen = new int[100];
		int i;
		int j;
		int temp;
		int temp2 = 1;
		int temp3;
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
		}
		for (i = 0;i < n;i++)
		{
			temp2 = 1;
			if (i == 0)
			{
				maxlen[i] = 1;
			}
			else
			{
				temp3 = 0;
				for (j = i - 1;j >= 0;j--)
				{
					if (a[j] >= a[i])
					{
						if (maxlen[j] > maxlen[temp3])
						{
						temp3 = j;
						}
						temp2 = 0;

					}
				}
				maxlen[i] = maxlen[temp3] + 1;
				if (temp2 == 1)
				{
					maxlen[i] = 1;
				}
			}
		}
		temp = 0;
		for (i = 0;i < n;i++)
		{
			if (maxlen[i] > maxlen[temp])
			{
			temp = i;
			}
		}
		System.out.printf("%d",maxlen[temp]);
	}

}

