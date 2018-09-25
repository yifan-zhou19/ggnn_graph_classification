package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct fy
	//	{
	//		int x;
	//		char y[26];
	//		int s[26];
	//		struct fy *z;
	//	}
	//	sl[1000],*p;
		int n;
		int i;
		int j;
		int[] b = new int[26];
		String a = new String(new char[100]);
		p = &sl[0];
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
				sl[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sl[i].y = tempVar3;
			}
			for (j = 0;j < String.valueOf(sl[i].y).length();j++)
			{
				sl[i].s[sl[i].y[j] - 'A'] = 1;
				b[sl[i].y[j] - 'A']++;
			}
			sl[i].z = &sl[i + 1];
		}
		sl[n - 1].z = null;
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (b[i] < b[j])
				{
					break;
				}
			}
			if (j == 26)
			{
				j = i;
				break;
			}
		}
		System.out.printf("%c\n%d\n",i + 'A',b[j]);
		while (p != null)
		{
			if (p.s[i] == 1)
			{
				System.out.printf("%d\n",p.x);
			}
			p = p.z;
		}
		return 0;
	}
}

