public class stu
{
	public String num = new String(new char[50]);
  public String name = new String(new char[50]);
  public String sex = new String(new char[1]);
  public int age;
  public String score = new String(new char[50]);
  public String add = new String(new char[50]);
  public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stu head;
		stu p1;
		stu p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = (stu)malloc(LN);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 p1.num = tempVar.charAt(0);
	 }
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
		 p1.add = tempVar6.charAt(0);
	 }
	 p1.next = null;
	 p2 = p1;
	 head = p1;
	  do
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p1 = (stu)malloc(LN);
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			p1.num = tempVar7.charAt(0);
		}
		if (*(p1.num) == 'e')
		{
			p1 = null;
			head = p2;
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
		  p1.add = tempVar12.charAt(0);
	  }
		p1.next = p2;
		p2 = p1;
		 }
	  }while (1 != 0);
	  while (head != null)
	  {
		  System.out.printf("%s %s %c %d %s %s\n",head.num,head.name,*(head.sex),head.age,head.score,head.add);
		head = head.next;
	  }
	}


}

