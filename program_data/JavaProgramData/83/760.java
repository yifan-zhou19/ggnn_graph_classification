package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum2 = 0;
		float sum1 = 0F;
		float gpa;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int xf,fs;
	//		float jd;
	//	}
	//	a[100];
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
			a[i].xf = tempVar2;
		}
		}
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i].fs = tempVar3;
		}
		}
		 for (i = 0;i < n;i++)
		 {

			 if (a[i].fs >= 90 && a[i].fs <= 100)
			 {
			 a[i].jd = 4.0;
			 }
			 if (a[i].fs >= 85 && a[i].fs <= 89)
			 {
			 a[i].jd = 3.7;
			 }
			 if (a[i].fs >= 82 && a[i].fs <= 84)
			 {
			 a[i].jd = 3.3;
			 }
			 if (a[i].fs >= 78 && a[i].fs <= 81)
			 {
			 a[i].jd = 3.0;
			 }
			 if (a[i].fs >= 75 && a[i].fs <= 77)
			 {
			 a[i].jd = 2.7;
			 }
			 if (a[i].fs >= 72 && a[i].fs <= 74)
			 {
			 a[i].jd = 2.3;
			 }
			 if (a[i].fs >= 68 && a[i].fs <= 71)
			 {
			 a[i].jd = 2.0;
			 }
			 if (a[i].fs >= 64 && a[i].fs <= 67)
			 {
			 a[i].jd = 1.5;
			 }
			 if (a[i].fs >= 60 && a[i].fs <= 63)
			 {
			 a[i].jd = 1.0;
			 }
			 if (a[i].fs >= 0 && a[i].fs <= 59)
			 {
			 a[i].jd = 0.0;
			 }
		 }
		  for (i = 0;i < n;i++)
		  {
			  sum1 += a[i].jd * a[i].xf;
			  sum2 += a[i].xf;
		  }
		  gpa = sum1 / sum2;
		  System.out.printf("%.2f",gpa);
		  return 0;

	}
}

