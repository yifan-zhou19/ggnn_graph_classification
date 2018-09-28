package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//{
	//	char a[100];
	// struct student *next;
	//}
	//*p1,*p2,*head;
	int n = 0;
	p1 = p2 = new student();
	head = null;
	p1.a = new Scanner(System.in).nextLine();
	while (strcmp(p1.a,"end"))
	{
		n++;
	if (n == 1)
	{
	head = p1;
	}
	else
	{
	p2.next = p1;
	}
	p2 = p1;
	p1 = new student();
	p1.a = new Scanner(System.in).nextLine();
	}
	p2.next = null;
	for (;;)
	{
		for (p2 = head;;p2 = p2.next)
		{
		  p1 = p2.next;
		  if (p1.next == null)
		  {
			  System.out.printf("%s\n",p1.a);
			p2.next = null;
			break;
		  }
		}
	if (p2 == head)
	{
		System.out.printf("%s\n",head.a);
	break;
	}

	}



	}
}
