public class student
{

/*char id[20];
	
char name[10];
	
char sex;
	
int age;
	
int score;
	
char addr[20];*/
	public String s = new String(new char[100]);

public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{

	student head;

	student p1;
	student p2;

	n = 0;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = p2 = (student)malloc(LEN);

	//scanf("%s",p1->id);
	p1.s = new Scanner(System.in).nextLine();

	/*while(p1->s!="end")*/
	while (strcmp(p1.s,"end") != 0)

	{
	//printf(p1->s);	
	//scanf("%s %c %d %d %s",p1->name,&p1->sex,&p1->age,&p1->score,p1->addr);

	n++;


	if (n == 1)
	{
		p1.next = null;
	}


	else
	{
		p1.next = p2;
	}


	p2 = p1;


//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (student)malloc(LEN);


	//scanf("%s",p1->id);
	p1.s = new Scanner(System.in).nextLine();

	}
	//printf(p1->s);	
	head = p2;
		//printf(p2->s);

	return (head);
	}
	public static void print(student head)
	{

	student p;

	p = head;
	//printf(p->s);

	if (head != null)
	{


	do


	{



	//printf("%s %s %c %d %d %s",p->id,p->name,p->sex,p->age,p->score,p->addr);
		if (p.next != null)
		{
			System.out.print(p.s);
			System.out.print("\n");
		}
		else
		{
			System.out.print(p.s);
		}



	p = p.next;


	}while (p != null);
	}
	}
	public static void Main()
	{

	student head;

	head = creat();

	print(head);
	}

}
