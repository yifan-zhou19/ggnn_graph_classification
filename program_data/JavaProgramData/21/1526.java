package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] s = new int[300];
		int max;
		int min;
		int ave;
		float ave2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[0] = Integer.parseInt(tempVar2);
		}
		ave = s[0];
		max = s[0];
		min = s[0];
		for (i = 1;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = Integer.parseInt(tempVar3);
			}
			if (s[i] > max)
			{
				max = s[i];
			}
			if (s[i] < min)
			{
				min = s[i];
			}
			ave = ave + s[i];
		}
		ave2 = (float)ave;
		ave2 = ave2 / n;
		if (Math.abs((max - ave2) - (ave2 - min)) < 0.001)
		{
			System.out.printf("%d,%d",min,max);
		}
		else if (max + min > 2 * ave2)
		{
			System.out.printf("%d",max);
		}
		else if (max + min < 2 * ave2)
		{
			System.out.printf("%d",min);
		}




		return 0;
	}

}

