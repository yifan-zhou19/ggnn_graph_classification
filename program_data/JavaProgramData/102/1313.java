public class stu
{
  public String sex = new String(new char[7]);
  public float height;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		float[] b = new float[n];
		float[] c = new float[n];
		float t;
		stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(n);
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i].sex = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   a[i].height = Float.parseFloat(tempVar3);
		   }
		}

		for (i = 0;i < n;i++)
		{
			if (strcmp(a[i].sex,"male") == 0)
			{
				b[j] = a[i].height;
				j++;
			}
			else if (strcmp(a[i].sex,"female") == 0)
			{
				c[k] = a[i].height;
				k++;
			}
		}

		for (i = 0;i < j - 1;i++)
		{
		  for (m = 0;m < j - i - 1;m++)
		  {
			  if (b[m] > b[m + 1])
			  {
				  t = b[m];
				  b[m] = b[m + 1];
				  b[m + 1] = t;
			  }
		  }
		}
		for (i = 0;i < k - 1;i++)
		{
		  for (m = 0;m < k - i - 1;m++)
		  {
			  if (c[m] < c[m + 1])
			  {
				  t = c[m];
				  c[m] = c[m + 1];
				  c[m + 1] = t;
			  }
		  }
		}

		System.out.printf("%.2f",b[0]);
		for (i = 1;i < j;i++)
		{
		  System.out.printf(" %.2f",b[i]);
		}
		for (i = 0;i < k;i++)
		{
		  System.out.printf(" %.2f",c[i]);
		}
	}
}

