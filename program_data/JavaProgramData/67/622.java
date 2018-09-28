package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		int i = 0;
		float zs_1 = 0F;
		float yx_1 = 0F;
		float zs = 0F;
		float yx = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zs_1 = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			yx_1 = Float.parseFloat(tempVar3);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				zs = Float.parseFloat(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				yx = Float.parseFloat(tempVar5);
			}
			if ((yx_1 / zs_1 - yx / zs) > 0.05)
			{
				System.out.print("worse\n");
			}
			else if ((yx / zs - yx_1 / zs_1) < 0.05)
			{
				System.out.print("same\n");
			}
			else
			{
				System.out.print("better\n");
			}
			yx = 0F;
			zs = 0F;
		}
	}


}

