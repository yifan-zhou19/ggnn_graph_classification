public class monkey
{
	public int num;
	public monkey next;
}

package <missing>;

public class GlobalMembers
{
	public static int monkeyking(int n, int m, monkey temp)
	{
		int i;
		while (temp.next != temp)
		{
			if (m == 1)
			{
				return (n);
			}
			for (i = 0;i < m - 2;i++)
			{
				temp = temp.next;
			}
			temp.next = (temp.next).next;
			temp = temp.next;
		}
		return (temp.num);
	}

	public static void Main()
	{
		monkey temp = null;
		monkey pt = null;
		monkey head = null;
		int i;
		int m = 1;
		int n = 1;
		while (m != 0 && n != 0)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				pt = new monkey();
				if (i == 0)
				{
					head = pt;
					temp = pt;
				}
				else
				{
					temp.next = pt;
					temp = pt;
				}
				pt.num = i + 1;
			}
			pt.next = head;
			System.out.printf("%d\n",monkeyking(n, m, head));
		}
	}
}

