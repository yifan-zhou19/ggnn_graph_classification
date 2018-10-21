//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
//struct node;
public class node
{
	public String id = new String(new char[len]);
	public String name = new String(new char[len]);
	public String sexual = new String(new char[len]);
	public String age = new String(new char[len]);
	public String score = new String(new char[len]);
	public String addr = new String(new char[len]);
	public node next;
	public node pre;
}

package <missing>;

public class GlobalMembers
{
	public static final String end = "end";
	public static int Main()
	{

		node p;
		p = new node();
		p.pre = null;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p.id = tempVar.charAt(0);
			}
			if (strcmp(p.id,end) == 0)
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.sexual = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.age = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p.addr = tempVar6.charAt(0);
			}
			p.next =  new node();
			p.next.pre = p;
			p = p.next;
		}
		p = p.pre;
		p.next = null;
		while (p != null)
		{
			System.out.printf("%s %s %s %s %s %s\n",p.id,p.name,p.sexual,p.age,p.score,p.addr);
			p = p.pre;
			if (p != null)
			{
				p.next = null;
			}
		}
		return 0;
	}


}

