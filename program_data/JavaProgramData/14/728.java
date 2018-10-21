package <missing>;

public class GlobalMembers
{
	public static int[] s = new int[100001];
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int id,chin,math,su;
	//	}
	//	s[100001];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].chin = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i].math = tempVar4;
			}
			s[i].su = s[i].chin + s[i].math;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (s[i].su < s[j].su)
				{
					s[100000] = s[i];
					s[i] = s[j];
					s[j] = s[100000];
				}
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d",s[0].id,s[0].su,s[1].id,s[1].su,s[2].id,s[2].su);
		return 0;
	}
}

