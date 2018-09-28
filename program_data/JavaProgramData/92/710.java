package <missing>;

public class GlobalMembers
{
	public static void exchange(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b)
	{
		if (a.argValue > b.argValue)
		{
			a.argValue = a.argValue + b.argValue;
			b.argValue = a.argValue - b.argValue;
			a.argValue = a.argValue - b.argValue;
		}
	}
	public static void sort(tangible.RefObject<Integer> p, int n)
	{
		int i;
		int j;
		for (i = 0;i < n - 1;i++)
		{
		for (j = 0;j < n - 1 - i;j++)
		{
		exchange(p.argValue + j, p.argValue + j + 1);
		}
		}
	}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 't', so pointers on this parameter are left unchanged:
	public static int race(int * t, tangible.RefObject<Integer> q, int n)
	{
		int tj = 0;
		int qw = 0;
		int count = 0;
		for (;;)
		{
			if (n == 0)
			{
				break;
			}
			if (*(t + tj) > *(q.argValue + qw))
			{
				tj++;
				qw++;
				count++;
				n--;
			}
			else if (*(t + tj + n - 1) > *(q.argValue + qw + n - 1))
			{
				count++;
				n--;
			}
			else
			{
				if (*(t + tj) < *(q.argValue + qw + n - 1))
				{
					count--;
				}
				tj++;
				n--;
			}
		}
		return count;
	}
	public static int Main()
	{
		int n;
		int[] t = new int[1000];
		int[] q = new int[1000];
		int i;
		for (;;)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			break;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q[i] = Integer.parseInt(tempVar3);
			}
		}
	tangible.RefObject<Integer> tempRef_t = new tangible.RefObject<Integer>(t);
		sort(tempRef_t, n);
		t = tempRef_t.argValue;
	tangible.RefObject<Integer> tempRef_q = new tangible.RefObject<Integer>(q);
		sort(tempRef_q, n);
		q = tempRef_q.argValue;
	tangible.RefObject<Integer> tempRef_q2 = new tangible.RefObject<Integer>(q);
		System.out.printf("%d\n",200 * race(t, tempRef_q2, n));
		q = tempRef_q2.argValue;
		}
		return 0;
	}

}

