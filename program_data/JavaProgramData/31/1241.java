package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char imfor[100];
	//	};

		int n = 1;
		int m;
		student p1;
		student[] p3 = tangible.Arrays.initializeWithDefaultstudentInstances(600);
		p1 = p3[0] = new student();
		p1.imfor = new Scanner(System.in).nextLine();
		while (p1.imfor[0] != 'e')
		{
			p1 = new student();
			p3[n] = p1;
			n++;
			p1.imfor = new Scanner(System.in).nextLine();
		}
		for (m = n - 2;m >= 0;m--)
		{
			System.out.printf("%s\n",p3[m].imfor);
		}
	}
}

