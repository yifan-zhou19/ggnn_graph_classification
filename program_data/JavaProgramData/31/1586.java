public class stu
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char gender;
	public int age;
	public float score;
	public String address = new String(new char[20]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu creat()
	{
		stu head;
		stu p1;
		stu p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p1 = p2 = (stu)malloc(LEN);
		head.next = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		SCAN;
		for (;;)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu)malloc(LEN);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = tempVar2.charAt(0);
			}
			if (p1.num.charAt(0) != 'e')
			{
				SCAN;
			 p1.next = p2;
			   p2 = p1;
			}
			else
			{
				break;
			}
		}
		return (p2);
	}

	public static int Main()
	{
		stu p;
		stu t;
		t = creat();
		for (p = t;p != null;p = p.next)
		{
		System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.gender,p.age,p.score,p.address);
		}
	}
}

