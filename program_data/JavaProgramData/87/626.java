package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[100];
		int[] f = new int[100];
		int[] s = new int[100];
		int[] m1 = new int[100];
		int[] f1 = new int[100];
		int[] s1 = new int[100];
		int i;
		int j;
		int k;
		for (i = 0;i < 100;i++)
		{
			m[i] = 0;
			f[i] = 0;
			s[i] = 0;
			m1[i] = 0;
			f1[i] = 0;
			s1[i] = 0;
		}
		for (i = 0;i < 10;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				(s[i]) = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				(f[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(m[i]) = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(s1[i]) = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				(f1[i]) = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				(m1[i]) = Integer.parseInt(tempVar6);
			}
					  if (s[i] == 0 && s1[i] == 0 && f[i] == 0 && f1[i] == 0 && m[i] == 0 & m1[i] == 0)
					  {
					   break;
					  }
			s1[i] = s1[i] + 12;
			j = (s1[i] - s[i]) * 3600 + (f1[i] - f[i]) * 60 + m1[i] - m[i];
			if (j != 0)
			{
				System.out.printf("%d\n",j);
			}
		}








		return 0;
	}
}

