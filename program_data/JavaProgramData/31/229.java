public class stu
{
	public String id = new String(new char[16]);
 public String name = new String(new char[32]);
 public char gender;
 public int age;
 public String score = new String(new char[8]);
 public String add = new String(new char[16]);
 public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static stu creat()
	{
		stu head;
		stu p1;
		stu p2;
	 n = 0;
	 head = null;
	 p1 = p2 = new stu();
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 p1.id = tempVar.charAt(0);
	 }
	 while (strcmp(p1.id,"end") != 0)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 p1.name = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar3 != null)
		 {
			 p1.gender = tempVar3.charAt(0);
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
			 p1.add = tempVar6.charAt(0);
		 }
	  n = n + 1;
	  if (n == 1)
	  {
		  head = p1;
		  p1.next = null;
	  }
	  else
	  {
	   p1.next = p2;
	   head = p1;
	  }
	  p2 = p1;
	  p1 = new stu();
	  String tempVar7 = ConsoleInput.scanfRead();
	  if (tempVar7 != null)
	  {
		  p1.id = tempVar7.charAt(0);
	  }
	 }
	 return (head);
	}
	public static void Main()
	{
		stu head;
		stu p;
	 head = creat();
	 p = head;
	 if (head != null)
	 {
	 do
	 {
		 System.out.printf("%s %s %c %d %s %s\n",p.id,p.name,p.gender,p.age,p.score,p.add);
	  p = p.next;
	 }while (p != null);
	 }
	}
}

