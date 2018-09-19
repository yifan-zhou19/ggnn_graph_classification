package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int a;
	//		char s[26];
	//	}
	//	zuozhe[1000];
		int i;
		int k;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zuozhe[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				zuozhe[i].s = tempVar3;
			}
		}
		int[] c = new int[26];
		int d;
		for (i = 0;i < n;i++)
		{
			d = String.valueOf(zuozhe[i].s).length();
			for (k = 0;k < d;k++)
			{
				c[zuozhe[i].s[k] - 65]++;
			}
		}
		int f;
		for (i = 1;i < 26;i++)
		{
			if (c[i] > c[0])
			{
				f = i;
				d = c[i];
				c[i] = c[0];
				c[0] = d;
			}
		}
		System.out.printf("%c\n%d\n",f + 65, c[0]);
		for (i = 0;i < n;i++)
		{
			d = String.valueOf(zuozhe[i].s).length();
			for (k = 0;k < d;k++)
			{
				if (zuozhe[i].s[k] == f + 65)
				{
					System.out.printf("%d\n",zuozhe[i].a);
				}
			}
		}
	}
}

