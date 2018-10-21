package <missing>;

public class GlobalMembers
{
	public static void fun(tangible.RefObject<Integer> p, int n)
	{
		int i;
		int j;
		int[] b = new int[400];
		int[] q = b;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (*(p.argValue + i) == *(p.argValue + j))
				{
					break;
				}
			}
			if (j == i)
			{
				q[0] = (p.argValue + i);
				q++;
				q[0] = -1000;
				q++;
			}
		}
		*(q - 1) = 0;
		q = b;
		for (;q != 0;q++)
		{
			if (q[0] == -1000)
			{
			System.out.print(",");
			}
			else
			{
			System.out.printf("%d",q[0]);
			}
		}





	}
	public static int Main()
	{
		int[] a = new int[300];
		int[] p = a;
		int n;
		int i;

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
				p + i = tempVar2;
			}
		}
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		fun(tempRef_p, n);
		p = tempRef_p.argValue;
	}




}

