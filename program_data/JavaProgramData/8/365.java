package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  void pre(int *,int);
	  void bubble_sort(int*,int);
	  void merge(int*,int,int*,int,int*);
	  void print(int*,int);
	  int[] a = new int[1000];
	  int[] b = new int[1000];
	  int[] c = new int[1000];
	  int A;
	  int B;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  A = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  B = Integer.parseInt(tempVar2);
	  }
  tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
	  pre(tempRef_a, A);
	  a = tempRef_a.argValue;
	  bubble_sort(a, A);
  tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
	  pre(tempRef_b, B);
	  b = tempRef_b.argValue;
	  bubble_sort(b, B);
	  merge(a, A, b, B, c);
	  print(c, A + B);
	}
	public static void pre(tangible.RefObject<Integer> a, int A)
	{
		int i;
		for (i = 0;i < A;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a.argValue + i = Integer.parseInt(tempVar);
		}
		}
	}
	public static void bubble_sort(int[] a, int A)
	{
		int i;
		int j;
		int temp;
		for (j = A - 1;j > 0;j--)
		{
			for (i = 0;i < j;i++)
			{
			if (a[i] > a[i + 1])
			{
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
			}
		}
	}
	public static void merge(int[] a, int A, int[] b, int B, int[] c)
	{
		int i;
		for (i = 0;i < A;i++)
		{
		  c[i] = a[i];
		}
		for (i = 0;i < B;i++)
		{
		  c[i + A] = b[i];
		}
	}
	public static void print(int[] c, int C)
	{
		int i;
		System.out.printf("%d",c[0]);
		for (i = 1;i < C;i++)
		{
		System.out.printf(" %d",c[i]);
		}
	}
}

