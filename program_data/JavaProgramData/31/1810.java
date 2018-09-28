package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//	char a[100];
	//	struct student * next;
	//	};
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		p1.a = new Scanner(System.in).nextLine();
		p1.next = 0;
		while (strcmp(p1.a,"end"))
		{
			head = p1;
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p1.a = new Scanner(System.in).nextLine();
			p1.next = p2;
		}
		for (p1 = head;p1 != 0;p1 = p1.next)
		{
			System.out.printf("%s\n",p1.a);
		}
	}
}
