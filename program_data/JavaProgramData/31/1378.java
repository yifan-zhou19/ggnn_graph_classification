public class Student
{
	public String num = new String(new char[41]);
	public String name = new String(new char[41]);
	public String gender = new String(new char[5]);
	public int age;
	public String score = new String(new char[10]);
	public String address = new String(new char[41]);
	public Student next;
	public Student pre;
}

package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	public static int size = sizeof(Student);
	public static Student gan = new Student();
	public static void push()
	{
		String ster = new String(new char[41]);
		Student pt;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ster = tempVar.charAt(0);
		}
		while (strcmp(ster,"end") != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			pt = malloc(size);
			pt.num = ster;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pt.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pt.gender = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				pt.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				pt.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				pt.address = tempVar6.charAt(0);
			}
			(gan.pre).next = pt; //????????????next?
			pt.pre = gan.pre; //????????????pre?
			gan.pre = pt; //??????????????
			pt.next = gan; //???????
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				ster = tempVar7.charAt(0);
			}
		}
	}
	public static void display(Student stu)
	{
		System.out.printf("%s %s %s %d %s %s\n",stu.num,stu.name,stu.gender,stu.age,stu.score,stu.address);
	}
	public static int Main()
	{
		gan.next = gan;
		gan.pre = gan;
		push();
		Student pt;
		pt = gan.pre;
		while (pt != gan)
		{
			display(pt);
			pt = pt.pre;
		}
		return 0;
	}

}

