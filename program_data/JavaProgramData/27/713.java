package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *  Created on: 2012-9-28
	 *  Author: ???
	 *  ??:?????????
	 */
	public static int Main()
	{
		int n; //??�???�??
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{ //??n?????
			double a; //????a,b,c,d,e,delt,x1,x2
			double b;
			double c;
			double d;
			double e;
			double delt = 0.0;
			double x1;
			double x2;
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			delt = b * b - 4 * a * c; //?delt??b*b-4*a*c
			if (delt == 0)
			{ //??delt ??0
				x1 = x2 = (-b) / (2 * a); //?x1?x2?????
				System.out.printf("x1=x2=%.5f\n",x1); //??x1,x2
			}
			else if (delt < 0)
			{ //???delt??0??x1,x2???
				d = (-b) / (2 * a),e = Math.sqrt(4 * a * c - b * b) / (2 * a);
				if (d <= 0 && d>-0.000001)
				{
					d = 0.0000001; //??d????d??0.0000001
				}
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",d,e,d,e); //??x1,x2
			}
			else
			{ //??x1,x2?????
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2); //??x1,x2
			}

		}
	}

}

