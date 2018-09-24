public class student
{
	public int id;
	public int yu;
	public int shu;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j = 0;


		student head;
		student p1;
		student p2;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p1 = p2 = (student)malloc(LEN);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.yu = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.shu = Integer.parseInt(tempVar4);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		p1 = head;
		for (i = 200;i > 10;i--)
		{
			p1 = head;
			while (p1 != null)
			{
				if ((p1.yu + p1.shu) == i)
				{
					System.out.printf("%d %d\n",p1.id,i);
					j++;

				}
				p1 = p1.next;
				if (j == 3)
				{
					break;
				}
			}
			if (j == 3)
			{
				break;
			}
		}
	}
}

