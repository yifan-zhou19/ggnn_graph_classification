package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *input(int n),*a,*b,*c,n1,n2;
		int input = int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
		int b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *c;
		int c;
		int n1;
		int n2;
		void paixu(int * a,int n),display(int * c,int n);
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *hebing(int *a,int *b,int n1,int n2);
		int hebing = new int(int * a,int * b,int n1,int n2);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		a = input(n1);
		b = input(n2);
		System.out.print("\n");
		paixu(a, n1);
		paixu(b, n2);
		c = hebing(a, b, n1, n2);
		display(c, n1 + n2);
		return 0;
	}

//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: int *input(int n)
	public static int input(int n)
	{
		int[] p;
		int i;
		p = new int[n];
		for (i = 0;i < n;i++)
		{
						String tempVar = ConsoleInput.scanfRead();
						if (tempVar != null)
						{
							p[i] = Integer.parseInt(tempVar);
						}
		}
		return (p);
	}

	public static void paixu(int[] a, int n)
	{
		 int i;
		 int j;
		 int t;
		 for (i = 0;i < n;i++)
		 {
						 for (j = i;j < n;j++)
						 {
										 if (a[j] < a[i])
										 {
													  t = a[j];
													  a[j] = a[i];
													  a[i] = t;
										 }
						 }
		 }
	}

//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: int *hebing(int *a,int *b,int n1,int n2)
	public static int hebing(int[] a, int[] b, int n1, int n2)
	{
		 int[] p;
		 int i;
		 int j;
		 p = new int[(n1 + n2)];
		 for (i = 0;i < n1;i++)
		 {
						  p[i] = a[i];
		 }
		 for (j = 0;j < n2;j++)
		 {
						  p[n1 + j] = b[j];
		 }
		 return (p);
	}

	public static void display(int[] c, int n)
	{
		 int i;
		 for (i = 0;i < n;i++)
		 {
						 if (i != 0)
						 {
							 System.out.print(" ");
						 }
						 System.out.printf("%d",c[i]);
		 }
	}
}

