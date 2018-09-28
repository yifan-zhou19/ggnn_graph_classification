/*?? ?? ?? ?? ?? ??*/
public class student
{
	public student pre;
	public String num = new String(new char[100]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[2]);
	public String age = new String(new char[10]);
	public String score = new String(new char[10]);
	public String ad = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
		student end;
		student p1;
		student p2;
		student p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		while (strcmp(p1.num,"end") != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.age = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.ad = tempVar6.charAt(0);
			}
			n = n + 1;
			if (n == 1)
			{
				p1.pre = null;
				p2 = p1;
			}
			else
			{
				p1.pre = p2;
			}
				p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (student)malloc(LEN);
				String tempVar7 = ConsoleInput.scanfRead();
				if (tempVar7 != null)
				{
					p1.num = tempVar7.charAt(0);
				}
		}
		p = p2;
		do
		{
			System.out.printf("%s %s %s %s %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.ad);
			p = p.pre;
		}while (p != null);

	}

}

