package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] left = new int[100];
		int[] right = new int[100];
		int n;
		int i;
		int j;
		int t;
		int k;
		int l;
		int[] r = new int[100];
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
				left[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				right[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (left[j] > left[j + 1])
				{
					t = left[j];
					left[j] = left[j + 1];
					left[j + 1] = t;
				}
				if (right[j] > right[j + 1])
				{
					t = right[j];
					right[j] = right[j + 1];
					right[j + 1] = t;
				}
			}
		}

		k = 0;
		for (i = 0;i < n - 1;i++)
		{
			if (right[i] < left[i + 1])
			{
				System.out.print("no\n");
				break;
			}
			else
			{
				k++;
			}
		}
		l = 0;
		for (i = n;i >= 0;i--)
		{
			r[l++] = right[i];
		}

		if (k == n - 1)
		{
			System.out.printf("%d %d\n",left[0],r[1]);
		}
		return 0;
	}



}

