package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int temp = 26;
		int n;
		int[] p = new int[27];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int a;
	//		char s[30];
	//	}
	//	t[1000];
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
				t[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				t[i].s = tempVar3;
			}
			for (j = 0;j < String.valueOf(t[i].s).length();j++)
			{
				p[t[i].s[j] - 'A']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (p[i] > p[temp])
			{
				temp = i;
			}
		}
		System.out.printf("%c\n%d\n",temp + 'A',p[temp]);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(t[i].s).length();j++)
			{
				if (t[i].s[j] == temp + 'A')
				{
					System.out.printf("%d\n",t[i].a);
					break;
				}
			}
		}
		return 0;
	}
}

