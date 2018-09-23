package <missing>;

public class GlobalMembers
{
	public static float f(float a)
	{
		if (a < 0F)
		{
		return -a;
		}
		else
		{
		return a;
		}
	}
	public static int Main()
	{
		float n;
		n = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[100];
		int i;
		int j;
		float sum = 0F;
		for (i = 1;i <= n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		float ave;
		float t;
		ave = sum / n;

		for (i = 1;i <= n;i++)
		{
			  for (j = 1;j <= n - i;j++)
			  {
				  if (a[j + 1] < a[j])
				  {
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				  }
			  }
		}
		float max = f(a[1] - ave);
		for (i = 2;i <= n;i++)
		{

			if (f(a[i] - ave) > max)
			{
			max = f(a[i] - ave);
			}
		}
		float z = 0F;
		for (i = 1;i <= n;i++)
		{



			if ((f(a[i] - ave) == max) && (z == 0F))
			{
			 System.out.print(a[i]);
			 z = 1F;
			 continue;
			}
			if ((f(a[i] - ave) == max) && (z == 1F))
			{
			 System.out.print(",");
			 System.out.print(a[i]);
			 z = 1F;
			}

		}
		return 0;


	}
}

