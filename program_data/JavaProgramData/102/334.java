package <missing>;

public class GlobalMembers
{
	public static int compare1(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *p1,*p2;
		float p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *p2;
		float p2;
		p1 = (float)elem1;
		p2 = (float)elem2;
		if (p1 - p2 < 0F)
		{
			return -1;
		}
		else if (p1 - p2 > 0F)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int compare2(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *p1,*p2;
		float p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *p2;
		float p2;
		p1 = (float)elem1;
		p2 = (float)elem2;
		if (p1 - p2 < 0F)
		{
			return 1;
		}
		else if (p1 - p2 > 0F)
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
		  int i = 0;
		  int g;
		  int j = 0;
		  int a;
		  int b;
		  String c = new String(new char[100]);
		  float[] m = new float[100];
		  float[] f = new float[100];
		  float h;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (g = 0;g < n;g++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  c = tempVar2.charAt(0);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  h = Float.parseFloat(tempVar3);
						  }
						  if (c.charAt(0) == 'm')
						  {
										m[i] = h;
										i++;
						  }
						  else
						  {
							   f[j] = h;
							   j++;
						  }
		  }
		  a = i;
		  b = j;
		  qsort(m,a,(Float.SIZE / Byte.SIZE),compare1);
		  qsort(f,b,(Float.SIZE / Byte.SIZE),compare2);
		  for (i = 0;i < a;i++)
		  {
						   if (i == 0)
						   {
							   System.out.printf("%.2f",m[i]);
						   }
						   else
						   {
							   System.out.printf(" %.2f",m[i]);
						   }
		  }
		  for (j = 0;j < b;j++)
		  {
						   System.out.printf(" %.2f",f[j]);
		  }

	}

}

