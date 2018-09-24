package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		int male = 0;
		int female = 0;
		int n;
		int i;
		int j;
		char cn;
		char m;
		char f;
		final String exam1 = "mmm";
		final String exam2 = "fff";

		float[] an = new float[40];
		float[] bn = new float[40];
		float high;
		float temp1;
		String temp = new String(new char[6]);
		m = exam1.charAt(0);
		f = exam2.charAt(0);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				temp = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				high = Float.parseFloat(tempVar3);
			}
				cn = temp.charAt(0);
			if (cn == m)
			{
				an[male] = high;
				 male = male+1;


			}
			 if (cn == f)
			 {
				 bn[female] = high;
				 female = female+1;
			 }

		}

		for (i = 0;i < female;i++)
		{
		 for (j = 0;j < female - i - 1;j++)
		 {
		   if (bn[j] < bn[j + 1])
		   {
			  temp1 = bn[j];
			  bn[j] = bn[j + 1];
			  bn[j + 1] = temp1;

		   }
		 }
		}

		for (i = 0;i < male;i++)
		{
		 for (j = 0;j < male - i - 1;j++)
		 {
		   if (an[j] > an[j + 1])
		   {
			  temp1 = an[j];
			  an[j] = an[j + 1];
			  an[j + 1] = temp1;

		   }
		 }
		}

	for (i = 0;i < male;i++)
	{
		System.out.printf("%.2f",an[i]);
		System.out.print(" ");
	}
	for (i = 0;i < female-1;i++)

	{
		System.out.printf("%.2f",bn[i]);
		System.out.print(" ");
	}
	System.out.printf("%.2f",bn[female-1]);




	}
}

