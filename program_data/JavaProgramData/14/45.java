public class student
{
	public int num;
	public int chinese;
	public int maths;
	public int sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int[] max = new int[3];
	public static int[] t = new int[3];
	public static student head;
	public static student p1;
	public static student p2;
	public static student creat(int n)
	{
		m = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.chinese = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.maths = Integer.parseInt(tempVar3);
		}
		p1.sum = p1.chinese + p1.maths;
		head = null;
		while (m < n - 1)
		{
			m = m + 1;
			if (m == 1)
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
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.chinese = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.maths = Integer.parseInt(tempVar6);
			}
			p1.sum = p1.chinese + p1.maths;
		}
		p2.next = p1;
		p2 = p1;
		p2.next = null;
		return (head);
	}
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		creat(n);

		student p1;
		p1 = head;
		 do
		 {
			if (p1.sum > max[0])
			{
				max[0] = p1.sum;
				t[0] = p1.num;
			}
			p1 = p1.next;
		 } while (p1 != null);
		System.out.printf("%d %d\n",t[0],max[0]);
		p1 = head;
		do
		{
			if (p1.sum > max[1] && p1.num != t[0])
			{
				max[1] = p1.sum;
				t[1] = p1.num;
			}
			p1 = p1.next;
		} while (p1 != null);
			System.out.printf("%d %d\n",t[1],max[1]);
		p1 = head;
		do
		{
			if (p1.sum > max[2] && p1.num != t[0] && p1.num != t[1])
			{
			max[2] = p1.sum;
			t[2] = p1.num;
			}
			p1 = p1.next;
		} while (p1 != null);
			System.out.printf("%d %d\n",t[2],max[2]);
	}



}

