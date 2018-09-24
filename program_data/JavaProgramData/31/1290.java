public class stu
	{
	public String num = new String(new char[30]);
	public String name = new String(new char[30]);
	public char sex;
	public int age;
	public float score;
	public String add = new String(new char[30]);
	public stu next;
	}

package <missing>;

public class GlobalMembers
{
		public static stu p1;
		public static stu p2;
		public static stu head;
	public static int Main()
	{
		void result(struct stu*);

		p1 = p2 =  new stu();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(null, 1);
		if (tempVar3 != null)
		{
			(p1.sex) = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			(p1.age) = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			(p1.score) = Float.parseFloat(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p1.add = tempVar6.charAt(0);
		}
		head = p1;
		head.next = null;
		for (;;)
		{

		 p1 =  new stu();
		 p2.next = p1;
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			p1.num = tempVar7.charAt(0);
		}
		if (p1.num.charAt(0) == 'e' && p1.num.charAt(1) == 'n' && p1.num.charAt(2) == 'd')
		{
			p2.next = null;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto print;
		}
		String tempVar8 = ConsoleInput.scanfRead();
		if (tempVar8 != null)
		{
			p1.name = tempVar8.charAt(0);
		}
		String tempVar9 = ConsoleInput.scanfRead(null, 1);
		if (tempVar9 != null)
		{
			(p1.sex) = tempVar9.charAt(0);
		}
		String tempVar10 = ConsoleInput.scanfRead();
		if (tempVar10 != null)
		{
			(p1.age) = Integer.parseInt(tempVar10);
		}
		String tempVar11 = ConsoleInput.scanfRead();
		if (tempVar11 != null)
		{
			(p1.score) = Float.parseFloat(tempVar11);
		}
		String tempVar12 = ConsoleInput.scanfRead();
		if (tempVar12 != null)
		{
			p1.add = tempVar12.charAt(0);
		}
		p2 = p1;
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		print:
		result(head);
		return 0;
	}
	public static void result(stu x)
	{
		if (x.next == 0)
		{
			System.out.printf("%s ",x.num);
		System.out.printf("%s ",x.name);
		System.out.printf("%c",x.sex);
		System.out.printf(" %d",x.age);
		System.out.printf(" %g",x.score);
		System.out.printf(" %s",x.add);
		System.out.print("\n");
		}
		else
		{
		result(x.next);
		System.out.printf("%s ",x.num);
		System.out.printf("%s ",x.name);
		System.out.printf("%c",x.sex);
		System.out.printf(" %d",x.age);
		System.out.printf(" %g",x.score);
		System.out.printf(" %s",x.add);
		}
		System.out.print("\n");
	}

}

