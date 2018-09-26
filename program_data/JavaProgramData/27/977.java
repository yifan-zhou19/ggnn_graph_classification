package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;n > 0;n = n - 1)
		{
			double a; //a,b,c are the output.  d is the discriminant.
			double b;
			double c;
			double d;
			double x1;
			double x2;
			double x1re;
			double x1im;
			double x2re;
			double x2im;
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			d = b * b - 4 * a * c;
			if (d >= 0)
			{
				if (b != 0) //used to avoid the output of -0.00000+...
				{
				x1 = (-b + Math.sqrt(d)) / (2 * a);
				x2 = (-b - Math.sqrt(d)) / (2 * a);
					  if (x1 != x2)
					  {
							System.out.printf("%.5f", "x1=");
							System.out.printf("%.5f", x1);
							System.out.printf("%.5f", ";");
							System.out.printf("%.5f", "x2=");
							System.out.printf("%.5f", x2);
							System.out.printf("%.5f", "\n");
					  }
					  else
					  {
							System.out.printf("%.5f", "x1=x2=");
							System.out.printf("%.5f", x1);
							System.out.printf("%.5f", "\n");
					  }
				}
				else //used to avoid the output of -0.00000+...
				{
				x1 = (Math.sqrt(d)) / (2 * a);
				x2 = (Math.sqrt(d)) / (2 * a);
					  if (x1 != x2)
					  {
							System.out.printf("%.5f", "x1=");
							System.out.printf("%.5f", x1);
							System.out.printf("%.5f", ";");
							System.out.printf("%.5f", "x2=");
							System.out.printf("%.5f", x2);
							System.out.printf("%.5f", "\n");
					  }
					  else
					  {
							System.out.printf("%.5f", "x1=x2=");
							System.out.printf("%.5f", x1);
							System.out.printf("%.5f", "\n");
					  }
				}
			}

			else
			{
				if (b != 0) //used to avoid the output of -0.00000+...
				{
					x1re = -b / (2 * a);
					x2re = -b / (2 * a);
					x1im = (Math.sqrt(-d)) / (2 * a);
					x2im = -(Math.sqrt(-d)) / (2 * a);
//C++ TO JAVA CONVERTER TODO TASK: The cout 'noshowpos' manipulator is not converted by C++ to Java Converter:
//ORIGINAL LINE: cout <<noshowpos<<fixed<<setprecision(5)<<"x1="<<x1re<<showpos<<x1im<<"i";
//C++ TO JAVA CONVERTER TODO TASK: The cout 'showpos' manipulator is not converted by C++ to Java Converter:
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1re);
					System.out.printf("%.5f", x1im);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
//C++ TO JAVA CONVERTER TODO TASK: The cout 'noshowpos' manipulator is not converted by C++ to Java Converter:
//ORIGINAL LINE: cout <<noshowpos<<fixed<<setprecision(5)<<"x2="<<x2re<<showpos<<x2im<<"i"<<"\n";
//C++ TO JAVA CONVERTER TODO TASK: The cout 'showpos' manipulator is not converted by C++ to Java Converter:
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", x2re);
					System.out.printf("%.5f", x2im);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
				else //used to avoid the output of -0.00000+...
				{
					x1re = 0;
					x2re = 0;
					x1im = (Math.sqrt(-d)) / (2 * a);
					x2im = -(Math.sqrt(-d)) / (2 * a);
//C++ TO JAVA CONVERTER TODO TASK: The cout 'noshowpos' manipulator is not converted by C++ to Java Converter:
//ORIGINAL LINE: cout <<noshowpos<<fixed<<setprecision(5)<<"x1="<<x1re<<showpos<<x1im<<"i";
//C++ TO JAVA CONVERTER TODO TASK: The cout 'showpos' manipulator is not converted by C++ to Java Converter:
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", x1re);
					System.out.printf("%.5f", x1im);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", ";");
//C++ TO JAVA CONVERTER TODO TASK: The cout 'noshowpos' manipulator is not converted by C++ to Java Converter:
//ORIGINAL LINE: cout <<noshowpos<<fixed<<setprecision(5)<<"x2="<<x2re<<showpos<<x2im<<"i"<<"\n";
//C++ TO JAVA CONVERTER TODO TASK: The cout 'showpos' manipulator is not converted by C++ to Java Converter:
					System.out.printf("%.5f", "x2=");
					System.out.printf("%.5f", x2re);
					System.out.printf("%.5f", x2im);
					System.out.printf("%.5f", "i");
					System.out.printf("%.5f", "\n");
				}
			}
		}
		return 0;
	}

}

