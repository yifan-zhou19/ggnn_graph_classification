package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		double[] a = new double[2000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
		double averge;
		double sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < k;j++)
			{
				a[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			p = a;
			for (j = 0;j < k;j++)
			{
				sum = sum + *p;
				p++;
			}
			averge = sum / k;
			p = a;
			sum = 0;
			for (j = 0;j < k;j++)
			{
				sum = sum + (*p - averge) * (*p - averge);
				p++;
			}
			System.out.printf("%.5f", Math.sqrt(sum / k));
			System.out.printf("%.5f", "\n");
			sum = 0;
		}

	}

}

