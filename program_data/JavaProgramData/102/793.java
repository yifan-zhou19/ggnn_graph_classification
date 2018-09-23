package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j = 0;
	  int k = 0;
	  String v = new String(new char[10]);
	  float[] h = new float[45];
	  float[] h1 = new float[45];
	  float[] h2 = new float[45];
	  int count1;
	  int count2;
	 float temp;



	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }

		for (i = 0; i < n; i++)
		{
		h[i] = 0F;
		h1[i] = 0F;
		h2[i] = 0F;
		}

	  for (i = 0; i < n; i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			v = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			h[i] = Float.parseFloat(tempVar3);
		}
		if (!strcmp(v, "male"))
		{
		  h1[j] = h[i];
		  j++;
		}

		else
		{
		  h2[k] = h[i];
		  k++;
		}
	  }


	  count1 = j;
	  count2 = k;

	  for (i = 0; i < count1 - 1; i++)
	  {
		for (j = count1 - 1; j > i; j--)
		{
		  if (h1[j] < h1[j - 1])
		  {
			temp = h1[j];
			h1[j] = h1[j - 1];
			h1[j - 1] = temp;
		  }
		}
	  }



	  for (i = 0; i < count2 - 1; i++)
	  {
		for (j = count2 - 1; j > i; j--)
		{
		  if (h2[j] > h2[j - 1])
		  {
			temp = h2[j];
			h2[j] = h2[j - 1];
			h2[j - 1] = temp;
		  }
		}
	  }

	  for (i = 0; i < count1; i++)
	  {
		  System.out.printf("%.2f ", h1[i]);
	  }

	  for (i = 0; i < count2 - 1; i++)
	  {
		  System.out.printf("%.2f ", h2[i]);
	  }
	  System.out.printf("%.2f", h2[i]);


		return 0;
	}


}

