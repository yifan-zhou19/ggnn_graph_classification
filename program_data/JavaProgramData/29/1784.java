package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		float ai = 1F;
		float aj;
		float am = 0F;
		float bi = 2F;
		float bj;
		float bm = 5F;
		int[] a = new int[1000];
		int i;
		int j;
		int m;
		float s = 0F;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 1;j <= n;j++)
		{
			for (m = 1;m <= a[j];m++)
			{
				if (m == 1)
				{
					aj = 2F;
				}
				else
				{
					aj = am;
				}
				if (m == 1)
				{
					bj = 3F;
				}
				else
				{
					bj = bm;
				}
				s = s + bi / ai;
				am = ai + aj;
				bm = bi + bj;
				ai = aj;
				bi = bj;
			}
			System.out.printf("%.3f\n",s);
			s = 0F;
			ai = 1F;
			bi = 2F;
		}

		return 0;
	}
}

