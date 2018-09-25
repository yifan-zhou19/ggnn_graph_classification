package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[100];
		int i = 3;
		int k;
		int max;
		int min;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(m[1]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			(m[2]) = Integer.parseInt(tempVar3);
		}
		{
			if (m[1] > m[2])
			{
			max = m[1];
			min = m[2];
			}
		else
		{
			max = m[2];
			min = m[1];
		}
		for (i = 3;i < k + 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m[i] = Integer.parseInt(tempVar4);
			}
			if (m[i] > max)
			{
				min = max;
				max = m[i];
			}
			else
			{
				if (m[i] > min)
				{
				min = m[i];
				}
			}
		}
	}
		System.out.printf("%d\n%d\n",max,min);

		return 0;
	}

}

