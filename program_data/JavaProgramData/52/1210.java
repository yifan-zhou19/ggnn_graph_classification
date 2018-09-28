package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void f(int * p,int n,int m);
		int n;
		int m;
		int[] num = new int[100];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i] = Integer.parseInt(tempVar3);
			}
		}
	tangible.RefObject<Integer> tempRef_num = new tangible.RefObject<Integer>(num);
		f(tempRef_num, n, m);
		num = tempRef_num.argValue;
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				System.out.printf("%d",num[i]);
			}
			else
			{
				System.out.printf(" %d",num[i]);
			}
		}
		System.out.print("\n");
	}
	public static void f(tangible.RefObject<Integer> p, int n, int m)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int b;
		q = p.argValue;
		b = (p.argValue + n - 1);
		for (q = p.argValue + n - 1;q > p.argValue;q--)
		{
			*q = (q - 1);
		}
		*q = b;
		m--;
		if (m > 0)
		{
			f(p, n, m);
		}

	}



}

