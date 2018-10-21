package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		double[] data = new double[1000];
		double sum = 0;
		double S = 0;
		double ave = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * pointer = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < n;j++)
			{
				data[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				sum += data[j];
			}
			ave = sum / n;
			pointer = data;
			for (j = 0;j < n;j++)
			{
				S += (*pointer - ave) * (*pointer - ave);
				pointer++;
			}
			System.out.printf("%.5f", Math.sqrt(S / n));
			System.out.printf("%.5f", "\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(data,0,(Double.SIZE / Byte.SIZE));
			pointer = null;
			sum = 0;
			ave = 0;
			S = 0;
		}
		return 0;
	}




}

