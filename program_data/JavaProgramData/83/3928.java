package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int j;
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float[] a = new float[n];
		float[] b = new float[n];
		float[] s = new float[n];
		float sum = 0F;
		float x;
		for (i = 0;i < n;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n;j++)
		{
			b[j] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		for (x = 0F,k = 0;k < n;k++)
		{
			  if (b[k] >= 90F)
			  {
				  s[k] = 4F;
			  }
			  else if (b[k] <= 89F && b[k]>84F)
			  {
				  s[k] = 3.7F;
			  }
			  else if (b[k] <= 84F && b[k]>81F)
			  {
				  s[k] = 3.3F;
			  }
			  else if (b[k] <= 81F && b[k]>77F)
			  {
				  s[k] = 3.0F;
			  }
			  else if (b[k] <= 77F && b[k]>74F)
			  {
				  s[k] = 2.7F;
			  }
			  else if (b[k] <= 74F && b[k]>71F)
			  {
				  s[k] = 2.3F;
			  }
			  else if (b[k] <= 71F && b[k]>67F)
			  {
				  s[k] = 2F;
			  }
			  else if (b[k] <= 67F && b[k]>63F)
			  {
				  s[k] = 1.5F;
			  }
			  else if (b[k] <= 63F && b[k]>59F)
			  {
				  s[k] = 1F;
			  }
			  else
			  {
				  s[k] = 0F;
			  }
			 sum = sum + a[k] * s[k];
			 x = x + a[k];
		}
		sum = sum / x;
		System.out.printf("%.2f",sum);
		return 0;
	}

}

