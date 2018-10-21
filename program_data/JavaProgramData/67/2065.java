package <missing>;

public class GlobalMembers
{
	/*
	 * 245.cpp
	 *
	 *  Created on: 2011-12-22
	 *      Author: think
	 */
	public static int Main()
	{ //???
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float standard;
		float temp1;
		float temp2;
		temp1 = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		temp2 = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		standard = temp2 / temp1;
		int i;
		float[] rate = new float[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(rate,0,(Float.SIZE / Byte.SIZE));
		for (i = 1;i < n;i++)
		{
			temp1 = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			temp2 = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			rate[i] = temp2 / temp1; //???????
		}
		for (i = 1;i < n;i++)
		{ //?????
			if (rate[i] - standard > 0.05F)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (rate[i] - standard < -0.05F)
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
	} //?????

}

