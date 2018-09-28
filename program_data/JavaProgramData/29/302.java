package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		float a;
		float b;
		float c;
		float d;
		float e;
		float f;
		int n;
		int i;
		int j;
		float sum;
		float[] sz = new float[1000];
		float[] zs = new float[1000];
		float[] fs = new float[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int num;
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 num = Integer.parseInt(tempVar2);
						 }
						  sum = 0F;

							for (j = 3;j <= num;j++)
							{
								sz[1] = 1F;
							sz[2] = 2F;
							sz[j] = sz[j - 1] + sz[j - 2];
							zs[1] = 2F;
							zs[2] = 3F;
							zs[j] = zs[j - 1] + zs[j - 2];
							fs[j] = zs[j] / sz[j];
							sum = sum + fs[j];

							}

							if (num == 1)
							{
								System.out.print("2.000\n");
							}
							if (num == 2)
							{
								System.out.print("3.500\n");
							}
							if (num >= 3)
							{
								sum = sum + 3.5;
							System.out.printf("%.3f\n",sum);
							}
		}
	return 0;
	}

}

