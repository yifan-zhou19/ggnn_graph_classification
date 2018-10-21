package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] score = {90, 85, 82, 78, 75, 72, 68, 64, 60, 0};
		double[] gpa = {4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.5, 1.0, 0};
		int s;
		double g;
		int i;
		int j;
		int a;
		int b;
		int c;
		double e = 0;
		double f = 0;
		double GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		int[] all = new int[10];
		int[] real = new int[10];
		for (i = 0;i < b;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   all[i] = Integer.parseInt(tempVar2);
		   }
		}
		for (i = 0;i < b;i++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   real[i] = Integer.parseInt(tempVar3);
		   }
		}

		for (i = 0;i < b;i++)
		{
			for (j = 0; j < 10; j++)
			{
				 if (real[i] >= score[j])
				 {
					  g = gpa[j];
					  break;
				 }
			}
			e += g * all[i];
			f += all[i];
		}
		GPA = e / f;
		System.out.printf("%.2lf",GPA);
	}
}

