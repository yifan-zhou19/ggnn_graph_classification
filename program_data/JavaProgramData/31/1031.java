public class STUDENT
{
	public STUDENT former;
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public float score;
	public String address = new String(new char[20]);
	public STUDENT next;
}

package <missing>;

public class GlobalMembers
{
	public static STUDENT stu = new STUDENT();

	public static void Main()
	{
		STUDENT head;
		STUDENT p1;
		STUDENT p2;
		STUDENT p3;
		head = p1 = p2 = stu;
		p3 = null;
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			if (p1.num.charAt(0) == 'e')
			{
				p2 = p1.next;
				p2 = null;
				p1 = p3;
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
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
				p1.score = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.address = tempVar6.charAt(0);
			}
			p2 = p1.next;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p2 = (STUDENT)malloc(LEN);
			p1.former = p3;
			p3 = p1;
			p1 = p2;
		}
		for (;;)
		{
			System.out.printf("%s %s %c %d %g %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.address);
			p2 = p1.former;
			p1 = p2;
			if (p2 == null)
			{
				break;
			}
		}
	}

}

