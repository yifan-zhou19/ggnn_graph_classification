package <missing>;

public class GlobalMembers
{
	public static void paixu(int[] a, int x)
	{
		int i = x - 1;
		int t;
		int j;
		while (i >= 1)
		{
				   for (j = 0;j < i;j++)
				   {
					  if (a[j] > a[j + 1])
					  {
									 t = a[j];
									 a[j] = a[j + 1];
									 a[j + 1] = t;
					  }
				   }
									 i--;
		}
	}
	public static void lianjie(int[] a, int x, int[] b, int y, int[] c)
	{
		 int i = 0;
		 int j = 0;
		 int t = 1;
		 while (i < x)
		 {
					   c[i] = a[i];
					   i++;
		 }
		 while (j < y)
		 {
					   c[i] = b[j];
					   i++;
					   j++;
		 }
		 System.out.printf("%d",c[0]);
		 while (t < x + y)
		 {
					 System.out.printf(" %d",c[t]);
					 t++;
		 }
	}
	public static int Main()
	{
		  int s;
		  int t;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  t = Integer.parseInt(tempVar2);
		  }
		  int[] a = new int[s];
		  int[] b = new int[t];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *c=(int*)malloc((s+t)*sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  int c = (int)malloc((s + t) * (Integer.SIZE / Byte.SIZE));
		  for (i = 0;i < s;i++)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i] = Integer.parseInt(tempVar3);
		  }
		  }
		  for (i = 0;i < t;i++)
		  {
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  b[i] = Integer.parseInt(tempVar4);
		  }
		  }
		  paixu(a, s);
		  paixu(b, t);
		  lianjie(a, s, b, t, c);
	}

}

