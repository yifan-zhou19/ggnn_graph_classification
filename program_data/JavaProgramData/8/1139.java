package <missing>;

public class GlobalMembers
{
	public static void scan_(int m, tangible.RefObject<Integer> a, int n, tangible.RefObject<Integer> b)
	{
		int i; //????????????
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;

		p = a.argValue;
		for (i = 0;i < m;i++) //???????????????????? ??��
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p++ = Integer.parseInt(tempVar);
		}
		}
		p = b.argValue;
		for (j = 0;j < n;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p++ = Integer.parseInt(tempVar2);
		}
		}

	}
	public static void sort_(int m, tangible.RefObject<Integer> a, int n, tangible.RefObject<Integer> b)
	{
	  int i;
	  int j;
	  int t;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  int * q;
	  for (i = 0;i < m - 1;i++)
	  {
		  q = a.argValue;
		  for (j = 0;j < m - 1 - i;j++)
		  {
			if (*q > *(q + 1))
			{
				t = q;
				*q = (q + 1);
				*(q + 1) = t;
			}
			q++;
		  }
	  }

	  for (i = 0;i < n - 1;i++)
	  {
			q = b.argValue;
			for (j = 0;j < n - 1 - i;j++)
			{
			if (*q > *(q + 1))
			{
				t = q;
				*q = (q + 1);
				*(q + 1) = t;
			}
			q++;
			}
	  }
	}
	public static void print_(int m, tangible.RefObject<Integer> a, int n, tangible.RefObject<Integer> b)
	{
	int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * p;
	System.out.printf("%d", a.argValue);
	p = a.argValue+1;
	for (i = 1;i < m;i++,p++)
	{
	System.out.printf(" %d",*p);
	}
	p = b.argValue;
	for (i = 0;i < n;i++,p++)
	{
	System.out.printf(" %d",*p);
	}
	System.out.print("\n");
	}

	public static int Main()
	{
	int m;
	int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
	int a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
	int b;
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	a = (int)malloc(m * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	b = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
tangible.RefObject<Integer> tempRef_a = new tangible.RefObject<Integer>(a);
tangible.RefObject<Integer> tempRef_b = new tangible.RefObject<Integer>(b);
	scan_(m, tempRef_a, n, tempRef_b);
	b = tempRef_b.argValue;
	a = tempRef_a.argValue;
tangible.RefObject<Integer> tempRef_a2 = new tangible.RefObject<Integer>(a);
tangible.RefObject<Integer> tempRef_b2 = new tangible.RefObject<Integer>(b);
	sort_(m, tempRef_a2, n, tempRef_b2);
	b = tempRef_b2.argValue;
	a = tempRef_a2.argValue;
tangible.RefObject<Integer> tempRef_a3 = new tangible.RefObject<Integer>(a);
tangible.RefObject<Integer> tempRef_b3 = new tangible.RefObject<Integer>(b);
	print_(m, tempRef_a3, n, tempRef_b3);
	b = tempRef_b3.argValue;
	a = tempRef_a3.argValue;
	return 0;
	}

}

