public class Student
{
	public String no = new String(new char[10]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String score = new String(new char[7]);
	public String add = new String(new char[15]);
	public Student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		Student[] p = tangible.Arrays.initializeWithDefaultStudentInstances(1000);
		Student head;
		int i;
		for (i = 0; ;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (Student)malloc(LEN);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p[i].no = tempVar.charAt(0);
			}

				if (strcmp(p[i].no,"end") == 0)
				{
					head = p[i - 1]; //head????
					break; //???end???
				}
				else
				{
				System.in.read();
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						p[i].name = tempVar2.charAt(0);
					}
					String tempVar3 = ConsoleInput.scanfRead(" ", 1);
					if (tempVar3 != null)
					{
						p[i].sex = tempVar3.charAt(0);
					}
					String tempVar4 = ConsoleInput.scanfRead(" ");
					if (tempVar4 != null)
					{
						p[i].age = Integer.parseInt(tempVar4);
					}
					String tempVar5 = ConsoleInput.scanfRead(" ");
					if (tempVar5 != null)
					{
						p[i].score = tempVar5.charAt(0);
					}
					String tempVar6 = ConsoleInput.scanfRead(" ");
					if (tempVar6 != null)
					{
						p[i].add = tempVar6.charAt(0);
					}
				System.in.read();
					if (i == 0)
					{
						p[i].next = null; //????????????????????
					}
					else
					{
						p[i].next = p[i - 1]; //????????????????
					}
				}

		}
		for (head = head;head != null;head = head.next)
		{
			System.out.printf("%s %s %c %d %s %s\n",head.no,head.name,head.sex,head.age,head.score,head.add);
		}
		return 0;
	}

}

