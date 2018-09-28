package <missing>;

public class GlobalMembers
{
	/*
	 * y1.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */
	public static float tran(float x)
	{
		if (x < 0F)
		{
			return -x;
		}
		else
		{
			return x;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int B = 0;
		float p;
		float m;
		float[] a = new float[301];
		float s = 0F;
		float[] b = new float[301];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			s += a[i];
		}
		 p = s / n;
		 b[0] = tran(a[0] - p);
		 m = b[0];
		 for (i = 1;i < n;i++)
		 {
			 b[i] = tran(a[i] - p);
			 if (b[i] > m)
			 {
			 m = b[i];
			 }
		 }

		 for (i = 0;i < n;i++)
		 {
			 if (b[i] == m)
			 {
				if (B != 0)
				{
					System.out.print(",");
					System.out.print(a[i]);
				}
				else
				{
					System.out.print(a[i]);
						 B++;
				}
			 }
		 }




		 return 0;
	}


}

