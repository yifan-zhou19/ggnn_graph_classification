package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//{
	//	char stu[100];
	//	struct student *next;
	//	struct student *prev;
	//}
	//*head,*p1,*p2,*p;

		int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		p1.stu = new Scanner(System.in).nextLine();
		p1.prev = null;
		while (strcmp(p1.stu,"end") != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p1.prev = p2;
			p1.stu = new Scanner(System.in).nextLine();
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;

		p = p2;

			do
			{
				p = p.prev;
				System.out.printf("%s\n",p.stu);

			}while (p.prev != null);
	}

}
