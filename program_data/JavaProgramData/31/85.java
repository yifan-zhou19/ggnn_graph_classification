///#define NULL 0
public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public String score = new String(new char[10]);
	public String adress = new String(new char[20]);
//	struct student *next;
	public student before;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		int n;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
	//	scanf("%s %s %c %d %d %s",p1->num,p1->name,&p1->sex,&p1->age,&p1->score,p1->adress);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		head = null;
		while (strcmp(p1.num,"end") != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p1.sex = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.adress = tempVar6.charAt(0);
			}
			n++;
			if (n == 1)
			{
	//			head=p1;
				p1.before = null;
			}
			else
			{
				p1.before = p2;
				head = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
	/*		if(strcmp(p1->num,"end")==0)
				break;
			else
				scanf(" %s %c %d %d %s",p1->name,&p1->sex,&p1->age,&p1->score,p1->adress);*/
		}
	//	head=p2;
		return (head);
	}


	public static void Main()
	{
		student head;
		student q1;
		head = creat();
		q1 = head;
		if (head != null)
		{
			while (q1 != null)
			{
			System.out.printf("%s %s %c %d %s %s\n",q1.num,q1.name,q1.sex,q1.age,q1.score,q1.adress);
			q1 = q1.before;
			}
	   //     printf("%s %s %c %d %d %s\n",q1->num,q1->name,q1->sex,q1->age,q1->score,q1->adress);
		}

	}
}

