public class student
{
 public String num = new String(new char[100]);
 public String name = new String(new char[100]);
 public String sex = new String(new char[2]);
 public int age;
 public String score = new String(new char[20]);
 public String addr = new String(new char[100]);
 public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
	 student head;
	 student p1;
	 student p2 = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = (student)malloc(LEN);
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
	 String tempVar3 = ConsoleInput.scanfRead();
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
		 p1.addr = tempVar6.charAt(0);
	 }
	 p1.next = null;
	 p2 = p1;

	 while (true)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p1 = (student)malloc(LEN);
	  String tempVar7 = ConsoleInput.scanfRead();
	  if (tempVar7 != null)
	  {
		  p1.num = tempVar7.charAt(0);
	  }
	  if (strcmp(p1.num,"end") == 0)
	  {
	   break;
	  }
	  else
	  {
	   String tempVar8 = ConsoleInput.scanfRead();
	   if (tempVar8 != null)
	   {
		   p1.name = tempVar8.charAt(0);
	   }
	   String tempVar9 = ConsoleInput.scanfRead();
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
		   p1.addr = tempVar12.charAt(0);
	   }
	   p1.next = p2;
	   p2 = p1;
	  }
	 }
	 }
	 head = p2;
	 return (head);
	}

	public static void print(student head)
	{
	 student p1;
	 p1 = head;
	 while (p1 != null)
	 {
	  System.out.printf("%s %s %s %d %s %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.addr);
	  p1 = p1.next;
	 }
	}

	public static void Main()
	{
	 student head = null;
	 head = creat();
	 print(head);
	}
}

