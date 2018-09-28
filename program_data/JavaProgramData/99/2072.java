package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float n;
		float a;
		float t1 = 0F;
		float t2 = 0F;
		float t3 = 0F;
		float t4 = 0F;
		float r1;
		float r2;
		float r3;
		float r4;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Float.parseFloat(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = Float.parseFloat(tempVar2);
		   }
		   if (a <= 18F)
		   {
			   t1++;
		   }
		   if (a > 18F && a <= 35F)
		   {
			   t2++;
		   }
		   if (a > 35F && a <= 60F)
		   {
			   t3++;
		   }
		   if (a > 60F)
		   {
			   t4++;
		   }
		}
		r1 = t1 / n * 100;
		r2 = t2 / n * 100;
		r3 = t3 / n * 100;
		r4 = t4 / n * 100;
		System.out.printf("1-18: %.2f%%\n",r1);
		System.out.printf("19-35: %.2f%%\n",r2);
		System.out.printf("36-60: %.2f%%\n",r3);
		System.out.printf("60??: %.2f%%\n",r4);
		return 0;
	}

}

