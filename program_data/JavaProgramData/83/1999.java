package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int[] b = new int[10];
		int n;
		int d = 0;
		float sum = 0F;
		float[] c = new float[10];
		float GPA = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			d += a[i];
		}
		for (int m = 0;m < n;m++)
		{
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  b[m] = Integer.parseInt(tempVar3);
			  }
			  if (b[m] >= 90)
			  {
				  c[m] = 4.0F;
			  }
			  else if (b[m] >= 85 && b[m] < 90)
			  {
				  c[m] = 3.7F;
			  }
			  else if (b[m] >= 82 && b[m] < 85)
			  {
				  c[m] = 3.3F;
			  }
			  else if (b[m] >= 78 && b[m] < 82)
			  {
				  c[m] = 3.0F;
			  }
			  else if (b[m] >= 75 && b[m] < 78)
			  {
				  c[m] = 2.7F;
			  }

			  else if (b[m] >= 72 && b[m] < 75)
			  {
				  c[m] = 2.3F;
			  }
			  else if (b[m] >= 68 && b[m] < 72)
			  {
				  c[m] = 2.0F;
			  }

			  else if (b[m] >= 64 && b[m] < 68)
			  {
				  c[m] = 1.5F;
			  }

			  else if (b[m] >= 60 && b[m] < 64)
			  {
				  c[m] = 1.0F;
			  }
			  else
			  {
				  c[m] = 0F;
			  }
		}
		for (int k = 0;k < n;k++)
		{
			sum += (float)c[k] * a[k];
		}
		GPA = (float)(sum / d);

		System.out.printf("%.2f\n",GPA);
		return 0;
	}

}

