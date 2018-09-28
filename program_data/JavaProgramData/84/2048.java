package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int t;
		int m1;
		int m2;
//C++ TO JAVA CONVERTER WARNING: The right shift operator was replaced by Java's logical right shift operator since the left operand was originally of an unsigned type, but you should confirm this replacement:
		m1 = m2 = ~((int)-1>>>1);
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
				t = Integer.parseInt(tempVar2);
			}
			if (t > m1)
			{
				m2 = m1;
				m1 = t;
			}
			else if (t > m2)
			{
				m2 = t;
			}
		}
		System.out.printf("%d\n%d",m1,m2);
	}

}

