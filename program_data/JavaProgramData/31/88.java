public class student
{
		public String num = new String(new char[10]);
		public String name = new String(new char[30]);
		public char sex;
		public int age;
		public String score = new String(new char[10]);
		public String address = new String(new char[20]);
		public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student head;
		student p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (student)malloc(Len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			head.num = tempVar.charAt(0);
		}
			if (strcmp(head.num,"end") == 0)
			{
				head = null;
			}
				else
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						head.name = tempVar2.charAt(0);
					}
					String tempVar3 = ConsoleInput.scanfRead(" ", 1);
					if (tempVar3 != null)
					{
						head.sex = tempVar3.charAt(0);
					}
					String tempVar4 = ConsoleInput.scanfRead(" ");
					if (tempVar4 != null)
					{
						head.age = Integer.parseInt(tempVar4);
					}
					String tempVar5 = ConsoleInput.scanfRead(" ");
					if (tempVar5 != null)
					{
						head.score = tempVar5.charAt(0);
					}
					String tempVar6 = ConsoleInput.scanfRead(" ");
					if (tempVar6 != null)
					{
						head.address = tempVar6.charAt(0);
					}
				}
		head.next = null;
		while (true)
		{
			p = head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			head = (student)malloc(Len);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				head.num = tempVar7.charAt(0);
			}
				if (strcmp(head.num,"end") == 0)
				{
					head = p;
					break;
				}
				else
				{
					String tempVar8 = ConsoleInput.scanfRead();
					if (tempVar8 != null)
					{
						head.name = tempVar8.charAt(0);
					}
					String tempVar9 = ConsoleInput.scanfRead(" ", 1);
					if (tempVar9 != null)
					{
						head.sex = tempVar9.charAt(0);
					}
					String tempVar10 = ConsoleInput.scanfRead(" ");
					if (tempVar10 != null)
					{
						head.age = Integer.parseInt(tempVar10);
					}
					String tempVar11 = ConsoleInput.scanfRead(" ");
					if (tempVar11 != null)
					{
						head.score = tempVar11.charAt(0);
					}
					String tempVar12 = ConsoleInput.scanfRead(" ");
					if (tempVar12 != null)
					{
						head.address = tempVar12.charAt(0);
					}
				}
			head.next = p;
		}
		return head;
	}
	public static void print(student head)
	{
		student q;
	q = head;
	while (q != null)
	{
		System.out.printf("%s %s %c %d %s %s\n",q.num,q.name,q.sex,q.age,q.score,q.address);
	q = q.next;
	}
	}
	public static void Main()
	{
		print(creat());
	}
}

