package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct course
	// {
	//  float xf;
	//  float df;
	// }
	// course[N];
	 float[] course_jd = new float[N];
	 float jd;
	 float zxf;
	 int n;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n - 1;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  (course[i].xf) = tempVar2;
	  }
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 (course[n - 1].xf) = tempVar3;
	 }
	 for (i = 0;i < n;i++)
	 {
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  (course[i].df) = tempVar4;
	  }
	 }
	 jd = 0F;
	 for (i = 0;i < n;i++)
	 {
	  if ((course[i].df >= 90) && (course[i].df <= 100))
	  {
		  course_jd[i] = 4.0 * course[i].xf;
	  }
	  if ((course[i].df >= 85) && (course[i].df <= 89))
	  {
		  course_jd[i] = 3.7 * course[i].xf;
	  }
	  if ((course[i].df >= 82) && (course[i].df <= 84))
	  {
		  course_jd[i] = 3.3 * course[i].xf;
	  }
	  if ((course[i].df >= 78) && (course[i].df <= 81))
	  {
		  course_jd[i] = 3.0 * course[i].xf;
	  }
	  if ((course[i].df >= 75) && (course[i].df <= 77))
	  {
		  course_jd[i] = 2.7 * course[i].xf;
	  }
	  if ((course[i].df >= 72) && (course[i].df <= 74))
	  {
		  course_jd[i] = 2.3 * course[i].xf;
	  }
	  if ((course[i].df >= 68) && (course[i].df <= 71))
	  {
		  course_jd[i] = 2.0 * course[i].xf;
	  }
	  if ((course[i].df >= 64) && (course[i].df <= 67))
	  {
		  course_jd[i] = 1.5 * course[i].xf;
	  }
	  if ((course[i].df >= 60) && (course[i].df <= 63))
	  {
		  course_jd[i] = 1.0 * course[i].xf;
	  }
	  if ((course[i].df <= 59))
	  {
		  course_jd[i] = 0 * course[i].xf;
	  }
	  jd = jd + course_jd[i];
	 }
	 zxf = 0F;
	 for (i = 0;i < n;i++)
	 {
	  zxf += course[i].xf;
	 }
	  System.out.printf("%.2f",jd / zxf);
	  return 0;
	}

}

