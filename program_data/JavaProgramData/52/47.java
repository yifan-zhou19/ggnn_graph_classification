package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int i;
		int[] s = new int[30];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int end;
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
	m = m % n;
	if (m != 0)
	{
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i] = Integer.parseInt(tempVar3);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
		end = s[n - 1];
		for (p = s + n - 1;p > s;p--)
		{
			*p = (p - 1);
		}
			s[0] = end;
			m--;
		if (m > 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto loop;
		}

		System.out.printf("%d",s[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",s[i]);
		}
	}

	else if (n == m || m == 0)
	{
		System.out.printf("%d",s[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",s[i]);
		}
	}
	}

}

