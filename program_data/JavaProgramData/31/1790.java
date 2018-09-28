public class stu
{
 public String id = new String(new char[10]);
 public String name = new String(new char[20]);
 public char sex;
 public int age;
 public String score = new String(new char[10]);
 public String addr = new String(new char[20]);
 public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stu creat = new stu();
		void output(struct stu * head);

		stu head;
		stu p;

		head = null;
		head = creat();
					  p = head;

		output(head);


	}


	public static stu creat()
	{
		   int i;
		   stu p1;
		   stu p2;
		   stu p3;
		   stu head;
		   head = null;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p1 = (stu)malloc(LEN);
		   if (head == null)
		   {
			   head = p2 = p3 = p1;
		   }
		   p1.next = null;


		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   p1.id = tempVar.charAt(0);
		   }

		   while (p1.id.charAt(0) != 'e')
		   {
			p3 = p2;



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
				p1.addr = tempVar6.charAt(0);
			}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu)malloc(LEN);
			p1.next = p2;
			p2 = p1;

			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.id = tempVar7.charAt(0);
			}


		   }
		   head = p3;



		   return head;
	}

	public static void output(stu head)
	{
		 stu p1;
		 stu p2;
		 p1 = head;


		 while (p1 != null)
		 {
		  System.out.printf("%s %s %c %d %s %s\n",p1.id,p1.name,p1.sex,p1.age,p1.score,p1.addr);
		  p1 = p1.next;
		 }
	}

}

