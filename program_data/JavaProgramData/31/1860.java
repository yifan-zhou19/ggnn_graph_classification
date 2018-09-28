public class student
{
	 public String number = new String(new char[30]);
	 public String name = new String(new char[20]);
	 public char sex;
	 public int age;
	 public String score = new String(new char[30]);
	 public String address = new String(new char[20]);
	 public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 student head;
		 student end;
		 student p;
		 student q;
		 student a;
		 head = new student();
		 end = new student();
		 int i;
		 int n;
		 end.next = null;
		 a = head;
		 for (i = 1;;i++)
		 {
			 if (i == 1)
			 {
				 p = new student();
				 String tempVar = ConsoleInput.scanfRead();
				 if (tempVar != null)
				 {
					 p.number = tempVar.charAt(0);
				 }
				 if (p.number.charAt(0) == 'e')
				 {
					 break;
				 }
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 p.name = tempVar2.charAt(0);
				 }
				 String tempVar3 = ConsoleInput.scanfRead(" ", 1);
				 if (tempVar3 != null)
				 {
					 p.sex = tempVar3.charAt(0);
				 }
				 String tempVar4 = ConsoleInput.scanfRead(" ");
				 if (tempVar4 != null)
				 {
					 p.age = Integer.parseInt(tempVar4);
				 }
				 String tempVar5 = ConsoleInput.scanfRead(" ");
				 if (tempVar5 != null)
				 {
					 p.score = tempVar5.charAt(0);
				 }
				 String tempVar6 = ConsoleInput.scanfRead(" ");
				 if (tempVar6 != null)
				 {
					 p.address = tempVar6.charAt(0);
				 }
				 head.next = p;
				 p.next = end;
				 q = p;
			 }
			 else
			 {
				 p = new student();
				 String tempVar7 = ConsoleInput.scanfRead();
				 if (tempVar7 != null)
				 {
					 p.number = tempVar7.charAt(0);
				 }
				 if (p.number.charAt(0) == 'e')
				 {
					 break;
				 }
				 String tempVar8 = ConsoleInput.scanfRead();
				 if (tempVar8 != null)
				 {
					 p.name = tempVar8.charAt(0);
				 }
				 String tempVar9 = ConsoleInput.scanfRead(" ", 1);
				 if (tempVar9 != null)
				 {
					 p.sex = tempVar9.charAt(0);
				 }
				 String tempVar10 = ConsoleInput.scanfRead(" ");
				 if (tempVar10 != null)
				 {
					 p.age = Integer.parseInt(tempVar10);
				 }
				 String tempVar11 = ConsoleInput.scanfRead(" ");
				 if (tempVar11 != null)
				 {
					 p.score = tempVar11.charAt(0);
				 }
				 String tempVar12 = ConsoleInput.scanfRead(" ");
				 if (tempVar12 != null)
				 {
					 p.address = tempVar12.charAt(0);
				 }
				 head.next = p;
				 p.next = q;
				 q = p;
			 }
		 }
		 a = head.next;
		 for (;a.next != null;)
		 {
			 System.out.printf("%s %s %c %d %s %s\n",a.number,a.name,a.sex,a.age,a.score,a.address);
			 a = a.next;
		 }

	}

}

