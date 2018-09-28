package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] t = new int[1000];
		int total = 0;
		int[] so = new int[100];
		int temp = 0;
		int q = 0;
		int j = 0;
		double max = 0.0;
		double aver = 0.0;
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
				t[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			total = total + t[i];
		}
		aver = (double)total / (double)n;
		for (i = 0;i < n;i++)
		{
			if (t[i] - aver > max || aver - t[i] > max)
			{
				if (t[i] - aver > 0)
				{
					max = t[i] - aver;
				}
				else
				{
					max = aver - t[i];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (t[i] - aver - max < 0.00001 && max - (t[i] - aver) < 0.00001 || aver - t[i] - max < 0.00001 && max - (aver - t[i]) < 0.00001)
			{
				so[q] = t[i];
				q++;
			}
		}
		for (i = 0;i < q - 2;i++)
		{
			for (j = 0;j < q - 1 - i;j++)
			{
				if (so[j] < so[j + 1])
				{
					temp = so[j];
					so[j] = so[j + 1];
					so[j + 1] = temp;
				}
			}
		}
			System.out.printf("%d",so[0]);
		for (i = 1;i < q;i++)
		{
			System.out.printf(",%d",so[i]);
		}


	}
}

