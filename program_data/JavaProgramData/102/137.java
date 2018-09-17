package <missing>;

public class GlobalMembers
{
	public static double[] male = new double[40];
	public static double[] female = new double[40];
	public static String str = new String(new char[10]);

	public static int cmp1(Object a, Object b) //up
	{
	  return *(double)a < (double)b;
	}

	public static int cmp2(Object a, Object b) //down
	{
	  return *(double)b < (double)a;
	}

	public static int Main()
	{
	  int i;
	  int n;
	  int maleindex;
	  int femaleindex;
	  double temp;
	  while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	  {
		maleindex = femaleindex = 0;
		while (n-- != 0)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			temp = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(str,"male") == 0)
			{
			  male[maleindex++] = temp;
			}
			else
			{
			  female[femaleindex++] = temp;
			}
		}

		qsort(male,maleindex,(Double.SIZE / Byte.SIZE),cmp2);
		qsort(female,femaleindex,(Double.SIZE / Byte.SIZE),cmp1);

		System.out.printf("%.2lf",male[0]);
		for (i = 1;i < maleindex;i++)
		{
		  System.out.printf(" %.2lf",male[i]);
		}

		for (i = 0;i < femaleindex;i++)
		{
		  System.out.printf(" %.2lf",female[i]);
		}
		System.out.print("\n");
	  }
	  return 0;
	}
}

