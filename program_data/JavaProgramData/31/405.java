public class stu
{
		public String id = new String(new char[100]);
	public String name = new String(new char[100]);
	public String sex = new String(new char[3]);
	public String age = new String(new char[10]);
	public String score = new String(new char[10]);
	public String add = new String(new char[100]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int t;
		int ans;
		int ii;
		int i;
		int j;
		int jj;
		int flag;
		stu p0;
		stu p1;
		stu p2;
		stu head;
		String s = new String(new char[30]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (stu)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.id = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.age = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p1.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p1.add = tempVar6.charAt(0);
		}
		p1.next = null;
		head = p1;
		p2 = p1;
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.id = tempVar7.charAt(0);
			}
			if (strcmp(p1.id,"end") == 0)
			{
				head = p2;
				break;
			}
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead();
			if (tempVar9 != null)
			{
				p1.sex = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead();
			if (tempVar10 != null)
			{
				p1.age = tempVar10.charAt(0);
			}
			String tempVar11 = ConsoleInput.scanfRead();
			if (tempVar11 != null)
			{
				p1.score = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead();
			if (tempVar12 != null)
			{
				p1.add = tempVar12.charAt(0);
			}
			p1.next = p2;
			p2 = p1;
		}

		p1 = head;
		while (p1.next != null)
		{
			System.out.printf("%s %s %s %s %s %s\n",p1.id,p1.name,p1.sex,p1.age,p1.score,p1.add);
			p1 = p1.next;
		}
		System.out.printf("%s %s %s %s %s %s",p1.id,p1.name,p1.sex,p1.age,p1.score,p1.add);
		return 0;
	}


}

