package <missing>;

public class GlobalMembers
{
	public static void move(tangible.RefObject<Integer> p, int n, int m)
	{
		int i;
		int end;
		end = (p.argValue + n - 1);
		for (i = n - 1;i >= 0;i--)
		{
			*(p.argValue + i) = *(p.argValue + i - 1);
		}
		p.argValue = end;
		m--;
		if (m > 0)
		{
			move(p, n, m);
		}
		else if (m == 0)
		{
			for (i = 0;i < n;i++)
			{
				if (i == 0)
				{
					System.out.printf("%d",*(p.argValue + i));
				}
				else
				{
					System.out.printf(" %d",*(p.argValue + i));
				}
			}
		}

	}


	public static void Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
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
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		p = a;
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		move(tempRef_p, n, m);
		p = tempRef_p.argValue;

	}




}

