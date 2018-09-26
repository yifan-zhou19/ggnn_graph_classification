package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] sz1 = new int[n];
	int[] sz2 = new int[n];
	for (i = 0; i < n; i++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  sz1[i] = Integer.parseInt(tempVar2);
	  }
	}
	for (i = 0; i < n; i++)
	{
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  sz2[i] = Integer.parseInt(tempVar3);
	  }
	}
	float[] score1 = new float[n];
	for (i = 0; i < n; i++)
	{
	  if (sz2[i] >= 90 && sz2[i] <= 100)
	  {
		score1[i] = 4.00F;
	  }
	  else if (sz2[i] >= 85 && sz2[i] <= 89)
	  {
		score1[i] = 3.70F;
	  }
	  else if (sz2[i] >= 82 && sz2[i] <= 84)
	  {
		score1[i] = 3.30F;
	  }
	  else if (sz2[i] >= 78 && sz2[i] <= 81)
	  {
		score1[i] = 3.00F;
	  }
	  else if (sz2[i] >= 75 && sz2[i] <= 77)
	  {
		score1[i] = 2.70F;
	  }
	  else if (sz2[i] >= 72 && sz2[i] <= 74)
	  {
		score1[i] = 2.30F;
	  }
	  else if (sz2[i] >= 68 && sz2[i] <= 71)
	  {
		score1[i] = 2.00F;
	  }
	  else if (sz2[i] >= 64 && sz2[i] <= 67)
	  {
		score1[i] = 1.50F;
	  }
	  else if (sz2[i] >= 60 && sz2[i] <= 63)
	  {
		score1[i] = 1.00F;
	  }
	  else if (sz2[i] <= 60)
	  {
		score1[i] = 0.00F;
	  }
	}
	float[] score2 = new float[n];
	for (i = 0; i < n; i++)
	{
	  score2[i] = score1[i] * sz1[i];
	}
	float sum1 = 0.00F;
	float sum2 = 0.00F;
	for (i = 0; i < n; i++)
	{
	  sum1 = sum1 + score2[i];
	}
	for (i = 0; i < n; i++)
	{
	  sum2 = sum2 + sz1[i];
	}
	float GPA;
	GPA = sum1 / sum2;
	System.out.printf("%.2f",GPA);
	return 0;
	}

}

