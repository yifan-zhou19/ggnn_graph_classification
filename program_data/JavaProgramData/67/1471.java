package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		float[] a = new float[100];
		float[] b = new float[100];
		float[] effect = new float[100];
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			  a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			  b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			  effect[i] = b[i] / a[i];
		}
		for (i = 1; i < n; i++)
		{
			  if (effect[i] - effect[0] > 0.05F)
			  {
				  System.out.print("better");
				  System.out.print("\n");
			  }
			  else if (effect[0] - effect[i] > 0.05F)
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

