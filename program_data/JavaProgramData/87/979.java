package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int[] h1 = new int[100];
		int[] h2 = new int[100];
		int[] m1 = new int[100];
		int[] m2 = new int[100];
		int[] s1 = new int[100];
		int[] s2 = new int[100];
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				h1[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m1[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				h2[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				m2[i] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				s2[i] = Integer.parseInt(tempVar6);
			}
			if (h1[i] + h2[i] + m1[i] + m2[i] + s1[i] + s2[i] == 0)
			{
				break;
			}
			i++;
		}
		int n;
		int add1;
		int add2;
		int cha;
		n = i;
		for (i = 0;i < n;i++)
		{
			h2[i] = h2[i] + 12;
			add1 = h1[i] * 3600 + m1[i] * 60 + s1[i];
			add2 = h2[i] * 3600 + m2[i] * 60 + s2[i];
			cha = add2 - add1;
			System.out.printf("%d\n",cha);
		}
		return 0;
	}
}

