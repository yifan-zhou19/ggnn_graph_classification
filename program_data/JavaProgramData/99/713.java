package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double n = 0; //n????? a?b?c?d???18???19-35?36-60?61???????   age?????i???????
	double age = 0;
	double a = 0;
	double b = 0;
	double c = 0;
	double d = 0;
	double i = 0;
	n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   for (i = 1;i <= n;i++)
		   {
		   age = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   if (age <= 18)
		   {
		   a += 1;
		   }
		   if ((age >= 19) && (age <= 35))
		   {
		   b += 1;
		   }
		   if ((age >= 36) && (age <= 60))
		   {
		   c += 1;
		   }
		   if (age >= 61)
		   {
		   d += 1;
		   }
		   }
	a = a / n * 100;
	b = b / n * 100;
	c = c / n * 100;
	d = d / n * 100;
	System.out.printf("1-18: %.2f%\n",a);
	System.out.printf("19-35: %.2f%\n",b);
	System.out.printf("36-60: %.2f%\n",c);
	System.out.printf("60??: %.2f%\n",d);
	return 0;
	}

}

