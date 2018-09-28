public class student
{
	public int num;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int t;
		int a;
		int[] n = new int[301];
		int[] m = new int[301];
		int[] r = new int[300];
		student head;
		student p1;
		student p2;
		for (t = 0;;t++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[t] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[t] = Integer.parseInt(tempVar2);
			}
			if (n[t] == 0 && m[t] == 0)
			{
				break;
			}
		}
		for (i = 0;i < t;i++)
		{
			a = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = p2 = (student)malloc(LEN);
			p1.num = a;
			head = p1;
			while (a < n[i])
			{
				if (a == 1)
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
				p1.num = a + 1;
				a++;
			}
			p2.next = p1;
			p1.next = head;
			for (;n[i] > 1;n[i]--)
			{
				p1 = p2 = head;
				for (j = 1;j < m[i];j++)
				{
					p2 = p1;
					p1 = p1.next;
				}
				p2.next = p1.next;
				head = p1.next;
			}
			r[i] = head.num;
		}
		for (i = 0;i < t;i++)
		{
			System.out.printf("%d\n",r[i]);
		}
	}
}

