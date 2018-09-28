package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char s[500];
	//		struct student *next;
	//	}
	//	stu[2000],stup[2000];
		int i = 0;
		int j;
		student p1;
		student p2;
		student head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		head = null;
		p1.s = new Scanner(System.in).nextLine();
		while ((*(p1.s) + 0) != 'e')
		{
			stu[i] = p1;
			if (++i == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p1.s = new Scanner(System.in).nextLine();
		}
		p2.next = null;
		for (j = 0;j < i;j++)
		{
			stup[j] = stu[i - 1 - j];
		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%s\n",stup[j].s);
		}
		return 0;
	}
}
