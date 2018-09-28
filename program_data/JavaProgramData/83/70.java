package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int[] ji = new int[30];
		int[] fen = new int[30];
		float[] dian = new float[30];
		double xueji;
		double zongping;
		double xuefenhe;

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
				ji[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				fen[i] = Integer.parseInt(tempVar3);
			}
			if (fen[i] >= 90 && fen[i] <= 100)
			{
			dian[i] = 4.0F;
			}
			if (fen[i] >= 85 && fen[i] <= 89)
			{
			dian[i] = 3.7F;
			}
			if (fen[i] >= 82 && fen[i] <= 84)
			{
			dian[i] = 3.3F;
			}
			if (fen[i] >= 78 && fen[i] <= 81)
			{
			dian[i] = 3.0F;
			}
			if (fen[i] >= 75 && fen[i] <= 77)
			{
			dian[i] = 2.7F;
			}
			if (fen[i] >= 72 && fen[i] <= 74)
			{
			dian[i] = 2.3F;
			}
			if (fen[i] >= 68 && fen[i] <= 71)
			{
			dian[i] = 2.0F;
			}
			if (fen[i] >= 64 && fen[i] <= 67)
			{
			dian[i] = 1.5F;
			}
			if (fen[i] >= 60 && fen[i] <= 63)
			{
			dian[i] = 1.0F;
			}
			if (fen[i] <= 60)
			{
			dian[i] = 0F;
			}

		}
		for (xuefenhe = 0,xueji = 0,i = 0;i < n;i++)
		{
			xueji = xueji + dian[i] * ji[i];
			xuefenhe = xuefenhe + ji[i];
		}
		zongping = xueji / xuefenhe;
		System.out.printf("%.2f",zongping);


	}

}

