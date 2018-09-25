package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] left = new int[n];
		int[] right = new int[n];
		int i;
		int j;
		int tmp;
		int sign = 0;
		int min;
		int max;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				left[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				right[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (left[j] < left[j - 1])
				{
					tmp = left[j];
					left[j] = left[j - 1];
					left[j - 1] = tmp;
					tmp = right[j];
					right[j] = right[j - 1];
					right[j - 1] = tmp;
				}
			}
		}
		min = left[0];
		max = right[0];
		for (i = 1;i < n;i++)
		{
			for (j = 1;j < n;j++)
			{
				if (left[j] <= max)
				{
					if (right[j] > max)
					{
						max = right[j];
					}
					sign++;
				}
			}
			if (sign == 0)
			{
				break;
			}
			else if (i == n - 1 && sign == n - 1)
			{
				sign = 1;
			}
			else
			{
				sign = 0;
			}
		}
		if (i == n && sign == 1)
		{
			System.out.printf("%d %d\n",min,max);
		}
		else
		{
			System.out.print("no\n");
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(left);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(right);
		return 0;
	}
}

