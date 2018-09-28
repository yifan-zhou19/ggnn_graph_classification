public class student
{
	public String num = new String(new char[200]);
	public String name = new String(new char[80]);
	public String sex = new String(new char[20]);
	public String age = new String(new char[30]);
	public String score = new String(new char[30]);
	public String add = new String(new char[200]);
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
	  p1 = (student)malloc(LEN);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  p1.num = tempVar.charAt(0);
	  }
	  p1.next = null;
	  while (strcmp(p1.num,"end") != 0)
	  {
		  p2 = p1;
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
			  p1.age = tempVar4.charAt(0);
		  }
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  p1.score = tempVar5.charAt(0);
		  }
		  String tempVar6 = ConsoleInput.scanfRead();
		  if (tempVar6 != null)
		  {
			  p1.add = tempVar6.charAt(0);
		  }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p1 = (student)malloc(LEN);
		  p1.next = p2;
		  String tempVar7 = ConsoleInput.scanfRead();
		  if (tempVar7 != null)
		  {
			  p1.num = tempVar7.charAt(0);
		  }
	  }
	  head = p2;
	  return head;
	 }
	public static void print(student head)
	{
		  student p;
		  for (p = head;p != 0;p = p.next)
		  {
			  System.out.printf("%s %s %s %s %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.add);
		  }
	}

	public static int Main()
	{
		  student head;
		  head = creat();
		  print(head);
		  return 7;
	}

}

