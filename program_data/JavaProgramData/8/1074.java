package <missing>;

public class GlobalMembers
{
	public static void putin(tangible.RefObject<Integer> p, int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
		*(p.argValue + i) = ConsoleInput.readToWhiteSpace(true);
		}
	}
	public static void putout(tangible.RefObject<Integer> p, int n)
	{
		int m;
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
			if (*(p.argValue + j) > *(p.argValue + j + 1))
			{
			m = (p.argValue + j);
			*(p.argValue + j) = *(p.argValue + j + 1);
			*(p.argValue + j + 1) = m;
			}
			}
		}
		System.out.print((p.argValue+1));
		for (i = 2;i < n + 1;i++)
		{
			System.out.print(" ");
			System.out.print((p.argValue + i));
		}
	}
	public static int Main()
	{
		int n1;
		int n2;
		int[] a = new int[10000];
		int[] b = new int[10000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pa;
		int pa;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pb;
		int pb;
		pa = a;
		pb = b;
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	tangible.RefObject<Integer> tempRef_pa = new tangible.RefObject<Integer>(pa);
		putin(tempRef_pa, n1);
		pa = tempRef_pa.argValue;
	tangible.RefObject<Integer> tempRef_pb = new tangible.RefObject<Integer>(pb);
		putin(tempRef_pb, n2);
		pb = tempRef_pb.argValue;
	tangible.RefObject<Integer> tempRef_pa2 = new tangible.RefObject<Integer>(pa);
		putout(tempRef_pa2, n1);
		pa = tempRef_pa2.argValue;
		System.out.print(" ");
	tangible.RefObject<Integer> tempRef_pb2 = new tangible.RefObject<Integer>(pb);
		putout(tempRef_pb2, n2);
		pb = tempRef_pb2.argValue;
		return 0;
	}

}

