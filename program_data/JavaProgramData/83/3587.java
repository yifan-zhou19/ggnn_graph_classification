package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] xf = new int[10];
		int[] sf = new int[10];
		float[] G = new float[10];
		float sumjdxf = 0F;
		int sumxf = 0;
		float GPA;
		float[] jdxf = new float[10];

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
				xf[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sf[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
		   if (sf[i] >= 90)
		   {
			   G[i] = 4.0F;
		   }


		   if ((sf[i] < 90) && (sf[i] >= 85))
		   {
			   G[i] = 3.7F;
		   }

		   if ((sf[i] < 85) && (sf[i] >= 82))
		   {
			   G[i] = 3.3F;
		   }
		   if ((sf[i] < 82) && (sf[i] >= 78))
		   {
			   G[i] = 3.0F;
		   }
		   if ((sf[i] < 78) && (sf[i] >= 75))
		   {
			   G[i] = 2.7F;
		   }
		   if ((sf[i] < 75) && (sf[i] >= 72))
		   {
			   G[i] = 2.3F;
		   }
		   if ((sf[i] < 72) && (sf[i] >= 68))
		   {
			   G[i] = 2.0F;
		   }
		   if ((sf[i] < 68) && (sf[i] >= 64))
		   {
			   G[i] = 1.5F;
		   }
		   if ((sf[i] < 64) && (sf[i] >= 60))
		   {
			   G[i] = 1.0F;
		   }
		   if (sf[i] < 60)
		   {
			   G[i] = 0F;
		   }
		   jdxf[i] = G[i] * xf[i];
		   sumjdxf += jdxf[i];
		}
		 for (i = 0;i < n;i++)
		 {
			   sumxf += xf[i];
		 }
		 GPA = sumjdxf / sumxf;
		 System.out.printf("%.2f",GPA);
		 return 0;
	}





}

