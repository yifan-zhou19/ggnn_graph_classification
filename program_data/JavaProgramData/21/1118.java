package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k1;
		int k2;
		int k3;
		int k4;
		int z;
		int h;
		float[] a = new float[1000];
		float sum = 0F;
		float s;
		float[] b = new float[1000];
		float m;
		float o;
		float fl;
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
					a[i] = Float.parseFloat(tempVar2);
				}
				sum = sum + a[i];
				b[i] = a[i];
			/*	printf("%f,%f,%f\n",a[i],sum,b[i]);*/
			}
		s = sum / n;
		/*printf("%f\n",s);*/

		for (j = 0;j < n;j++)
		{
			if (b[j] - s > 0F)
			{
				b[j] = b[j] - s;
			}
			else
			{
				b[j] = s - b[j];
			}
		/*	printf("%f\n",b[j]);
	*/
		}
		for (k1 = 1;k1 < n;k1++)
		{
			for (k2 = 0;k2 < n - k1;k2++)
			{
			  if (a[k2] > a[k2 + 1])
			  {
				  m = a[k2];
				a[k2] = a[k2 + 1];
				a[k2 + 1] = m;
			  }
			  if (b[k2] > b[k2 + 1])
			  {
				  o = b[k2];
			   b[k2] = b[k2 + 1];
			   b[k2 + 1] = o;
			  }

			}
		}
	  /*  for(k5=0;k5<n;k5++)
		{
			printf("%f, %f\n",a[k5],b[k5]);
		}*/





		fl = b[n - 1]; //printf("fl=%f\n",fl);
		for (k3 = 0;k3 < n;k3++)
		{
			if ((s - b[n - 1] < a[k3] + 0.01) && (s - b[n - 1]> a[k3] - 0.01) || (s + b[n - 1] < a[k3] + 0.01) && (s + b[n - 1]> a[k3] - 0.01))
			{

				System.out.printf("%.f",a[k3]);
			z = k3;
			break;
			}
		}
	   for (k4 = z + 1;k4 < n;k4++)
	   {
			if ((s - b[n - 1] < a[k4] + 0.01) && (s - b[n - 1]> a[k4] - 0.01) || (s + b[n - 1] < a[k4] + 0.01) && (s + b[n - 1]> a[k4] - 0.01))
			{
			System.out.printf(",%.f",a[k4]);
			}

	   }
	  return 0;
	}
}

