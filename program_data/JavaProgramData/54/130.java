package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int m;
		int i;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		m = n;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	x = m;
		for (i = 1;i <= n;i++)
		{
			if (x % n == k && ((x - k - x / n) != 0))
			{
				x = x - k - x / n;
			}
			else
			{
				m++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loop;
			}
		}
		 System.out.printf("%d",m);
	}


}

