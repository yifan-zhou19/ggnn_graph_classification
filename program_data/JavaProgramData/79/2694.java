public class monkey //???????????????????
{
	public int num;
	public monkey next;
}

package <missing>;

public class GlobalMembers
{
	public static int j;
	public static monkey create(int c) //????create???????????????
	{
		monkey head; //??????monkey?????head?p1?p2
		monkey p1;
		monkey p2;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (monkey)malloc(LEN); //(struct monkey*)malloc(LEN)???????p1?p2
		head = p1; //p1?????head
		head.num = 1; //?1???head??num
		for (i = 1,p1.num = 1;i < c;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (monkey)malloc(LEN);
			p1.num = i + 1; //???????
			p2.next = p1; //????????
			p2 = p1;
		}
		p2.next = head;
		return head; //??head?num=1?next???????
	}
	public static monkey findout(monkey start, int d) //????findout?????????monkey
	{
		int i;
		monkey p;
		p = start;
		for (i = 1;i < d - 1;i++)
		{
			p = p.next; //?start???????????????d-2??
		}
		return p; //????????????
	}
	public static monkey letout(monkey last)
	{
		monkey out;
		monkey next;
		out = last.next;
		last.next = out.next; //????????????????????
		next = out.next;
		out = null;
		return next;
	}
	public static int Main()
	{
		int[] n = new int[301];
		int[] m = new int[300];
		int k = 0;
		int c;
		int d;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[k] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[k] = Integer.parseInt(tempVar2);
			}
			k++;
			if (n[k - 1] == 0 && m[k - 1] == 0)
			{
				break;
			}
		}
		for (j = 0;j < k - 1;j++) //???j+1???
		{
			int i;
			int king;
			monkey p1;
			monkey p2;
			if (n[j] == 1)
			{
				king = n[j];
			}
			else if (m[j] == 1)
			{
				king = n[j];
			}
			else
			{
				c = n[j];
				p1 = p2 = create(c);
				for (i = 1;i < c;i++) //??????
				{
					d = m[j];
					p2 = findout(p1, d);
					p1 = p2;
					p2 = letout(p1); //p1?????last?p2????????????
					p1 = p2;
				}
				king = p2.num; //p2????num???king
				p2 = null;
			}
			System.out.printf("%d\n",king);
		}
	return 0;
	}



}

