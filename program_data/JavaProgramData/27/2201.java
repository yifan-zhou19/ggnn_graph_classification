package <missing>;

public class GlobalMembers
{
	//*****************************
	//*  ??? ???????    *
	//*  ??? 1100012820        *
	//*  ?? 20110915            *
	//*****************************


	public static int Main()
	{
		int i; //????n?????i
		int n;
		double a; //????????????????;
		double b;
		double c;
		double det;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1; i <= n; i++) //????????
		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			det = b * b - 4 * a * c; //?????
			if (det < 0) //???????0
			{
				if (a > 0) //??a??0
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", b / a / (-2) + 1 - 1);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", Math.sqrt(Math.abs(det)) / a / 2);
					System.out.printf("%.5f", "i;x2=");
					System.out.printf("%.5f", -(b / a / 2) + 1 - 1);
					System.out.printf("%.5f", -Math.sqrt(Math.abs(det)) / a / 2);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
							   //???????
				else //??a??0
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", (-b) / a / 2);
					System.out.printf("%.5f", "+");
					System.out.printf("%.5f", Math.sqrt(Math.abs(det)) / a / 2);
					System.out.printf("%.5f", "i;x2=");
					System.out.printf("%.5f", -(b / a / 2));
					System.out.printf("%.5f", -Math.sqrt(Math.abs(det)) / a / 2);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
							   //???????
			}
			else if (det == 0) //???????0
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", (-b) / a / 2);
				System.out.printf("%.5f", "\n");
			}
						 //??????
			else //????????0?
			{
				System.out.printf("%.5f", "x1=");
				System.out.printf("%.5f", (- b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", (- b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
				System.out.printf("%.5f", "\n");
			}
						 //???????
						 //????
		} //????
		return 0;
	}
}

