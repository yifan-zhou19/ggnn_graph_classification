public class student
{
	public String number = new String(new char[100]);
public String name = new String(new char[100]);
public char sex;
public int age;
public String score = new String(new char[20]);
public String address = new String(new char[100]);
public student nest;
public student front;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student p1;
		student p2;
		int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		p1.front = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.number = tempVar.charAt(0);
		}
		while (p1.number.charAt(0) != 'e' || p1.number.charAt(1) != 'n' || p1.number.charAt(2) != 'd')
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
				p1.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.address = tempVar6.charAt(0);
			}
			n = n + 1;
			p2.nest = p1;
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p1.front = p2;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.number = tempVar7.charAt(0);
			}
		}
		p2.nest = null;
		while (p2 != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",p2.number,p2.name,p2.sex,p2.age,p2.score,p2.address);
			p2 = p2.front;
		}
	}

}

