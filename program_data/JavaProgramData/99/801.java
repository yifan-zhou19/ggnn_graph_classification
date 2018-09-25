package <missing>;

public class GlobalMembers
{
	// ?????9.cpp : ??????????????
	//?????
	//???1200018415
	public static int Main()
	{
		int k;
		int i;
		int y;
	double a1 = 0; //?????a1,b1,c1,d1????0
	double b1 = 0;
	double c1 = 0;
	double d1 = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double a; //???????
		double b;
		double c;
		double d;
		for (i = 1;i <= k;i++) //????
		{
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (y <= 18) //????
			{
				a1++;
			}
			if ((y >= 19) && (y <= 35)) //????
			{
				b1++;
			}
			if ((y >= 36) && (y <= 60)) //????
			{
				c1++;
			}
			if (y >= 61) //????
			{
				d1++;
			}
		}
	a = a1 / k * 100; //????????
	b = b1 / k * 100; //?????????
	c = c1 / k * 100; //?????????
	d = d1 / k * 100; //?????????
	System.out.print("1-18: ");
	System.out.printf("%.2f", a);
	System.out.printf("%.2f", "%");
	System.out.printf("%.2f", "\n");
	System.out.printf("%.2f", "19-35: ");
	System.out.printf("%.2f", b);
	System.out.printf("%.2f", "%");
	System.out.printf("%.2f", "\n");
	System.out.printf("%.2f", "36-60: ");
	System.out.printf("%.2f", c);
	System.out.printf("%.2f", "%");
	System.out.printf("%.2f", "\n");
	System.out.printf("%.2f", "60??: ");
	System.out.printf("%.2f", d);
	System.out.printf("%.2f", "%");
	System.out.printf("%.2f", "\n");
	return 0;
	} //?????


}

