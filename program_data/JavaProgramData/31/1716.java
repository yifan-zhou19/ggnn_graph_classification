public class student
{
	public String num = new String(new char[100]);
	public String name = new String(new char[100]);
	public char gender;
	public int age;
	public float score;
	public String add = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student head = null;
	public static student creat()
	{
		student p1;
		student p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student) malloc(LEN);
		while (strcmp(p1.num,"end") != 0)
		{
			n++;
			if (n == 1)
			{
				p2.next = null;
			}
			else
			{
				p1.next = p2;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			if (strcmp(p1.num,"end") != 0)
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
				p1.score = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.add = tempVar6.charAt(0);
			}
			}
		}
		head = p2;
		return (head);
	}
	public static void Main()
	{
		student p;
		p = creat();
		if (p != 0)
		{
			do
			{
				System.out.printf("%s %s %c %d %g %s",p.num,p.name,p.gender,p.age,p.score,p.add);
				p = p.next;
				if (p.next != 0)
				{
					System.out.print("\n");
				}
			} while (p.next != 0);
		}
	}


}

