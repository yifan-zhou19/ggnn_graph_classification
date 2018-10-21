package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char a[100];
	//		struct student *back;
	//	};

		int n;
		student p1;
		student p2;
		student end;
		p1 = p2 = new student();
		p1.a = new Scanner(System.in).nextLine();
		p1.back = 0;
		for (n = 1;;n++)
		{
			p1 = new student();
			p1.back = p2;
			p2 = p1;
			p1.a = new Scanner(System.in).nextLine();
			if (p1.a[0] == 'e')
			{
				end = p1.back;
				break;
			}

		}
		student p;
		p = end;
		for (n = 1;;n++)
		{
			System.out.printf("%s\n",p.a);
			p = p.back;
			if (p == 0)
			{
				break;
			}
		}
		return 0;
	}
}
