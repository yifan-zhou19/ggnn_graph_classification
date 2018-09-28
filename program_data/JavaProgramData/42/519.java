package <missing>;

public class GlobalMembers
{
	public static int swap(tangible.RefObject<Integer> p1, tangible.RefObject<Integer> p2)
	{
		int x;
		x = p1.argValue;
		p1.argValue = p2.argValue;
		p2.argValue = x;
	}

	public static int Main()
	{
		int[] a = new int[100000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int n;
		int i;
		int k;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (p = a;p < a + n;p++)
		{
			if (*p == k)
			{
				for (q = p + 1;q < a + n;q++)
				{
					if (*q != k)
					{
					tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
					tangible.RefObject<Integer> tempRef_q = new tangible.RefObject<Integer>(q);
						swap(tempRef_p, tempRef_q);
						q = tempRef_q.argValue;
						p = tempRef_p.argValue;
						num++;
						break;
					}
				}
			}
			if (*p == k)
			{
				break;
			}
		}
		for (q = a;q < p - 1;q++)
		{
			System.out.printf("%d ",*q);
		}
		System.out.printf("%d",*q);
	}

}

