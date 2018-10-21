package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int[] p = a;
		int i;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			t = Integer.parseInt(tempVar2);
		}
		p[0] = t;
		j = 1;
		System.out.printf("%d",t);
		for (i = 2;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t = Integer.parseInt(tempVar3);
			}
			for (p = a;p < a + j;p++)
			{
				if (p[0] == t)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto z;
				}
			}
			p[0] = t;
			j++;
			System.out.printf(",%d",t);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	z:
	;
		}
	}
}

