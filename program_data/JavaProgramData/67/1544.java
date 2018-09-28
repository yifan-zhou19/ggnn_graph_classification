package <missing>;

public class GlobalMembers
{
	//?? 2011 11.5
	//?? ???
	//?? ???????

	public static int Main()
	{
		int n;
		int i;
		double standard;
		double result;
		float[][] a = new float[100][2];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			a[i][0] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		standard = a[0][1] / a[0][0];
		for (i = 1;i <= n - 1;i++)
		{
			result = a[i][1] / a[i][0];
			if ((result - standard) > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			 else if ((standard - result) > 0.05)
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

