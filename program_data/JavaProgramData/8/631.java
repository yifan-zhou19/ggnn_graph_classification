package <missing>;

public class GlobalMembers
{
	public static int m = 0;
	public static int n = 0;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pointer1=&m,*pointer2=&n;
	public static int pointer1 = m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pointer2=&n;
	public static int pointer2 = n;
	public static void input(tangible.RefObject<Integer> r, tangible.RefObject<Integer> s, tangible.RefObject<Integer> x, tangible.RefObject<Integer> y)
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r.argValue = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s.argValue = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r.argValue;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x.argValue + i = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < s.argValue;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				y.argValue + i = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void sort(tangible.RefObject<Integer> t, tangible.RefObject<Integer> p)
	{
		int i;
		int j;
		int r;
		int s;
		for (i = 0;i < t.argValue-1;i++)
		{
			r = i;
			for (j = i + 1;j < t.argValue;j++)
			{
				if (*(p.argValue + j) < *(p.argValue + r))
				{
					r = j;
				}
			}
			if (r != i)
			{
				s = (p.argValue + i);
				*(p.argValue + i) = *(p.argValue + r);
				*(p.argValue + r) = s;
			}
		}
	}
	public static void output(tangible.RefObject<Integer> x, tangible.RefObject<Integer> y, tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2)
	{
		int i;
		for (i = 0;i < x.argValue;i++)
		{
			System.out.printf("%d ",*(p1.argValue + i));
		}
		for (i = 0;i < y.argValue;i++)
		{
			System.out.printf("%d%c",*(p2.argValue + i),(i < y.argValue-1)?' ':'\n');
		}
	}
	public static void Main()
	{
	tangible.RefObject<Integer> tempRef_pointer1 = new tangible.RefObject<Integer>(pointer1);
	tangible.RefObject<Integer> tempRef_pointer2 = new tangible.RefObject<Integer>(pointer2);
	tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
	tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
		input(tempRef_pointer1, tempRef_pointer2, tempRef_a, tempRef_b);
		b = tempRef_b.argValue;
		a = tempRef_a.argValue;
		pointer2 = tempRef_pointer2.argValue;
		pointer1 = tempRef_pointer1.argValue;
	tangible.RefObject<Integer> tempRef_pointer12 = new tangible.RefObject<Integer>(pointer1);
	tangible.RefObject<Integer> tempRef_a2 = new tangible.RefObject<Integer>(a);
		sort(tempRef_pointer12, tempRef_a2);
		a = tempRef_a2.argValue;
		pointer1 = tempRef_pointer12.argValue;
	tangible.RefObject<Integer> tempRef_pointer22 = new tangible.RefObject<Integer>(pointer2);
	tangible.RefObject<Integer> tempRef_b2 = new tangible.RefObject<Integer>(b);
		sort(tempRef_pointer22, tempRef_b2);
		b = tempRef_b2.argValue;
		pointer2 = tempRef_pointer22.argValue;
	tangible.RefObject<Integer> tempRef_pointer13 = new tangible.RefObject<Integer>(pointer1);
	tangible.RefObject<Integer> tempRef_pointer23 = new tangible.RefObject<Integer>(pointer2);
	tangible.RefObject<Integer> tempRef_a3 = new tangible.RefObject<Integer>(a);
	tangible.RefObject<Integer> tempRef_b3 = new tangible.RefObject<Integer>(b);
		output(tempRef_pointer13, tempRef_pointer23, tempRef_a3, tempRef_b3);
		b = tempRef_b3.argValue;
		a = tempRef_a3.argValue;
		pointer2 = tempRef_pointer23.argValue;
		pointer1 = tempRef_pointer13.argValue;
	}
}

