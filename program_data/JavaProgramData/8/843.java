package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void maopao(int c[],int l);
		int[] c1 = new int[100];
		int[] c2 = new int[100];
		int l1;
		int l2;
		int i;
		int n1;
		int n2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n2 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c1[i] = Integer.parseInt(tempVar3);
			}
			l1 = i + 1;
		}
		for (i = 0;i < n2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c2[i] = Integer.parseInt(tempVar4);
			}
			l2 = i + 1;
		}
		maopao(c1, l1);
		System.out.print(" ");
		maopao(c2, l2);

	}

	public static void maopao(int[] c, int l)
	{
	int i;
	int j;
	int t;

	for (j = 1;j < l;j++)
	{
		for (i = 0;i < l - j;i++)
		{
			if (c[i] > c[i + 1])
			{
			 t = c[i + 1];
			 c[i + 1] = c[i];
			 c[i] = t;
			}
		}
	}
	System.out.printf("%d",c[0]);
	for (i = 1;i < l;i++)
	{
		System.out.printf(" %d",c[i]);
	}

	}
}

