public class student
{
	public String a = new String(new char[1000]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = head = (student)malloc(LEN);
	//	scanf("%s %s %c %d %d %s",p1->num,p1->name,&p1->sex,&p1->age,
	//			&p1->score,p1->addr);
		p1.next = null;
		p1.a = new Scanner(System.in).nextLine();
		while (strcmp(p1.a,"end"))
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p2 = (student)malloc(LEN);
			p2.next = p1;
			p1 = p2;
			p1.a = new Scanner(System.in).nextLine();
		}
		while (p1.next != null)
		{
			p1 = p1.next;
			System.out.printf("%s\n",p1.a);
		}
	}
}
