public class list
{
	public String no = new String(new char[10]);
	public String name = new String(new char[20]);
	public char gene;
//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: unsigned int age;
	public int age;
	public float score;
	public String add = new String(new char[20]);
	public list next;
}

package <missing>;

public class GlobalMembers
{
	public static list creat()
	{
		list p1 = null;
		list p2 = null;
		list head;
		int n = 0;
		do
		{
			p2 = p1;
			p1 = new list();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.no = tempVar.charAt(0);
			}
			if (*p1.no == 'e')
			{
				head = p2;
				p1 = null;
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
				p1.gene = tempVar3.charAt(0);
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
			if (n == 0)
			{
				p1.next = null;
			}
			if (n != 0)
			{
				p1.next = p2;
			}
			n = 1;
		}while (1 != 0);
		return head;
	}

	public static int Main()
	{
		list p;
		p = creat();
		while (p != null)
		{
			System.out.printf("%s %s %c %d %g %s\n",p.no,p.name,p.gene,p.age,p.score,p.add);
			p = p.next;
		}
		return 0;
	}


}

