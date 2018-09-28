package <missing>;

public class GlobalMembers
{
	public static int compare(Object elem1, Object elem2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		p1 = (int)elem1;
		p2 = (int)elem2;
		return (p2) - p1;
	}
	public static int Main()
	{
		 for (int j = 0;;j++)
		 {
	   int n;
	   int a = 0;
	   int b = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   if (n != 0)
	   {
		 int[] f = new int[n];
		 for (int i = 0;i < n;i++)
		 {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 f[i] = Integer.parseInt(tempVar2);
				 }
		 }
		 qsort(f,n,(Integer.SIZE / Byte.SIZE),compare);
		 int[] g = new int[n];
		 for (int i = 0;i < n;i++)
		 {
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 g[i] = Integer.parseInt(tempVar3);
				 }
		 }
		  qsort(g,n,(Integer.SIZE / Byte.SIZE),compare);
		  int k = 0;
		  int c = 0;
		  int h = n - 1;
		  int x = n - 1;
		  int s = 0;
		  for (;(a + b + s) != n;)
		  {
				  if (f[k] > g[c])
				  {
					a++;
					k++;
					c++;
				  }
				  else if (f[k] <= g[c])
				  {
					   if (f[h] > g[x])
					   {
						  a++;
						  h--;
						  x--;
					   }
					   else if (f[h] <= g[x])
					   {
						  if (f[h] < g[c])
						  {
						  b++;
						  h--;
						  c++;
						  }
						  else
						  {
						  s++;
						  h--;
						  c++;
						  }
					   }
				  }
		  }
			int y = 0;
			y = 200 * a - 200 * b;
			System.out.printf("%d\n",y);
	   }
	   if (n == 0)
	   {
	   break;
	   }
		 }
	   System.in.read();
	   System.in.read();
	}





}

