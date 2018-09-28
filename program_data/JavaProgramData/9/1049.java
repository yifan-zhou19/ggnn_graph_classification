public class sick
{
	public int age;
	public String id = new String(new char[100]);
	public sick next;
}

package <missing>;

public class GlobalMembers
{
	public static sick insert(sick head, sick new1)
	{
		sick p0;
		sick p1;
		sick p2;
		sick p;
		p1 = head;
		p0 = new1;
		if (head == null)
		{
			head = p0;
			p0.next = null;
		}
		else
		{
			 if (p0.age < 60)
			 {
				p1 = head;
				while (p1 != null)
				{
					p2 = p1;
					p1 = p1.next;
				}
				p2.next = p0;
				p0.next = null;
			 }
			else
			{
			   while ((p1.age >= p0.age) && (p1.next != null)) //?????????????????
			   {
				p2 = p1;
				p1 = p1.next;
			   }
			   if (p0.age > p1.age) //?????????????????
			   {
				 if (head == p1)
				 {
					head = p0;
				 }
				 else
				 {
					p2.next = p0;
				 }
				 p0.next = p1;
			   }
				else
				{
				p1.next = p0;
				p0.next = null;
				}
			}
		}
		return (head);
	}
	public static void Main()
	{
		sick head;
		sick p;
		int n;
		int i;
		head = null; //head????NULL????,????????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sick insert = new sick(struct sick * head,struct sick * new1); //??
		for (i = 0;i < n;i++)
		{
			p = new sick();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.age = Integer.parseInt(tempVar3);
			}
			head = insert(head, p);
		}
		p = head;
		do
		{
			System.out.printf("%s\n",p.id);
			p = p.next;
		}while (p != null);
	}

}

