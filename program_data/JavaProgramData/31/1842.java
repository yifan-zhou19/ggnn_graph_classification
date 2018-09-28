public class stu
{
	public String num = new String(new char[15]);
	public String name = new String(new char[20]);
	public char gender;
	public int age;
	public String score = new String(new char[10]);
	public String add = new String(new char[20]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static stu creat()
	{
		stu head;
		stu p;
		stu q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = q = (stu)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			p.gender = tempVar3.charAt(0);
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
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p.add = tempVar6.charAt(0);
		}
		for (n = 0;p.gender == 'f' || p.gender == 'm';n++)
		{
			 if (n == 0)
			 {
				 p.next = null;
			 }
			 else
			 {
				 p.next = q;
			 }
			 q = p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 p = (stu)malloc(LEN);
			 String tempVar7 = ConsoleInput.scanfRead();
			 if (tempVar7 != null)
			 {
				 p.num = tempVar7.charAt(0);
			 }
			 String tempVar8 = ConsoleInput.scanfRead();
			 if (tempVar8 != null)
			 {
				 p.name = tempVar8.charAt(0);
			 }
			 String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar9 != null)
			 {
				 p.gender = tempVar9.charAt(0);
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
			 String tempVar12 = ConsoleInput.scanfRead();
			 if (tempVar12 != null)
			 {
				 p.add = tempVar12.charAt(0);
			 }
		}
		head = q;
		return (head);
	}
	public static void print(stu head)
	{
		stu p;
		if (head != null)
		{
			for (p = head;p != null;p = p.next)
			{
				System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.gender,p.age,p.score,p.add);
			}
		}
	}
	public static void Main()
	{
		stu head;
		head = creat();
		print(head);
	}

}

