package <missing>;

public class GlobalMembers
{
	public static int compare(Object elem1, Object elem2)
	{
		return *(float)elem1 > (float)elem2 ?1:-1;
	}


	public static int Main()
	{
		  int n;
		  int i;
		  int k1;
		  int k2;
		  int j1;
		  int j2;
		  k1 = k2 = j1 = j2 = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  final String p1 = "male";
		  final String p2 = "female";

		  char[][] a = new char[n][10];
		  float[] b = new float[n];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *c,*d;
		  float c;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: float *d;
		  float d;
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a[i] = tempVar2.charAt(0);
						  }
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  b[i] = Float.parseFloat(tempVar3);
						  }
		  }



		  for (i = 0;i < n;i++)
		  {
						  if (strcmp(a[i],p1) == 0)
						  {
								k1++;
						  }
						  else if (strcmp(a[i],p2) == 0)
						  {
								k2++;
						  }
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  c = (float)malloc(k1 * (Float.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  d = (float)malloc(k2 * (Float.SIZE / Byte.SIZE));
		  for (i = 0;i < n;i++)
		  {
						  if (strcmp(a[i],p1) == 0)
						  {
								c[j1] = b[i];
								j1++;
						  }
						  else if (strcmp(a[i],p2) == 0)
						  {
								d[j2] = b[i];
								j2++;
						  }
		  }
		  qsort(c,k1,(Float.SIZE / Byte.SIZE),compare);
		  qsort(d,k2,(Float.SIZE / Byte.SIZE),compare);

		  System.out.printf("%.2f",c[0]);
		  for (i = 1;i < k1;i++)
		  {
			  System.out.printf(" %.2f",c[i]);
		  }
		  for (i = k2 - 1;i >= 0;i--)
		  {
			  System.out.printf(" %.2f",d[i]);
		  }


	}

}

