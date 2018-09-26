public class student
{
	public String id = new String(new char[50]);
	public String name = new String(new char[50]);
	public char sex;
	public int age;
	public double grade;
	public String a = new String(new char[20]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student h;
		student p;
		student q;
		int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.id = tempVar.charAt(0);
		}
		while (p.id.charAt(0) != 'e')
		{
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
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 p.age = Integer.parseInt(tempVar4);
			 }
			 String tempVar5 = ConsoleInput.scanfRead();
			 if (tempVar5 != null)
			 {
				 p.grade = Double.parseDouble(tempVar5);
			 }
			 String tempVar6 = ConsoleInput.scanfRead();
			 if (tempVar6 != null)
			 {
				 p.a = tempVar6.charAt(0);
			 }
			 n = n + 1;
			 if (n == 1)
			 {
				 p.next = null;
			 }
			 else
			 {
				 p.next = h;
			 }
			 h = p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 p = (student)malloc(LEN);
			 String tempVar7 = ConsoleInput.scanfRead();
			 if (tempVar7 != null)
			 {
				 p.id = tempVar7.charAt(0);
			 }
		}
		p = h;
		do
		{
			System.out.printf("%s %s %c %d %g %s\n",p.id,p.name,p.sex,p.age,p.grade,p.a);
			p = p.next;
		} while (p != null);
	}


}

