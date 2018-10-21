public class student
{
	public int num;
	public int yuwen;
	public int shuxue;
	public int zongfen;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student[] s = tangible.Arrays.initializeWithDefaultstudentInstances(3);
		student p = new student();
		student temp = new student();
		for (i = 0;i < 3;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].yuwen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i].shuxue = Integer.parseInt(tempVar4);
			}
			s[i].zongfen = s[i].shuxue + s[i].yuwen;
		}
		for (i = 0;i < 2;i++)
		{
			for (j = 0;j < 2 - i;j++)
			{
				if (s[j].zongfen < s[j + 1].zongfen)
				{
					temp = s[j],s[j] = s[j + 1],s[j + 1] = temp;
				}
			}
		}
		for (i = 3;i < n;i++)
		{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p.num = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p.yuwen = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p.shuxue = Integer.parseInt(tempVar7);
			}
			p.zongfen = p.shuxue + p.yuwen;
			if (p.zongfen > s[2].zongfen && p.zongfen <= s[1].zongfen)
			{
				s[2] = p;
			}
			else if (p.zongfen > s[1].zongfen && p.zongfen <= s[0].zongfen)
			{
				s[2] = s[1],s[1] = p;
			}
			else if (p.zongfen > s[0].zongfen)
			{
				s[2] = s[1],s[1] = s[0],s[0] = p;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d",s[0].num,s[0].zongfen,s[1].num,s[1].zongfen,s[2].num,s[2].zongfen);
	}
}

