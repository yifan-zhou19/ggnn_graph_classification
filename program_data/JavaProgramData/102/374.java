package <missing>;

public class GlobalMembers
{
	public static int cprx(Object e1, Object e2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *a,*b;
		float a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *b;
		float b;
		a = (float)e1;
		b = (float)e2;
		if (a - b < 0F)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	public static int cprd(Object e1, Object e2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *a,*b;
		float a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *b;
		float b;
		a = (float)e1;
		b = (float)e2;
		if (a - b > 0F)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	public static int Main()
	{
	   float[] male = new float[40];
	   float[] female = new float[40];
	   float tmph;
	   int m = 0;
	   int f = 0;
	   int n;
	   int i;
	   String sex = new String(new char[10]);
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
			   sex = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   tmph = Float.parseFloat(tempVar3);
		   }
		   if (sex.charAt(0) == 'm')
		   {
			   male[m++] = tmph;
		   }
		   else
		   {
			   female[f++] = tmph;
		   }
	   }
	   qsort(male,m,(Float.SIZE / Byte.SIZE),cprx);
	   qsort(female,f,(Float.SIZE / Byte.SIZE),cprd);
	   for (i = 0;i < m;i++)
	   {
		 System.out.printf("%.2f ",male[i]);
	   }
	   for (i = 0;i < f - 1;i++)
	   {
		 System.out.printf("%.2f ",female[i]);
	   }
	   System.out.printf("%.2f",female[i]);
	   return 0;
	}

}

