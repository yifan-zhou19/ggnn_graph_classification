public class student
{
	   public String id = new String(new char[10]);
	   public String name = new String(new char[100]);
	   public char sex;
	   public int age;
	   public String score = new String(new char[100]);
	   public String adr = new String(new char[100]);
	   public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static student creat()
	{
		   student head;
		   student p1;
		   student p2;
		   head = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p1 = p2 = (student)malloc(LEN);
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
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   p1.age = Integer.parseInt(tempVar4);
		   }
		   String tempVar5 = ConsoleInput.scanfRead();
		   if (tempVar5 != null)
		   {
			   p1.score = tempVar5.charAt(0);
		   }
		   String tempVar6 = ConsoleInput.scanfRead();
		   if (tempVar6 != null)
		   {
			   p1.adr = tempVar6.charAt(0);
		   }
		   while (p1.id.charAt(0) != 'e')
		   {
			 n++;
			 if (n == 1)
			 {
			 head = p1;
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
				 p1.id = tempVar7.charAt(0);
			 }
			 String tempVar8 = ConsoleInput.scanfRead(" ");
			 if (tempVar8 != null)
			 {
				 p1.name = tempVar8.charAt(0);
			 }
			 String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar9 != null)
			 {
				 p1.sex = tempVar9.charAt(0);
			 }
			 String tempVar10 = ConsoleInput.scanfRead();
			 if (tempVar10 != null)
			 {
				 p1.age = Integer.parseInt(tempVar10);
			 }
			 String tempVar11 = ConsoleInput.scanfRead();
			 if (tempVar11 != null)
			 {
				 p1.score = tempVar11.charAt(0);
			 }
			 String tempVar12 = ConsoleInput.scanfRead();
			 if (tempVar12 != null)
			 {
				 p1.adr = tempVar12.charAt(0);
			 }
		   }
		   p2.next = null;
		   return (head);
	}
	public static void print(student head, int m)
	{
		 student p1;
		 p1 = head;
		 if (head != null)
		 {
			 do
			 {
					   System.out.printf("%s %s %c %d %s %s\n",p1.id,p1.name,p1.sex,p1.age,p1.score,p1.adr);
					   p1 = p1.next;
			 }while (p1 != null);
		 }
	}
	public static student turnback(student head)
	{
		   student p1;
		   student p2;
		   student news;
		   student p;
		   int i;
		   for (i = n;i >= 0;i--)
		   {
		   p2 = p1 = head;
		   while (p1.next != null)
		   {
			 p2 = p1;
			 p1 = p1.next;
		   }

			 if (i == n)
			 {
			 p = news = p1;
			 }
			 else
			 {
			   p = p.next = p1;
			   p2.next = null;
			 }

		   }
		   return (news);
	}
	public static int Main()
	{
		student head;
		student newhead;
		head = creat();
		newhead = turnback(head);
		print(newhead, n);
	}


}

