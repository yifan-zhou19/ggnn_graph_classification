package <missing>;

public class GlobalMembers
{
	//****************************
	//??????????????
	//?????? 1300012849
	//???2013?10?14?
	//****************************


	public static int Main()
	{
	int n; //??????n
	int i;
	double a; //????????????????a?b?c
	double b;
	double c;
	double delta; //????delta?????x1,x2 ?k1, k2?????????????
	double x1;
	double x2;
	double k1;
	double k2;

	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	for (i = 1 ; i <= n ; i++) //?n???
	{
		 a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		 b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		 c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		 delta = b * b - 4 * a * c; //?????

		 if (delta > 0) //??????0????????????????
		 {
			 x1 = (-b + Math.sqrt(delta)) / (2 * a);
			 x2 = (-b - Math.sqrt(delta)) / (2 * a);

			 if (x1 < 0.000001 && x1 > -0.000001) //???????-0.00000??0.00000????
			 {
				 x1 = 0;
			 }
			 System.out.printf("%.5f", "x1=");
			 System.out.printf("%.5f", x1);
			 System.out.printf("%.5f", ";");
			 System.out.printf("%.5f", "x2=");
			 System.out.printf("%.5f", x2);
			 System.out.printf("%.5f", "\n");
		 }

		 else if (delta == 0) //??????0????
		 {
			 x1 = -b / (2 * a);
			 x2 = -b / (2 * a);

			 if (x1 < 0.000001 && x1 > -0.000001)
			 {
				x1 = 0;
			 }
			 if (x2 < 0.000001 && x1 > -0.000001)
			 {
				x2 = 0;
			 }
			 System.out.printf("%.5f", "x1=x2=");
			 System.out.printf("%.5f", x1);
			 System.out.printf("%.5f", "\n");
		 }


		 else if (delta < 0) //??????0??????????
		 {
			 k1 = -b / (2 * a);
			 k2 = Math.sqrt(-delta) / (2 * a);

			 if (k1 < 0.000001 && k1 > -0.000001)
			 {
				k1 = 0;
			 }
			 if (k2 < 0.000001 && k1 > -0.000001)
			 {
				k2 = 0;
			 }
			 System.out.printf("%.5f", "x1=");
			 System.out.printf("%.5f", k1);
			 System.out.printf("%.5f", "+");
			 System.out.printf("%.5f", k2);
			 System.out.printf("%.5f", "i;x2=");
			 System.out.printf("%.5f", k1);
			 System.out.printf("%.5f", "-");
			 System.out.printf("%.5f", k2);
			 System.out.printf("%.5f", "i");
			 System.out.printf("%.5f", "\n");
		 }

	}
	return 0; //?????????0
	}
}

