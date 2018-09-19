package <missing>;

public class GlobalMembers
{
	public static int cmp1(Object e1, Object e2)
	{
		if ((double)e1 < (double)e2)
		{
			return -1;
		}
		else if ((double)e1 > (double)e2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int cmp2(Object e1, Object e2)
	{
		if ((double)e1 < (double)e2)
		{
			return 1;
		}
		else if ((double)e1 > (double)e2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		double[] male = new double[50];
		double[] female = new double[50];
		int n1;
		int n2;
		double num;
		n1 = 0;
		n2 = 0;
		String s = new String(new char[15]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;++i)
		{

			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			num = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(s,"male") == 0)
			{
				male[n1] = num;
				n1++;
			}
			else
			{
				female[n2] = num;
				n2++;
			}
		}
		qsort(male,n1,(Double.SIZE / Byte.SIZE),cmp1);
		qsort(female,n2,(Double.SIZE / Byte.SIZE),cmp2);
		for (int i = 0;i < n1;++i)
		{
			System.out.printf("%.2f ",male[i]);
		}
		for (int i = 0;i < n2 - 1;++i)
		{
			System.out.printf("%.2f ",female[i]);
		}
		System.out.printf("%.2f",female[n2 - 1]);
		System.out.print("\n");

	}
}

