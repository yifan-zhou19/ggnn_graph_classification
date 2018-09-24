public class person
{
		public String sex = new String(new char[10]);
		public float h;
}

package <missing>;

public class GlobalMembers
{
	public static int compmale(Object a1, Object a2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *p1,*p2;
		 float p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *p2;
		 float p2;
		 p1 = (float)a1;
		p2 = (float)a2;
		if (p1 - p2 >= 0F)
		{
	   return 1;
		}
	   else
	   {
	   return -1;
	   }
	}
	public static int compfemale(Object a1, Object a2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *p1,*p2;
		 float p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *p2;
		 float p2;
		 p1 = (float)a1;
		p2 = (float)a2;
	   if (p2 - p1 >= 0F)
	   {
	   return 1;
	   }
	   else
	   {
	   return -1;
	   }
	}
	public static person[] mate = tangible.Arrays.initializeWithDefaultpersonInstances(40);
	public static int Main()
	{
		   float[] m = new float[40];
		   float[] f = new float[40];
		   int n;
		   int i;
		   int j;
		   int a = 0;
		   int b = 0;
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
					   mate[i].sex = tempVar2.charAt(0);
				   }
				   String tempVar3 = ConsoleInput.scanfRead(" ");
				   if (tempVar3 != null)
				   {
					   mate[i].h = Float.parseFloat(tempVar3);
				   }
				if (strcmp(mate[i].sex,"male") == 0)
				{
					 m[a] = mate[i].h;
					 a++;
				}
				else if (strcmp(mate[i].sex,"female") == 0)
				{
					 f[b] = mate[i].h;
					 b++;
				}
		   }
		   qsort(m,a,(Float.SIZE / Byte.SIZE),compmale);
		   for (i = 0;i < a;i++)
		   {
		   System.out.printf("%1.2f ",m[i]);
		   }
		   qsort(f,b,(Float.SIZE / Byte.SIZE),compfemale);
		   for (i = 0;i < b;i++)
		   {
			   if (i < b - 1)
			   {
			  System.out.printf("%1.2f ",f[i]);
			   }
			else
			{
			  System.out.printf("%1.2f",f[i]);
			}
		   }
			  System.in.read();
			  System.in.read();
	}

}

