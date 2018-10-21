package <missing>;

public class GlobalMembers
{
	//*****************************************
	//*function:?????                                                        *
	//*Created on: 2012-10-7                  *
	//*Author: ???       1200062705             *
	//*****************************************
	public static int Main() //?????
	{
	   double i; //???????i,a?b,c?d???age,??n
	   double age;
	   double n;
	   double a = 0.0;
	   double b = 0.0;
	   double c = 0.0;
	   double d = 0.0;
	   n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i <= n ;i++) //?????????
	   {
		  age = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		  if (1 <= age != 0 && age <= 18)
		  {
			  a++;
		  }
		  else if (19 <= age != 0 && age <= 35)
		  {
			  b++;
		  }
		  else if (36 <= age != 0 && age <= 60)
		  {
			  c++;
		  }
		  else
		  {
			  d++;
		  }
	   }
			a = a / n * 100; //??????????????????????
			b = b / n * 100;
			c = c / n * 100;
			d = d / n * 100;

			System.out.printf("%f", "1-18: ");
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

