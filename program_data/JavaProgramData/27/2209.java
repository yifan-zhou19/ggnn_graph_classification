package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????n????????

		double a; //?????a,b,c???,x1,x2?????,shi,xu?????
		double b;
		double c;
		double x1;
		double x2;
		double shi;
		double xu;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int p = 1; p <= n; p++) //????

		{
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));

			if (b * b - 4 * a * c < 0) //????????????0?

			{
				shi = -b / (2 * a);

				xu = Math.sqrt(4 * a * c - b * b) / (2 * a); //???

				if (shi == 0)

				{
					shi = -shi;
				}

				   System.out.printf("x1=""%.5f",shi);

				   System.out.printf("+""%.5f",xu);

				  System.out.printf("i;x2=""%.5f",shi);

				   System.out.printf("-""%.5f",xu);

				   System.out.print("i");

				   System.out.print("\n");

			}

			else if (b * b - 4 * a * c == 0) //????????????0?

			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a); //???

				System.out.printf("x1=x2=""%.5f",x1);

				System.out.print("\n");
			}

			else //????????????0?

			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);

				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a); //???

				System.out.printf("x1=""%.5f",x1);

				System.out.printf(";x2=""%.5f",x2);

				System.out.print("\n");
			}
		}
		return 0;
	}



}

