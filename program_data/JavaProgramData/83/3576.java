package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int o;
		int p;
		int[] xuefen = new int[1000];
		float[] defen = new float[1000];
		float[] jidian = new float[1000];
		float sum1 = 0F;
		float sum2 = 0F;
		float GPA;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (i = 0;i < n - 1;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					xuefen[i] = Integer.parseInt(tempVar2);
				}
				sum1 = sum1 + xuefen[i];
			}
			if (i = n - 1)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					xuefen[i] = Integer.parseInt(tempVar3);
				}
				sum1 = sum1 + xuefen[i];
			}
			for (i = 0;i < n - 1;i++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					defen[i] = Float.parseFloat(tempVar4);
				}
				p = defen[i];
			 if ((90 <= p) && (p <= 100))
			 {
					defen[i] = 4.0F;
			 }
			 if ((85 <= p) && (p <= 89))
			 {
					defen[i] = 3.7F;
			 }
			 if ((82 <= p) && (p <= 84))
			 {
					defen[i] = 3.3F;
			 }
			 if ((78 <= p) && (p <= 81))
			 {
					defen[i] = 3.0F;
			 }
			 if ((75 <= p) && (p <= 77))
			 {
					defen[i] = 2.7F;
			 }
			 if ((72 <= p) && (p <= 74))
			 {
					defen[i] = 2.3F;
			 }
			 if ((68 <= p) && (p <= 71))
			 {
					defen[i] = 2.0F;
			 }
			 if ((64 <= p) && (p <= 67))
			 {
					defen[i] = 1.5F;
			 }
			 if ((60 <= p) && (p <= 63))
			 {
					defen[i] = 1.0F;
			 }
			 if (p < 60)
			 {
					defen[i] = 0F;
			 }
			}
			if (i = n - 1)
			{
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					defen[i] = Float.parseFloat(tempVar5);
				}
				p = defen[i];
				if ((90 <= p) && (p <= 100))
				{
					defen[i] = 4.0F;
				}
			 if ((85 <= p) && (p <= 89))
			 {
					defen[i] = 3.7F;
			 }
			 if ((82 <= p) && (p <= 84))
			 {
					defen[i] = 3.3F;
			 }
			 if ((78 <= p) && (p <= 81))
			 {
					defen[i] = 3.0F;
			 }
			 if ((75 <= p) && (p <= 77))
			 {
					defen[i] = 2.7F;
			 }
			 if ((72 <= p) && (p <= 74))
			 {
					defen[i] = 2.3F;
			 }
			 if ((68 <= p) && (p <= 71))
			 {
					defen[i] = 2.0F;
			 }
			 if ((64 <= p) && (p <= 67))
			 {
					defen[i] = 1.5F;
			 }
			 if ((60 <= p) && (p <= 63))
			 {
					defen[i] = 1.0F;
			 }
			 if (p < 60)
			 {
					defen[i] = 0F;
			 }

			}
			for (i = 0;i < n;i++)
			{
				jidian[i] = xuefen[i] * defen[i];
				sum2 = sum2 + jidian[i];
			}
			GPA = sum2 / sum1;
			System.out.printf("%.2f",GPA);
	return 0;
	}
}

