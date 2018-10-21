package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int[] num = new int[N + 1];
		int[] right = new int[N + 1];
		float[] k = new float[N + 1];
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
				num[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				right[i] = Integer.parseInt(tempVar3);
			}
			k[i] = (float)right[i] / num[i] * 100;

		}
		for (i = 1;i < n;i++)
		{
			if (k[0] - k[i] > 5F)
			{
				System.out.print("worse\n");
			}
			else if (k[i] - k[0] > 5F)
			{
				System.out.print("better\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}


	}

}

