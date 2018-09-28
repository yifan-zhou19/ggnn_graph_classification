public class node
{
	public node last;
	public String id = new String(new char[15]);
	public String name = new String(new char[25]);
	public char sex;
	public int age;
	public String score = new String(new char[10]);
	public String addr = new String(new char[15]);
	public node next;
}

package <missing>;

public class GlobalMembers
{
	public static int n = 1;

	public static node newnode()
	{
		node head = null;
		node New;
		node This;
		do
		{
			New = new node();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				New.id = tempVar.charAt(0);
			}
			if (n == 1)
			{
				head = New;
				New.last = null;
				This = head;
			}
			else
			{
				This.next = New;
				New.last = This;
			}
			if (strcmp(New.id,"end") != 0)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					New.name = tempVar2.charAt(0);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar3 != null)
				{
					New.sex = tempVar3.charAt(0);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					New.age = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead(" ");
				if (tempVar5 != null)
				{
					New.score = tempVar5.charAt(0);
				}
				String tempVar6 = ConsoleInput.scanfRead(" ");
				if (tempVar6 != null)
				{
					New.addr = tempVar6.charAt(0);
				}
				This = New;
				n++;
			}
		}while (strcmp(New.id,"end") != 0);
		This.next = null;
		return (This);
	}
	public static void Main()
	{
		node p;
		p = newnode();
		do
		{
			System.out.printf("%s %s %c %d %s %s\n",p.id,p.name,p.sex,p.age,p.score,p.addr);
			p = p.last;
		}while (p.last != null);
		System.out.printf("%s %s %c %d %s %s\n",p.id,p.name,p.sex,p.age,p.score,p.addr);
	}
}

