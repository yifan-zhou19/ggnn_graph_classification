package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		float[] c = new float[1000];
		int n;
		int i;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			c[i - 1] = (float)a / b;
		}
		for (i = 1;i <= n - 1;i++)
		{
			if (c[i] - c[0] > 0.05F)
			{
				System.out.print("better\n");
			}
		else if (c[0] - c[i] > 0.05F)
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

