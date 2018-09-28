package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		float a;
		float b;
		float[] c = new float[n];
		int i = 0;
		int j = 1;
		for (i = 0;i < n;i++)

		{
				a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
				b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));

				c[i] = b / a;
		}
			 for (j = 1;j < n;j++)
			 {
				 if ((c[j] - c[0]) > 0.05)
				 {
					System.out.print("better");
					System.out.print("\n");
				 }
				 else if ((c[0] - c[j]) > 0.05)
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

