package <missing>;

public class GlobalMembers
{
	public static int comparemale(Object x, Object y)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1=(int*)x;
		int p1 = (int)x;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2=(int*)y;
		int p2 = (int)y;
		return (p1) - p2;
	}
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  final String c = "";
		  float[] a = new float[50];
		  float[] m = new float[40];
		  float[] s = new float[40];
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
							  c = tangible.StringFunctions.changeCharacter(c, 7 * i, tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  a[i] = Float.parseFloat(tempVar3);
						  }
		  }
		  for (i = 0,j = 0,k = 0;i < n;i++)
		  {
						  if (c.charAt(7 * i) == 'm')
						  {
										 m[j] = a[i];
										 j++;
						  }
						  if (c.charAt(7 * i) == 'f')
						  {
										 s[k] = a[i];
										 k++;
						  }
		  }
		  qsort(m,j,(Float.SIZE / Byte.SIZE),comparemale);
		  qsort(s,k,(Float.SIZE / Byte.SIZE),comparemale);
		  for (i = 0;i < j;i++)
		  {
			  System.out.printf("%.2f ",m[i]);
		  }
		  for (i = k - 1;i > -1;i--)
		  {
							if (i == 0)
							{
								System.out.printf("%.2f",s[0]);
							}
							else
							{
								System.out.printf("%.2f ",s[i]);
							}
		  }
	}
}

