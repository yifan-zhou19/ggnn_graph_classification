package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] n = new int[100];
		int i;
		int p;
		float a;
		float[] s = new float[100];
		float b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n[m] = Integer.parseInt(tempVar3);
		}

		for (i = 1;i <= m;i++)
		{
			if (n[i] == 0)
			{
				System.out.print("0");
			}
			else
			{
				for (p = 1,a = 2.0F,b = 0F;p <= n[i];p++)
				{
					b = b + a;
					a = 1 + 1.0 / a;
				s[i] = b;
				}
			}
		}
		for (i = 1;i <= m;i++)
		{
			System.out.printf("%.3f\n",s[i]);
		}
	}

}

