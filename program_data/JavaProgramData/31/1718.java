public class student
{
	public String num = new String(new char[100]);
	public String name = new String(new char[100]);
	public char sex;
	public int age;
	public String score = new String(new char[20]);
	public String address = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(len);
		p2 = p1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		if (strcmp(p1.num,"end") == 0)
		{
			head = p1;
			p1.next = null;
		}
		else
		{
		scanf(wtf);
		p1.next = null;
		for (;;)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p1 = (student)malloc(len);
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  p1.num = tempVar2.charAt(0);
		  }
		  if (strcmp(p1.num,"end") == 0)
		  {
			  break;
		  }
		  scanf(wtf);
		  p1.next = p2;
		  p2 = p1;
		}
		head = p2;
		}
		return (head);
	}
	public static int Main()
	{
		student p;
		p = creat();
		if (p.next == null)
		{
			System.out.print("\n");
		}
		else
		{
		for (;p != null;)
		{
			System.out.print(wtf2);
			p = p.next;
		}
		}
	}
}

