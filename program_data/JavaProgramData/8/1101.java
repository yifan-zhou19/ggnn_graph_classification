package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: int *order(int *p,int k)
	public static int[] order(int[] p, int k)
	{
		   int i;
		   int j;
		   int t = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p = (int)malloc(k * (Integer.SIZE / Byte.SIZE));
		   for (i = 0;i < k;i++)
		   {
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   p[i] = tempVar;
			   }
		   }
		   for (i = k - 1;i >= 0;i--)
		   {
			   for (j = 0;j < i;j++)
			   {
					   if (p[j] > p[j + 1])
					   {
						t = p[j + 1];
						p[j + 1] = p[j];
						p[j] = t;
					   }
			   }
		   }
		   return p;
	}
//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: int *merge(int *p,int *q,int m,int n)
	public static int[] merge(int[] p, int[] q, int m, int n)
	{
		   int i;
		   int[] u = new int[(m + n)];
		   for (i = 0;i < m;i++)
		   {
				u[i] = p[i];
		   }
		   for (i = 0;i < n;i++)
		   {
				u[m + i] = q[i];
		   }
		   return u;
	}
	public static int Main()
	{
		  int m;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  n = Integer.parseInt(tempVar2);
		  }
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a=(int*)malloc(m *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  int a = (int)malloc(m * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b=(int*)malloc(n *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  int b = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		  a = order(a, m);
		  b = order(b, n);
		  int[] p = merge(a, b, m, n);
		  System.out.printf("%d",p[0]);
		  for (int i = 1;i < m + n;i++)
		  {
			System.out.printf(" %d",p[i]);
		  }
	}

}

