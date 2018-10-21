package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
	  k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (int i = 0;i < k;i++)
	  {
			   int n;
			   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			   double[] a = new double[100];
			   double average = 0;
			   double sum = 0;
			   double s;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
			   double p;
			   p = a;
			   for (int i = 0;i < n;i++)
			   {
						*(p + i) = ConsoleInput.readToWhiteSpace(true);
					  average += *(p + i);
			   }
				average = average / n;
				for (int j = 0;j < n;j++)
				{
					 sum += (*(p + j) - average) * (*(p + j) - average);
				}
				s = Math.sqrt(sum / n);
				System.out.printf("%.5f", s);
				System.out.printf("%.5f", "\n");
	  }
	   return 0;
	}
}

