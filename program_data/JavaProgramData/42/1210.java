package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int[] a = new int[100001];
		int i;
		int time = 0;
		int first = 1;
		void ahead(int * head,int * tail);
		void exchange(int * p,int * q);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a + i = tempVar2;
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}

		for (i = 1;i < n;i++)
		{
			while (a[i] == k && time <= n - i)
			{
				ahead(a + i, a + n);
				time++;
			}
			time = 0;
		}

		for (i = 1;i <= n;i++)
		{
			if (a[i] == k)
			{
				break;
			}
			if (first == 1)
			{
				System.out.printf("%d",a[i]);
				first = 0;
			}
			else
			{
				System.out.printf(" %d",a[i]);
			}
		}

		System.out.print("\n");
	}

	public static void exchange(tangible.RefObject<Integer> p, tangible.RefObject<Integer> q)
	{
		int temp;
		temp = p.argValue;
		p.argValue = q.argValue;
		q.argValue = temp;
	}

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'head', so pointers on this parameter are left unchanged:
	public static void ahead(int * head, tangible.RefObject<Integer> tail)
	{
		if (head == tail.argValue-1)
		{
		tangible.RefObject<Integer> tempRef_head = new tangible.RefObject<Integer>(head);
			exchange(tempRef_head, tail);
			head = tempRef_head.argValue;
		}
		else
		{
		tangible.RefObject<Integer> tempRef_head2 = new tangible.RefObject<Integer>(head);
			exchange(tempRef_head2, head + 1);
			head = tempRef_head2.argValue;
			head++;
			ahead(head, tail);
		}
	}
}

