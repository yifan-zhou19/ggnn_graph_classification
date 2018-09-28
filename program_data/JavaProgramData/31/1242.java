package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char imfor[100];
	//		struct student *early;
	//	};

		int m;
		student p1;
		student p2;
		student last;
		student p;
		p1 = p2 = new student();
		p1.imfor = new Scanner(System.in).nextLine();
		p1.early = 0;
		for (m = 1;m < 1000;m++)
		{
			p1 = new student();
			p1.early = p2;
			p2 = p1;
			p1.imfor = new Scanner(System.in).nextLine();
			if (p1.imfor[0] == 'e')
			{
				last = p1.early;
				break;
			}

		}
		p = last;
		for (m = 1;m < 1000;m++)
		{
			System.out.printf("%s\n",p.imfor);
			p = p.early;
			if (p == 0)
			{
				break;
			}
		}
	}
}
