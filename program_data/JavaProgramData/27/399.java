package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		for (i = 0;i < n;i++)
		{
			  a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			  b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			  c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			  if (b * b - 4 * a * c > 0) //??????0?????????
			  {
				  x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				  x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				  System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			  }
			  else if (b * b - 4 * a * c == 0) //?????0???????
			  {
				   x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				   System.out.printf("x1=x2=%.5f\n",x1);
			  }
			   else if (b * b - 4 * a * c < 0) //?????0??????????
			   {
				   if (Math.abs(b) < 1e-6) //b?0?????????
				   {
				   System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",(b) / (2 * a), Math.sqrt(4 * a * c - b * b) / (2 * a),(b) / (2 * a), Math.sqrt(4 * a * c - b * b) / (2 * a));
				   }
				   else
				   {
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",(-b) / (2 * a), Math.sqrt(4 * a * c - b * b) / (2 * a),(-b) / (2 * a), Math.sqrt(4 * a * c - b * b) / (2 * a));
				   }
			   }
		}
	}

}

