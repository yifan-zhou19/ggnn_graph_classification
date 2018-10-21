package <missing>;

public class GlobalMembers
{
	/*
	 * ?????????????.cpp
	 * ?????
	 * ????: 2012-10-10
	 * ????????????
	 */
	public static int Main()
	{ //?????
		double a = 0.0; //????????a,b,c,x1,x2,x3,x4
		double b = 0.0;
		double c = 0.0;
		double x1 = 0.0;
		double x2 = 0.0;
		double x3 = 0.0;
		int n = 1; //????n,n1
		int n1 = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (c,n1 <= n = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0) //????
		{
			if ((b * b - 4 * a * c) > 0) //????
			{
				x1 = (-1 * b + Math.sqrt(b * b - 4 * a * c)) / (2 * a); //??x1
				   x2 = (-1 * b - Math.sqrt(b * b - 4 * a * c)) / (2 * a); //??x2
				   System.out.printf("x1=%.5f", x1); //?x1?????????
				   System.out.print(";");
				   System.out.printf("x2=%.5f", x2); //?x2?????????
				   System.out.print("\n");
			}
			else if ((b * b - 4 * a * c) == 0.0) //????
			{
				if ((-1 * b) / (2 * a) == 0) //????
				{
					System.out.print("x1=x2=");
					System.out.print(0);
					System.out.print("\n");
				}
				else
				{
						x1 = (-1 * b) / (2 * a); //??x1?x2
					System.out.printf("x1=x2=%.5f",x1); //??x1?x2
					System.out.print("\n");
				}
			}
			   else //????
			   {
				   x3 = Math.sqrt(-(b * b - 4 * a * c)) / (2 * a); //??x1?x2???
				if ((-1 * b) / (2 * a) == 0) //????
				{
					x1 = 0.0;
					System.out.printf("x1=%.5f",x1); //??x1???
					System.out.printf("+%.5f",x3);
					   System.out.print("i");
					   System.out.print(";");
					   System.out.printf("x2=%.5f", x1); //??x2???
					   System.out.printf("-%.5f", x3);
					   System.out.print("i");
					   System.out.print("\n");
				}
				   else //????
				   {
						   x1 = (-1 * b) / (2 * a); //??x1,x2???
					System.out.printf("x1=%.5f", x1); //??x1???
					System.out.printf("+%.5f",x3); //??x???
					System.out.print("i");
					System.out.print(";");
					System.out.printf("x2=%.5f", x1); //??x2???
					System.out.printf("-%.5f",x3); //??x2???
					System.out.print("i");
					System.out.print("\n");
				   } //??i
			   }
			   n1++; //n1??
		}
		return 0;
	} //?????

}

