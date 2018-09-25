package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s1 = new int[100];
		int[] f1 = new int[100];
		int[] m1 = new int[100];
		int[] s2 = new int[100];
		int[] f2 = new int[100];
		int[] m2 = new int[100];
		int result = 0;
		int i;
		for (i = 0;i < 100;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			f1[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m1[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			s2[i] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			f2[i] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			m2[i] = Integer.parseInt(tempVar6);
		}
		result = 0;
			if (s1[i] != 0)
			{
			s2[i] += 12;
			result += (s2[i] - s1[i]) * 3600;
			result += (f2[i] - f1[i]) * 60;
			result += (m2[i] - m1[i]);
			System.out.printf("%d\n",result);
			}
			else if (s1[i] == 0)
			{
				break;
			}
		}

		return 0;
	}
}

