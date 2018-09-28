package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double[] a = new double[300];
		double[] b = new double[300];
		double[] c = new double[300];
		double sum = 0;
		double ave = 0;
		double max = 0;
		double temp = 0;
		int i;
		int j;
		int num = 0;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		  ave = sum / n;
		  for (i = 0;i < n;i++)
		  {
			  b[i] = Math.abs(a[i] - ave);
		  }
		  for (i = 0;i < n;i++)
		  {
			  if (b[i] > max)
			  {
				  max = b[i];
			  }
		  }
		  //cout<<max<<endl;
		  for (i = 0;i < n;i++)
		  {
			  if (b[i] == max)
			  {
				  c[num++] = a[i];
			  }
		  }
		  if (num == 1)
		  {
			  System.out.print(c[0]);
		  }
		  else
		  {

		  for (i = 0;i < num - 1;i++)
		  {
			  for (j = 0;j < num - i;j++)
			  {
				  if (c[j] > c[j + 1])
				  {
					  temp = c[j + 1];
					  c[j + 1] = c[j];
					  c[j] = temp;
				  }
			  }
		  }
		  for (i = 0;i < num - 1;i++)
		  {
					  System.out.print(c[i]);
					  System.out.print(",");
		  }
					  System.out.print(c[num]);




		  }





	}
}

