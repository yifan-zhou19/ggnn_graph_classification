//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class student
{
	 public String id = new String(new char[15]);
	 public String name = new String(new char[20]);
	 public char sex;
	 public int age;
	 public String grade = new String(new char[20]);
	 public String add = new String(new char[20]);
	 public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student set()
	{
		 student head;
		 student p1;
		 student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 head = (student)malloc(LEN);
		 p1 = head;
		 p2 = head;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 head.id = tempVar.charAt(0);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 head.name = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar3 != null)
		 {
			 head.sex = tempVar3.charAt(0);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 head.age = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ");
		 if (tempVar5 != null)
		 {
			 head.grade = tempVar5.charAt(0);
		 }
		 String tempVar6 = ConsoleInput.scanfRead(" ");
		 if (tempVar6 != null)
		 {
			 head.add = tempVar6.charAt(0);
		 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 p1 = (student)malloc(LEN);
		 String tempVar7 = ConsoleInput.scanfRead();
		 if (tempVar7 != null)
		 {
			 p1.id = tempVar7.charAt(0);
		 }
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
			 p1.grade = tempVar11.charAt(0);
		 }
		 String tempVar12 = ConsoleInput.scanfRead(" ");
		 if (tempVar12 != null)
		 {
			 p1.add = tempVar12.charAt(0);
		 }
		 p2.next = p1;
		 p2 = p1;
		 while (true)
		 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			  p1 = (student)malloc(LEN);
			  String tempVar13 = ConsoleInput.scanfRead();
			  if (tempVar13 != null)
			  {
				  p1.id = tempVar13.charAt(0);
			  }
			  if (strcmp(p1.id,"end") == 0)
			  {
				   p2.next = null;
				   break;
			  }
			  String tempVar14 = ConsoleInput.scanfRead();
			  if (tempVar14 != null)
			  {
				  p1.name = tempVar14.charAt(0);
			  }
			  String tempVar15 = ConsoleInput.scanfRead(" ", 1);
			  if (tempVar15 != null)
			  {
				  p1.sex = tempVar15.charAt(0);
			  }
			  String tempVar16 = ConsoleInput.scanfRead(" ");
			  if (tempVar16 != null)
			  {
				  p1.age = Integer.parseInt(tempVar16);
			  }
			  String tempVar17 = ConsoleInput.scanfRead(" ");
			  if (tempVar17 != null)
			  {
				  p1.grade = tempVar17.charAt(0);
			  }
			  String tempVar18 = ConsoleInput.scanfRead(" ");
			  if (tempVar18 != null)
			  {
				  p1.add = tempVar18.charAt(0);
			  }
			  p2.next = p1;
			  p2 = p1;
		 }
		 return (head);
	}

	public static int Main()
	{
		 student p;
		 student p1;
		 student p2;
		 student p3;
		 int i;
		 int j;
		 int n = 1;
		 p = set();
		 p1 = p;
		 p1 = p1.next;
		 p1 = p1.next;
		 p2 = p;
		 p2 = p2.next;
		 p3 = p;
		 while (p1 != null)
		 {
			  p2.next = p3;
			  p3 = p2;

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


