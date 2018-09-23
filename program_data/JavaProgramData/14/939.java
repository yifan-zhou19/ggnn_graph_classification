public class student
{
	public String id = new String(new char[20]);
  public int chinese;
  public int math;
  public int sum;
  public int flag;
  public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int max = 0;
	public static student h;
	public static int n;
	public static int i;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.id = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.chinese = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.math = Integer.parseInt(tempVar3);
		}
		p1.sum = p1.chinese + p1.math;
		p1.flag = 0;
		head = null;
		while (i < n)
		{
			i = i + 1;
			if (i == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.id = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.chinese = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.math = Integer.parseInt(tempVar6);
			}
			p1.sum = p1.chinese + p1.math;
			p1.flag = 0;
		}
		p2.next = null;
		return (head);
	}
	public static student compare()
	{
		student p1;
		student p3;
		p1 = h;
		max = p1.sum;
		do
		{
			if (p1.sum > max && (p1.flag == 0))
			{
				max = p1.sum;
			}
			p1 = p1.next;
		}while (p1.next != null);
		p1 = h;
		do
		{
			if (p1.sum == max && (p1.flag == 0))
			{
				p3 = p1;
				p1.flag = 1;
				break;
			}
			p1 = p1.next;
		}while (p1.next != null);
		return (p3);

	}
	public static void Main()
	{
		int j;
		student p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		h = creat();
		for (j = 1;j <= 3;j++)
		{
			p = compare();
			System.out.printf("%s %d\n",p.id,p.sum);
		}
	}
}

