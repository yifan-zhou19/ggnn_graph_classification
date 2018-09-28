package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int i;
		int i1;
		int temp;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		n = n % m;
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		if (n == 0 || n == m)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto a;
		}
		else if (n != 0)
		{
		for (i = 0;i < n;i++)
		{
			for (i1 = m - 1;i1 > 0;i1--)
			{
				temp = a[i1 - 1];
				a[i1 - 1] = a[i1];
				a[i1] = temp;
			}
		}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	a:
	for (i = 0;i < m - 1;i++)
	{
		System.out.printf("%d ",a[i]);
	}
		System.out.printf("%d",a[m - 1]);
	}

}

