public class Student
{
	public Student previous;
	public String no = new String(new char[20]);
	public String name = new String(new char[30]);
	public char sex;
	public int age;
	public float score;
	public String address = new String(new char[30]);
}

package <missing>;

public class GlobalMembers
{
	public static Student creat()
	{
		Student end;
		Student p1;
		Student p2;
		p1 = null;
		for (;;)
		{
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (Student)malloc(LEN);
			p1.previous = p2;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.no = tempVar.charAt(0);
			}
			if (strcmp(p1.no,"end") == 0)
			{
				break;
			}
			else
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p1.name = tempVar2.charAt(0);
				}
				System.in.read();
				p1.sex = System.in.read();
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p1.age = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					p1.score = Float.parseFloat(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					p1.address = tempVar5.charAt(0);
				}
			}
		}
		end = p2;
		return (end);
	}

	public static void print(Student end)
	{
		Student p;
		p = end;
		do
		{
			System.out.printf("%s %s %c %d %g %s\n",p.no,p.name,p.sex,p.age,p.score,p.address);
			p = p.previous;
		}while (p != null);
	}


	public static void Main()
	{
		Student end;
		end = creat();
		print(end);
	}
}

