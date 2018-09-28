public class a
{
	public String num = new String(new char[10]);
	public String name = new String(new char[21]);
	public char sex;
	public int age;
	public float score;
	public String address = new String(new char[12]);
	public a next;
}

package <missing>;

public class GlobalMembers
{
	public static a create()
	{
		a head;
		a p1;
		p1 = len;
		p1.next = null_Renamed;
		head = p1;
		p1.num = "pp";
		while (strcmp(p1.num,"end"))
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			if (strcmp(p1.num,"end") != 0)
			{
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
				p1.address = tempVar6.charAt(0);
			}
			p1 = len;
			p1.next = head;
			head = p1;
			p1.num = "pp";
			}
		}
		head = p1.next;
		return head;
	}
	public static void print(a head)
	{
		a p1;
		p1 = head;
		do
		{
			System.out.printf("%s %s %c %d %g %s",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.address);
			if (p1.next != null_Renamed)
			{
				System.out.print("\n");
			}
			p1 = p1.next;
		}while (p1 != null);
	}
	public static int Main()
	{
		a create = new a();
		a head;
		void print(struct a * head);
		head = create();
		print(head);
	}
}

