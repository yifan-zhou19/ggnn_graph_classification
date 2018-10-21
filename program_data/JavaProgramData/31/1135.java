public class student
{
	public String num = new String(new char[10]);
	public String s1 = new String(new char[20]);
	public char sex;
	public int age;
	public String mark = new String(new char[20]);
	public String s2 = new String(new char[20]);
	public student next;

}

package <missing>;

public class GlobalMembers
{
	public static student p1; //????????????????????????//
	public static student p2;

	public static int n;

	//????//

	public static student creat()
	{
		student head;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}

		while (strcmp(p1.num,"end") != 0) //?????????//
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.s1 = tempVar2.charAt(0);
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
				p1.mark = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.s2 = tempVar6.charAt(0);
			}
			n = n + 1;
			if (n == 1)
			{
				head = p1; //?????????//
			}
			else
			{
				p2.next = p1;
			}

			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}

		}
		p2.next = null;

		return (head);
	} //?????????????//

	public static student turnback(student head) //??????//
	{
		student newhead = null;

		student anew; //?????????????????//

		do
		{
			p2 = null;
			p1 = head;
			while (p1.next != null)
			{
				p2 = p1;
				p1 = p1.next;
			}
			if (newhead == null)
			{
				newhead = p1;
				anew = newhead.next = p2; //??anew????????//
			}

			anew = anew.next = p2;
			p2.next = null;

		}while (head.next != null);

		return newhead; //??????????//
	}
	//??????//    
	public static void print(student head)
	{
		student p;
		p = head;
		if (p != null)
		{
			do
			{
				System.out.printf("%s %s %c %d %s %s\n", p.num, p.s1, p.sex, p.age, p.mark, p.s2);
				p = p.next;

			}while (p != null);
		}
	}
	//???//                                                                                    
	public static int Main()
	{
		student head;
		head = creat();

		head = turnback(head); //?????????????//

		print(head); //??????????/
	   return 0;

	}
}

