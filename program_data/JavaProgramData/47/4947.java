package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void change(int * a,int n);
		int i;
		int n;
		int[] a = new int[100];
		int[] p = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++,p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
		}
		System.out.print("\n");
		p = a;
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		change(tempRef_p, n);
		p = tempRef_p.argValue;
		for (p = a;p < a + n - 1;p++)
		{
			System.out.printf("%d ",p[0]);
		}
		System.out.printf("%d",p[0]);
	}

	public static void change(tangible.RefObject<Integer> a, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * j;
		int m;
		int temp;
		m = (n - 1) / 2;
		p = a.argValue + m;
		i = a.argValue;
		j = i + n - 1;
		for (;i <= p;i++,j--)
		{
			temp = i;
			*i = j;
			*j = temp;
		}

	}
}

