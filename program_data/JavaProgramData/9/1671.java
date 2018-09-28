package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct pa
	//	{
	//			char ID[11];
	//			int age;
	//			struct pa *next;
	//	}
	//	*head,*p1,*p2,*p3,*p4;
		int tage;
		String tID = new String(new char[11]);
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						p1 = new pa();
						if (i == 0)
						{
						head = p1;
						}
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							p1.ID = tempVar2;
						}
						String tempVar3 = ConsoleInput.scanfRead(" ");
						if (tempVar3 != null)
						{
							p1.age = tempVar3;
						}
						if (i != 0)
						{
						p2.next = p1;
						}
						p2 = p1;
		}
		p1.next = null;
		p1 = head;
		p2 = p1.next;
		for (i = 0;i < n;i++) //??
		{
						p3 = p1;
						p4 = p2;
						for (j = 0;j < n - 1;j++)
						{
								  if (p3.age < p4.age && p4.age >= 60)
								  {
													 tID = p3.ID;
													 tage = p3.age;
													 p3.ID = p4.ID;
													 p3.age = p4.age;
													 p4.ID = tID;
													 p4.age = tage;
								  }
								  p3 = p3.next;
								  p4 = p4.next;
						}
		}
		p1 = head;
		while (p1 != null)
		{
					   System.out.printf("%s\n",p1.ID);
					   p1 = p1.next;
		}
		return 0;
	}
}

