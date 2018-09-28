package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char num[100];
	//		char name[100];
	//		char sex;
	//		int age;
	//		char score[100];
	//		char address[100];
	//		struct student *next;
	//	}
	//	a[10000],*head,*p;
		int n;
		for (i = 0;i < 10000;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i].num = tempVar;
			}
			if (a[i].num[0] == 'e')
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				a[i].sex = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].age = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				a[i].score = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				a[i].address = tempVar6;
			}
		}
		i = i - 1;
		head = &a[i];
		for (n = i;n > 0;n--)
		{
			a[n].next = &a[n - 1];
		}
		a[0].next = null;
		p = head;
		do
		{
			System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.address);
			p = p.next;
		}while (p != null);
		return 0;
	}
}

