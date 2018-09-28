package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
	float s;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= m;i++)
	{
	s = 0F;
					 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	float[] a = new float[n];
	float[] b = new float[n];
	float[] c = new float[n];


	a[0] = 1F;
	a[1] = 2F;
	b[0] = 2F;
	b[1] = 3F;
	c[0] = 2F;
	c[1] = 1.5F;
	   for (j = 2;j < n;j++)
	   {
		   a[j] = a[j - 1] + a[j - 2];
		b[j] = b[j - 1] + b[j - 2];
		c[j] = b[j] / a[j];





	   }
	  for (j = 0;j < n;j++)
	  {
	  s = s + c[j];
	  }

	   System.out.printf("%.3f",s);
	   System.out.print("\n");



	}


		return 0;




	}
}

