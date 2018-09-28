package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int[] p = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = p + n - 1;
		for (;p >= a;p--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
		}
		p = a;
		for (p = a;p < a + n - 1;p++)
		{
			System.out.printf("%d ",p[0]);
		}
					  System.out.printf("%d",p[0]);
	}
}

