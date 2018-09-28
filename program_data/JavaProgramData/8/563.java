package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[50];
	   int[] b = new int[50];
	   int[] c = new int[100];
	   int i;
	   int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1=&i,*p2=&j;
	   int p1 = i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2=&j;
	   int p2 = j;
	void input(int a[],int b[],int * p1,int * p2);
  tangible.RefObject<Integer> tempRef_p1 = new tangible.RefObject<Integer>(p1);
  tangible.RefObject<Integer> tempRef_p2 = new tangible.RefObject<Integer>(p2);
	  input(a, b, tempRef_p1, tempRef_p2);
	  p2 = tempRef_p2.argValue;
	  p1 = tempRef_p1.argValue;

	void sort(int a[],int * p1);
tangible.RefObject<Integer> tempRef_p12 = new tangible.RefObject<Integer>(p1);
	sort(a, tempRef_p12);
	p1 = tempRef_p12.argValue;
tangible.RefObject<Integer> tempRef_p22 = new tangible.RefObject<Integer>(p2);
	sort(b, tempRef_p22);
	p2 = tempRef_p22.argValue;
	void connect(int a[],int b[],int c[],int * p1,int * p2);
tangible.RefObject<Integer> tempRef_p13 = new tangible.RefObject<Integer>(p1);
tangible.RefObject<Integer> tempRef_p23 = new tangible.RefObject<Integer>(p2);
	connect(a, b, c, tempRef_p13, tempRef_p23);
	p2 = tempRef_p23.argValue;
	p1 = tempRef_p13.argValue;
	void output(int c[],int * p1,int * p2);
tangible.RefObject<Integer> tempRef_p14 = new tangible.RefObject<Integer>(p1);
tangible.RefObject<Integer> tempRef_p24 = new tangible.RefObject<Integer>(p2);
	output(c, tempRef_p14, tempRef_p24);
	p2 = tempRef_p24.argValue;
	p1 = tempRef_p14.argValue;
	return 0;
	}


	public static void input(int[] a, int[] b, tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2)
	{
		int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p1.argValue = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		p2.argValue = Integer.parseInt(tempVar2);
	}

	for (i = 0;i < p1.argValue;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < p2.argValue;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		b[i] = Integer.parseInt(tempVar4);
	}
	}

	}

	public static void sort(int[] a, tangible.RefObject<Integer> p1)
	{
		int i;
		int j;
		int k;
		int t;
	  for (i = 0;i < p1.argValue-1;i++)
	  {
				 k = i;
	  for (j = i + 1;j < p1.argValue;j++)
	  {
		if (a[k] > a[j])
		{
			k = j;
		}
	  }
		 if (k != i)
		 {
			 t = a[k];
			 a[k] = a[i];
			 a[i] = t;
		 }
	  }


	}

	public static void connect(int[] a, int[] b, int[] c, tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2)
	{
		int i;
		int k = 0;
	   for (i = 0;i < p1.argValue;i++)
	   {
		c[i] = a[i];
	   }
	  for (i = p1.argValue;i < p1.argValue + p2.argValue;i++,k++)
	  {
		c[i] = b[k];
	  }

	}

	public static void output(int[] c, tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2)
	{
	int i;
	int k;
	k = p1.argValue + p2.argValue;
	for (i = 0;i < k - 1;i++)
	{
	System.out.printf("%d ",c[i]);
	}
	System.out.printf("%d",c[k - 1]);




	}


}

