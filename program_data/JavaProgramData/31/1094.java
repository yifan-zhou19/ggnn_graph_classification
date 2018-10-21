public class stu
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char gen;
	public int age;
	public float mark;
	public String add = new String(new char[20]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static final String end = "end";
	public static int Main()
	{
		stu p1;
		stu p2;
		stu t = new stu();
		p1 = p2 = null;
		while (scanf("%s",t.num),strcmp(t.num,end) != 0)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				t.name = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar2 != null)
			{
				t.gen = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				t.age = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				t.mark = Float.parseFloat(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				t.add = tempVar5.charAt(0);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu)malloc(LEN);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: *p1=t;
			p1.copyFrom(t);
			p1.next = p2;
			p2 = p1;
		}
		while (p1 != null)
		{
			System.out.printf("%s %s %c %d %g %s\n",p1.num,p1.name,p1.gen,p1.age,p1.mark,p1.add);
			p1 = p1.next;
		}
	}
}

