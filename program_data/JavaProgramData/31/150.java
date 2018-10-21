public class student
{
	public String name = new String(new char[32]);
	public char sex;
	public String address = new String(new char[32]);
	public String id = new String(new char[10]);
	public String score = new String(new char[10]);
	public int age;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student create()
	{
		student head = null;
		student p1;
		student p2;
		String ch = new String(new char[10]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(Len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.id = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
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
			p1.score = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.address = tempVar6.charAt(0);
		}
		p1.next = null;
		head = p1;
		p2 = p1;
		do
		{
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				ch = tempVar7.charAt(0);
			}
			if (strcmp(ch,"end") == 0)
			{
				break;
			}
		 else
		 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			  p1 = (student)malloc(Len);
				p1.id = ch;
				String tempVar8 = ConsoleInput.scanfRead();
				if (tempVar8 != null)
				{
					p1.name = tempVar8.charAt(0);
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
					p1.score = tempVar11.charAt(0);
				}
				String tempVar12 = ConsoleInput.scanfRead(" ");
				if (tempVar12 != null)
				{
					p1.address = tempVar12.charAt(0);
				}
				p1.next = null;
				p2.next = p1;
				p2 = p1;
		 }
		}while (1 != 0);
			 return head;
	}
	   public static void print(student head)
	   {
		   student p1;
		   student p2;
		while (p1 != null)
		{
		   p1 = head;
		   if (p1.next == null)
		   {
				System.out.printf("%s %s %c %d %s %s",p1.id,p1.name,p1.sex,p1.age,p1.score,p1.address);
				break;
		   }
			else
			{
				while (p1.next != null)
				{
				 p2 = p1;
				 p1 = p1.next;
				}
			   System.out.printf("%s %s %c %d %s %s\n",p1.id,p1.name,p1.sex,p1.age,p1.score,p1.address);
			   p2.next = null;
			   p1 = null;
			}
		}
	   }
	  public static int Main()
	  {
		  student head;
		  head = create();
		  print(head);
	  }

}

