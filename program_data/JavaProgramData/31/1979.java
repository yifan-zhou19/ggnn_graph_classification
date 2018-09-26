public class student
{
	public String num = new String(new char[50]);
	public String name = new String(new char[50]);
	public String sex = new String(new char[50]);
	public String age = new String(new char[50]);
	public String score = new String(new char[50]);
	public String adr = new String(new char[50]);
	public student next;
} //?????????????

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student p1;
		student p2;
		student head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		int i = 0;
		p2 = null;
		for (;;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			if (strcmp(p1.num,"end") == 0)
			{ //??p1->num?????
				break;
			}
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
				p1.adr = tempVar6.charAt(0);
			}
			p1.next = p2;
			p2 = p1;

		}

		head = p2;
		if (head != null)
		{
			p1 = head;
			do
			{
				System.out.printf("%s %s %s %s %s %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.adr);
				p1 = p1.next;
			}while (p1 != null);
		}
		return 0;
	}
}

