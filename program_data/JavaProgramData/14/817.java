public class student
{
		public String number = new String(new char[20]);
		public int chinese;
		public int math;
		public int sum;
		public student next;
}

package <missing>;

public class GlobalMembers
{
		public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		public static student s1;
		public static student s2;
		public static student s3;

	public static int n;
	public static int max1 = 0;
	public static int max2 = 0;
	public static int max3 = 0;


	public static student creat()
	{
		int i;
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.number = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.chinese = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.math = Integer.parseInt(tempVar3);
			}
			p2 = p1;
			p1.sum = p1.chinese + p1.math;
			if (p1.sum > max1)
			{
				max3 = max2;
				s3 = s2;
				max2 = max1;
				s2 = s1;
				max1 = p1.sum;
				s1 = p1;
			}
			else if (p1.sum > max2)
			{
				max3 = max2;
				s3 = s2;
				max2 = p1.sum;
				s2 = p1;
			}
			else if (p1.sum > max3)
			{
				max3 = p1.sum;
				s3 = p1;
			}
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
		}
		p1 = null;
		return (head);
	}

	public static void Main()
	{
		student p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = creat();
		System.out.printf("%s %d\n",s1.number,s1.sum);
		System.out.printf("%s %d\n",s2.number,s2.sum);
		System.out.printf("%s %d",s3.number,s3.sum);
	}

}

