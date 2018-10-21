public class RAT
{
	public int weight;
	public String color = new String(new char[10]);
	public RAT next;
}

package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int Main()
	{

		void sort(struct RAT * p);
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}

		RAT head;
		RAT p1;
		RAT p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (RAT)malloc(Len);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.color = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.weight = Integer.parseInt(tempVar3);
		}
		p1.next = null;
		head = p1;
		p2 = p1;

		for (i = 1;i < N;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (RAT)malloc(Len);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.color = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.weight = Integer.parseInt(tempVar5);
			}
			p1.next = null;
			p2.next = p1;
			p2 = p1;
		}
		sort(head);
		for (p1 = head;p1 != null;p1 = p1.next)
		{
			System.out.printf("%s\n",p1.color);
		}

		return 0;
	}

	public static void sort(RAT p)
	{
		int j;
		int i;
		RAT pt;
		RAT temp = new RAT();
		for (j = 0;j < N;j++)
		{
			for (pt = p,i = 0;i < N - j - 1;pt = pt.next,i++)
			{
				if ((pt.weight < 60 && pt.next.weight >= 60) || (pt.weight >= 60 && pt.next.weight >= 60 && pt.weight < pt.next.weight))
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=*pt;
					temp.copyFrom(pt);
					pt.weight = pt.next.weight;
					pt.color = pt.next.color;
					pt.next.weight = temp.weight;
					pt.next.color = temp.color;
				}
			}
		}
	}
}

