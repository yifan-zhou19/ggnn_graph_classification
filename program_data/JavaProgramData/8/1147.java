package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: int* num(int a)
	public static int[] num(int a)
	{
		 int[] p;
		 int i;
		 p = new int[a];
		 for (i = 0;i < a;i++)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 p[i] = Integer.parseInt(tempVar);
			 }
		 }
		 return p;
	}

	public static void rank(tangible.RefObject<Integer> p, int a)
	{
		 int i;
		 int j;
		 int t;
		 for (i = a - 1;i > 0;i--)
		 {
			 for (j = 0;j < i;j++)
			 {
				 if (*(p.argValue + j) > *(p.argValue + j + 1)) //??????????
				 {
					 t = (p.argValue + j);
					 *(p.argValue + j) = *(p.argValue + j + 1);
					 *(p.argValue + j + 1) = t;
				 }
			 }
		 }
	}

//C++ TO JAVA CONVERTER WARNING: Java has no equivalent to methods returning pointers to value types:
//ORIGINAL LINE: int* add(int *p1,int *p2,int a,int b)
	public static int add(tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2, int a, int b)
	{
		 int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int* p3=(int*)malloc((a+b)*sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 int p3 = (int)malloc((a + b) * (Integer.SIZE / Byte.SIZE));
		 for (i = 0;i < a;i++)
		 {
		 *(p3 + i) = *(p1.argValue + i);
		 }
		 for (i = 0;i < b;i++)
		 {
		 *(p3 + a + i) = *(p2.argValue + i);
		 }
		 return p3;
	}

	public static void print(int[] p3, int x)
	{
		 int i;
		 for (i = 0;i < x;i++)
		 {
			 if (i == 0)
			 {
			 System.out.printf("%d",p3[0]);
			 }
			 else
			 {
			 System.out.printf(" %d",p3[i]);
			 }
		 }
	}

	public static int Main()
	{
		  int a;
		  int b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
		  int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		  int p2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p3;
		  int p3;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b = Integer.parseInt(tempVar2);
		  }
		  p1 = num(a);
		  p2 = num(b);
	  tangible.RefObject<Integer> tempRef_p1 = new tangible.RefObject<Integer>(p1);
		  rank(tempRef_p1, a);
		  p1 = tempRef_p1.argValue;
	  tangible.RefObject<Integer> tempRef_p2 = new tangible.RefObject<Integer>(p2);
		  rank(tempRef_p2, b);
		  p2 = tempRef_p2.argValue;
	  tangible.RefObject<Integer> tempRef_p12 = new tangible.RefObject<Integer>(p1);
	  tangible.RefObject<Integer> tempRef_p22 = new tangible.RefObject<Integer>(p2);
		  p3 = add(tempRef_p12, tempRef_p22, a, b);
		  p2 = tempRef_p22.argValue;
		  p1 = tempRef_p12.argValue;
		  print(p3, (a + b));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(p1);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(p2);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		  free(p3);
	}
}

