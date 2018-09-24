package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
	return ((float)a) > ((float)b) ? 1 : -1;
	}
	public static int Main()
	{
		  int n;
		  int b = 0;
		  int g = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int i;
		  String sex = new String(new char[8]);
		  float[] B = new float[n];
		  float[] G = new float[n];
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  sex = tempVar2.charAt(0);
						  }
						  if (sex.charAt(0) == 'm')
						  {
							 String tempVar3 = ConsoleInput.scanfRead();
							 if (tempVar3 != null)
							 {
								 B[b] = Float.parseFloat(tempVar3);
							 }
							 b++;
						  }
						  else
						  {
							String tempVar4 = ConsoleInput.scanfRead();
							if (tempVar4 != null)
							{
								G[g] = Float.parseFloat(tempVar4);
							}
							g++;
						  }

		  }
		  qsort(B,b,(Float.SIZE / Byte.SIZE),cmp);
		  qsort(G,g,(Float.SIZE / Byte.SIZE),cmp);
		  for (i = 0;i < b;i++)
		  {
						  System.out.printf("%.2f ",B[i]);
		  }
		  for (i = g - 1;i > 0;i--)
		  {
						  System.out.printf("%.2f ",G[i]);
		  }
		  System.out.printf("%.2f\n",G[i]);
	}
}

