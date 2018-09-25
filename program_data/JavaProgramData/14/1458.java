package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int j;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int yuwen;
	//		int shuxue;
	//		struct student * next;
	//	};
		student head;
		student ppre;
		student p0;
		student p3;
		student p1;
		student p2;
		head = p1 = p2 = new student();
		for (i = 0;i < n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 p1.num = tempVar2;
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 p1.yuwen = tempVar3;
			 }
			 String tempVar4 = ConsoleInput.scanfRead(" ");
			 if (tempVar4 != null)
			 {
				 p1.shuxue = tempVar4;
			 }
			p1 = new student();
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null; //????

		for (j = 0;j < 3;j++)
		{
			ppre = p1 = head;
			max = p1.yuwen + p1.shuxue;
			p1 = p1.next;
		for (i = 0;i < n - j;i++)
		{
			   if ((p1.yuwen + p1.shuxue) > max)
			   {
				   max = p1.yuwen + p1.shuxue;
				   p0 = p1;
				   p3 = ppre;
			   }
			   ppre = p1;
			   p1 = p1.next;
		}
		System.out.printf("%d %d\n",p0.num,max);
			 p3.next = p0.next;
		}
	}

}

