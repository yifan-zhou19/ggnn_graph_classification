public class Student
{
	public String id = new String(new char[100]);
	public String name = new String(new char[300]);
	public int age;
	public char sex;
	public String score = new String(new char[100]);
	public String address = new String(new char[300]);
	public Student before;
}

package <missing>;

public class GlobalMembers
{
	public static Student[] s = tangible.Arrays.initializeWithDefaultStudentInstances(2500);

	public static int Main()
	{
		Student p;
		Student q;
		Student head;
		int i = 0;
		int j;
		int k;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s[0].id = tempVar.charAt(0);
		}
		p = s[0];
		q = null;
		while (p != null)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p.address = tempVar6.charAt(0);
			}
			p.before = q;
			q = p;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				s[i + 1].id = tempVar7.charAt(0);
			}
			if (strcmp(s[i + 1].id,"end") == 0)
			{
				p = null;
				head = q;
			}
			else
			{
			p = s[i + 1];
			i++;
			}
		}
		p = head;
		q = null;
		while (p != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.id,p.name,p.sex,p.age,p.score,p.address);
			p = p.before;
		}

	}
}

