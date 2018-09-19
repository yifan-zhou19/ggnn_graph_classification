public class Student
{
	public int number;
	public int math;
	public int chinese;
	public int total;
	public Student next;


}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int n;
		int max;

		Student linkHead;
		Student linkTail;
		Student student;
		Student ppre;
		Student pmax;
		Student premax;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		linkHead = linkTail = null;
		//????????????
	while (i < n)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		student = (Student)malloc(Len);

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			student.number = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			student.math = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			student.chinese = Integer.parseInt(tempVar4);
		}

		student.total = student.math + student.chinese;

		student.next = null;
		if (linkTail == null)
		{
		//????????????
		linkHead = linkTail = student;
		}
		else
		{

		//?????????????????????
		linkTail.next = student;
		linkTail = student;

		}

		i++;

	}

	i = 0;

	while (i < 3)
	{
	student = linkHead;
	ppre = student;

	max = 0;
	pmax = linkHead;
	premax = linkHead;



	while (student != null)
	{

		if (student.total > max)
		{
			max = student.total;
			pmax = student;
			premax = ppre;
		}
		ppre = student;
		student = student.next;

	}

		System.out.printf("%d %d\n", pmax.number, pmax.total);


		if (pmax == linkHead) //????????????
		{
				linkHead = student.next;
		}
		else
		{
			premax.next = pmax.next; //???i??????????????i?????????????????????????????????????????flag?????????????????
		}


		i++;



	}



	}
}

