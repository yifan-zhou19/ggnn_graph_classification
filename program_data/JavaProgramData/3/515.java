package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int n;
	public static int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *final;
	public static int final;

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static int * point1 = &n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static int * point2 = &k;

	public static int Main()
	{
		int kk = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		point1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		point2 = Integer.parseInt(tempVar2);
	}

	point1 = a;
	final = point1 + n;


	for (;point1 < final;point1++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		point1 = Integer.parseInt(tempVar3);
	}
	}
	point1 = a;
	for (;point1 < final - 1;point1++)
	{
	if (kk == 0)
	{
	break;
	}
		for (point2 = point1 + 1;point2 < final;point2++)
		{
		if (*point1 + *point2 == k)
		{
			System.out.print("yes");
		kk = 0;
		break;
		}


		}

	}
	if (kk == 1)
	{
	System.out.print("no");
	}
	return (0);
	}
}

