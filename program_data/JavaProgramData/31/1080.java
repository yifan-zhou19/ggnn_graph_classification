public class Student
{
	public Student prev;
	public String number = new String(new char[30]);
	public String name = new String(new char[30]);
	public char gender;
	public int age;
	public double score;
	public String address = new String(new char[30]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		Student a = new Student();
		Student p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a.number = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			a.gender = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			a.score = Double.parseDouble(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			a.address = tempVar6.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (Student)malloc(LEN);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: *p=a;
		p.copyFrom(a);
		p.prev = null;
		for (;1;)
		{
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a.number = tempVar7.charAt(0);
			}
			if (a.number.charAt(0) == 'e')
			{
				break;
			}
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				a.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar9 != null)
			{
				a.gender = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead();
			if (tempVar10 != null)
			{
				a.age = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead();
			if (tempVar11 != null)
			{
				a.score = Double.parseDouble(tempVar11);
			}
			String tempVar12 = ConsoleInput.scanfRead();
			if (tempVar12 != null)
			{
				a.address = tempVar12.charAt(0);
			}
			a.prev = p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (Student)malloc(LEN);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: *p=a;
			p.copyFrom(a);
		}
		System.out.printf("%s %s %c %d %g %s\n",p.number,p.name,p.gender,p.age,p.score,p.address);
		for (;p.prev != null;)
		{
			p = p.prev;
			System.out.printf("%s %s %c %d %g %s\n",p.number,p.name,p.gender,p.age,p.score,p.address);
		}
		return 0;
	}

}

