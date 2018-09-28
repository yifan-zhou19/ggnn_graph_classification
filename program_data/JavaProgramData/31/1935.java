public class stu
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public String add = new String(new char[30]);
	public char sex;
	public int age;
	public float score;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stu p1;
		stu p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (stu)malloc(len);
		p1.next = null;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			if (!strcmp(p1.num,"end"))
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p1.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.score = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.add = tempVar6.charAt(0);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p2 = (stu)malloc(len);
			p2.next = p1;
			p1 = p2;
		}
		p1 = p1.next;
		while (p1 != null)
		{
			System.out.printf("%s %s %c %d %g %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.add);
			p1 = p1.next;
		}


	}
}

