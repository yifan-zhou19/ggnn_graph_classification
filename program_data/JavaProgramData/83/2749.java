package <missing>;

public class GlobalMembers
{
	public static float jd(int x)
	{
		  if (x >= 90 && x <= 100)
		  {
			  return 4F;
		  }
		  if (x >= 85)
		  {
			  return 3.7F;
		  }
		  if (x >= 82)
		  {
			  return 3.3F;
		  }
		  if (x >= 78)
		  {
			  return 3F;
		  }
		  if (x >= 75)
		  {
			  return 2.7F;
		  }
		  if (x >= 72)
		  {
			  return 2.3F;
		  }
		  if (x >= 68)
		  {
			  return 2.0F;
		  }
		  if (x >= 64)
		  {
			  return 1.5F;
		  }
		  if (x >= 60)
		  {
			  return 1.0F;
		  }
		  return 0F;
	}
	public static int Main()
	{
		int n;
		int i;
		int[] xuefen = new int[100];
		int xuefensum;
		float score;
		float GPA;
		float scoresum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		xuefensum = 0;
		scoresum = 0F;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xuefen[i] = Integer.parseInt(tempVar2);
			}
			xuefensum = xuefensum + xuefen[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score = Float.parseFloat(tempVar3);
			}
			scoresum = scoresum + jd(score) * xuefen[i];
		}
		GPA = scoresum / xuefensum;
		System.out.printf("%.2f",GPA);
		return 0;
	}

}

