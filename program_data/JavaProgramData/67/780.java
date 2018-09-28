package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] s = new int[100];
		int[] t = new int[100];
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
				s[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				t[i] = Integer.parseInt(tempVar3);
			}
		}
		float k;
		k = (double)t[0] / s[0];
		for (i = 1;i < n;i++)
		{
			if ((double)t[i] / s[i] - k > 0.05F)
			{
				System.out.print("better\n");
			}
			else if ((double)t[i] / s[i] - k < -0.05F)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

