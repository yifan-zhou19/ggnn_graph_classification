public class student
{
	public String id = new String(new char[20]);
	public int chinese;
	public int math;
	public int score;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static student create(int m)
	{
		student head;
		student p1;
		student p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(length);

		head = null_Renamed;
		while (n < m)
		{
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
			n = n + 1;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(length);

		}
		p2.next = null_Renamed;
		return head;
	}

	public static void plus(student head)
	{
		student p;
		student q;
		p = head;
		if (head != null_Renamed)
		{
			do
			{
				p.score = p.chinese + p.math;

				p = p.next;

			} while (p != null_Renamed);

		}
	}

	public static void pri_top3(student head)
	{
		student p;
		student q;
		student p1;
		student p2;
		student p3;
		p1 = p2 = p3 = head;
		p = head.next;
		while (p != null_Renamed)
		{
			if (p.score > p1.score)
			{
				p3 = p2;
				p2 = p1;
				p1 = p;
			}
			else if ((p.score <= p1.score) && (p.score> p2.score))
			{
				p3 = p2;
				p2 = p;
			}
			else if ((p.score <= p2.score) && (p.score> p3.score))
			{
				p3 = p;
			}

			p = p.next;

		}
		System.out.printf("%s %d\n",p1.id,p1.score);
		System.out.printf("%s %d\n",p2.id,p2.score);
		System.out.printf("%s %d\n",p3.id,p3.score);
	}

	public static void Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		student p = create(m);
		plus(p);
		pri_top3(p);
	}



}

