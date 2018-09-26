public class student
{
		public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public double score;
	public String add = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
		public static student head;
		public static student p1;
	public static void Main()
	{
		int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		while (p1.num.charAt(0) != 'e')
		{
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
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		p1.age = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		p1.score = Double.parseDouble(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		p1.add = tempVar6.charAt(0);
	}
			n++;
			if (n == 1)
			{
				p1.next = null;
			}
			else
			{
				p1.next = head;
			}
	head = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
		}
		p1 = head;
		do
		{
			System.out.printf("%s %s %c %d %g %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.add);
			p1 = p1.next;
		} while (p1 != null);
	}
}

