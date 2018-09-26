package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int n;
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *a[100]={null}, temp=0,average=0;
		double[] a = {null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		double temp = 0;
		double average = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (k;k > 0;k--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			average = 0;
			for (i = 0;i < n;i++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				a[i] = (double)malloc((Double.SIZE / Byte.SIZE));
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					temp = Double.parseDouble(tempVar3);
				}
				a[i] = temp;
				average = average + temp;
			}
			average = average / n;
			temp = 0;
			for (i = 0;i < n;i++)
			{
				a[i] = (a[i] - average) * (a[i] - average);
				temp = temp + a[i];
			}
			temp = Math.sqrt(temp / n);
			System.out.printf("%.5f\n", temp);
		}
	}
}

