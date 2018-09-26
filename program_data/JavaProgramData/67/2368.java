package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float n;
		float i;
		float a0;
		float b0;
		float a;
		float b;
		float x;
		float y;
		float result;
		n = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		a0 = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b0 = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		x = b0 / a0; //??????????
		for (i = 1F;i < n;i++)
		{
			 a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			 b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			 y = b / a; //?????????
			 result = y - x;
			 if (result > 0.05F)
			 {
				System.out.print("better");
				System.out.print("\n");
			 }
			 else if (result < -0.05F)
			 {
					 System.out.print("worse");
					 System.out.print("\n");
			 }
			 else if ((result > -0.05F) && (result < 0.05F))
			 {
				  System.out.print("same");
				  System.out.print("\n");
			 }
		}
		return 0;
	}

}

