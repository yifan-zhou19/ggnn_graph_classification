public class shuju
{
	public String xh = new String(new char[20]);
	public String xm = new String(new char[20]);
	public char sex;
	public int age;
   public String fen = new String(new char[10]);
	public String dorm = new String(new char[20]);
	public shuju next;
}

package <missing>;

public class GlobalMembers
{
	public static shuju create()
	{

		shuju head;
		shuju p1;
		shuju p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (shuju)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.xh = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.xm = tempVar2.charAt(0);
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
			p1.fen = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.dorm = tempVar6.charAt(0);
		}
		p1.next = null;
		while (true)
		{

			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (shuju)malloc(len);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.xh = tempVar7.charAt(0);
			}
			if (strcmp(p1.xh,"end") == 0)
			{
				p1 = null;
				break;
			}
			else
			{
				String tempVar8 = ConsoleInput.scanfRead();
				if (tempVar8 != null)
				{
					p1.xm = tempVar8.charAt(0);
				}
				String tempVar9 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar9 != null)
				{
					p1.sex = tempVar9.charAt(0);
				}
				String tempVar10 = ConsoleInput.scanfRead(" ");
				if (tempVar10 != null)
				{
					p1.age = Integer.parseInt(tempVar10);
				}
				String tempVar11 = ConsoleInput.scanfRead(" ");
				if (tempVar11 != null)
				{
					p1.fen = tempVar11.charAt(0);
				}
				String tempVar12 = ConsoleInput.scanfRead(" ");
				if (tempVar12 != null)
				{
					p1.dorm = tempVar12.charAt(0);
				}
			p1.next = p2;
			}
		}
		head = p2;
		return (head);
	}

	public static void print(shuju head)
	{

		shuju p;
		p = head;
		while (p.next != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.xh,p.xm,p.sex,p.age,p.fen,p.dorm);
		   p = p.next;
		}
		 System.out.printf("%s %s %c %d %s %s\n",p.xh,p.xm,p.sex,p.age,p.fen,p.dorm);
	}

	public static void Main()
	{


		shuju p;
		p = create();
		print(p);
	}
}

