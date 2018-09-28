package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[501];
		int[] up = new int[501];
		int n;
		int i1;
		int i2;
		int i3;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i2 = 0;
		for (i1 = 0;i1 < n;i1++)
		{
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				num[i1] = Integer.parseInt(tempVar2);
			}
			if (num[i1] % 2 == 1)
			{
				up[i2] = num[i1];
				i2++;
			}
		}
		i3 = 0;
		while (i3 < i2)
		{
			if (up[i3] > up[(i3) + 1])
			{
				t = up[(i3) + 1];
				up[(i3) + 1] = up[i3];
				up[i3] = t;
				i3--;
				if (i3 < 0)
				{
					i3++;
				}

			}
			else
			{
				i3++;
			}
		}
		for (i3 = 1;i3 < (i2);i3++)
		{
			System.out.printf("%d,",up[i3]);
		}
		System.out.printf("%d",up[i3]);
		return 0;
	}


}

