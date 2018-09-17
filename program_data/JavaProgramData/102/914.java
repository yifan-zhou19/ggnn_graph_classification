package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] xb = new char[40][7];
	int n;
	int i;
	int j = 0;
	int z = 0;
	int k;
	double h;
	double[] hm = new double[40];
	double[] hf = new double[40];

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
		  xb[i] = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  h = Double.parseDouble(tempVar3);
	  }

	  if (xb[i][0] == 'm')
	  {
	  hm[j] = h;
	  j++;
	  }
	  else
	  {
	  hf[z] = h;
	  z++;
	  }
	}

	for (k = 1;k < j;k++)
	{
		for (i = 0;i < j - k;i++)
		{
			if (hm[i] > hm[i + 1])
			{
			h = hm[i];
			hm[i] = hm[i + 1];
			hm[i + 1] = h;
			}
		}
	}

	for (k = 1;k < z;k++)
	{
		for (i = 0;i < z - k;i++)
		{
			if (hf[i] < hf[i + 1])
			{
			h = hf[i];
			hf[i] = hf[i + 1];
			hf[i + 1] = h;
			}
		}
	}
	for (i = 0;i < j;i++)
	{
	System.out.printf("%.2lf ",hm[i]);
	}
	for (i = 0;i < z - 1;i++)
	{
	System.out.printf("%.2lf ",hf[i]);

	}
	System.out.printf("%.2lf",hf[z - 1]);

	return 0;
	}


}

