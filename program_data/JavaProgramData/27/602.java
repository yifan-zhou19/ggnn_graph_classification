package <missing>;

public class GlobalMembers
{
	/*
	 * ????dz.cpp
	 * ??????
	 * ????:2012-10-13
	 * ????????????
	 */

	public static int Main()
	{
		float a = 0F; //????a,b,c
		float b = 0F;
		float c = 0F;
		int i; //????n
		int n;
		double d; //????d,e
		double e;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i = i + 1) //?for???n???
		{
			a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (b * b - 4 * a * c > 0F) //????????
			{
				d = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a); //??x1??
				e = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a); //??x2??
				if (d > -0.00001) //???????????5????-0????????
				{
					d = Math.abs(d);
				}
				if (e > -0.00001) //???????????5????-0????????
				{
					e = Math.abs(e);
				}
				System.out.print("x1=");
				System.out.printf("%.5f", d);
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", e);
				System.out.printf("%.5f", "\n");
			}
			else if (b * b - 4 * a * c == 0F) //???????
			{
				d = -b / (2 * a); //?????x1,x2??
				if (d > -0.00001) //???????????5????-0????????
				{
					d = Math.abs(d);
				}
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", d);
				System.out.printf("%.5f", "\n");
			}
			else //????????
			{
				d = -b / (2 * a); //????x1,x2?????
				if (d > -0.00001) //???????????5????-0????????
				{
					d = Math.abs(d);
				}
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", d);
				System.out.printf("%.5f", "+");
				System.out.printf("%.5f", Math.sqrt(-b * b + 4 * a * c) / (2 * a));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", d);
				System.out.printf("%.5f", "-");
				System.out.printf("%.5f", Math.sqrt(-b * b + 4 * a * c) / (2 * a));
				System.out.printf("%.5f", "i");
				System.out.printf("%.5f", "\n");
			}
		}
		return 0; //?????
	}
}

