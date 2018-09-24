package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int tree_i = 1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'a', so pointers on this parameter are left unchanged:
	public static int tree(int x, int * a)
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int i=1;

		if (x != 1)
		{
			x = x / 2;
			*a = x;
			a++;
			tree(x, a);
			tree_i++;
		}
		else
		{
			*a = 1;
		}
		return tree_i;
	}
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int por_q;


//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'e', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'r', so pointers on this parameter are left unchanged:
	public static int por(int * e, int * r)
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int q;
		if (*e != *r)
		{
			System.out.printf("%d\n",por_q);
		}
		else
		{
			por_q = e;
			e--;
			r--;
	//		printf("%d %d\n",*e,*r);
			por(e, r);
		}
		return por_q;
	}

	public static void Main()
	{
		int x;
		int y;
		int[] a = new int[12];
		int[] b = new int[12];
		int a1;
		int b1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a2;
		int a2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b2;
		int b2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a3;
		int a3;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b3;
		int b3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[0] = x;
		b[0] = y;
		a2 = a[1];
		b2 = b[1];
		a1 = tree(x, a2) + 1;
		b1 = tree(y, b2) - a1 + 3;
	//	printf("%d %d ",a1,b1);
		a3 = a[a1 - 1];
		b3 = b[b1 - 1];
		por(a3, b3);
	//	printf("%d",*a3);

	}

}

