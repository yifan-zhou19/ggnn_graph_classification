package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] sz = new int[LEN];
		int[] szz = new int[LEN];
		float[] s = new float[LEN];
		float b;
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
							 szz[i] = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 sz[i] = Integer.parseInt(tempVar3);
						 }
						 s[i] = 1.0 * sz[i] / szz[i];
		}
						 for (i = 1;i < n;i++)
						 {
										  b = s[i] - s[0];
										  if (b > 0.05F)
										  {
										  System.out.print("better\n");
										  }
										  else if (b < -0.05F)
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

