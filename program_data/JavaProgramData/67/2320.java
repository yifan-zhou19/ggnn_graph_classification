package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float[] total = new float[100]; //?????????????
		float[] effective = new float[100];
		int i; //??????i
		for (i = 0;i < n;i++)
		{
			total[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			effective[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		float x; //????????????????
		float[] y = new float[100];
		x = effective[0] / total[0]; //????????
		for (i = 1;i < n;i++)
		{

			y[i] = effective[i] / total[i]; //??????????????
			if (y[i] - x > 0.05F)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else
			{
				if (x - y[i] > 0.05F)
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
		}
		return 0;
	}


}

