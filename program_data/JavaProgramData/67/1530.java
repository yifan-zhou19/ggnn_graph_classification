package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float n;
		float[] a = new float[2];
		float[][] b = new float[50][2];
		float x;
		float[] y = new float[50];
	int i;
	int j;
	  n = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	  a[0] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	  a[1] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	  for (i = 0;i < n - 1;i++)
	  {
		  b[i][0] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		  b[i][1] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	  }
	  x = a[1] / a[0];
	  for (i = 0;i < n - 1;i++)
	  {
		  y[i] = b[i][1] / b[i][0];
	  if (y[i] - x > 0.05F)
	  {
		  System.out.print("better");
		  System.out.print("\n");
	  }
	  else if (x - y[i] > 0.05F)
	  {
		  System.out.print("worse");
		  System.out.print("\n");
	  }
	  else
	  {
		  System.out.print("same");
		  System.out.print("\n");
	  }
	  }
	  return 0;


	}
}

