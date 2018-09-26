public class Student
{
	public String ALL = new String(new char[100]);
	public Student pNext;
	public Student pPrev;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		Student pRoot = new Student();
		Student pNow = pRoot;
		pRoot.pPrev = null;
		for (;;)
		{
			pNow.ALL = new Scanner(System.in).nextLine();
			if (strcmp("end",pNow.ALL))
			{
				pNow.pNext = new Student();
				pNow.pNext.pPrev = pNow;
				pNow = pNow.pNext;
			}
			else
			{
				break;
			}
		}
		pNow = pNow.pPrev;
		for (;;)
		{
			System.out.println(pNow.ALL);
			if (pNow.pPrev == null)
			{
				break;
			}
			pNow = pNow.pPrev;
		}
		return 0;
	}
}
