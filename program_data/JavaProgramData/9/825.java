public class patient
{
	public String num = new String(new char[10]);
	public int age;
	public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static patient creat()
	{
		patient head;
		patient p1;
		patient p2;
		int num = 1;
		head = null;
		while (num <= n)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (patient)malloc(LEN);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.age = Integer.parseInt(tempVar2);
			}
			if (num == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			num++;
		}
		p2.next = null;
		return (head);
	}
	public static int Main()
	{
		patient pt;
		patient p;
		patient pre;
		int i;
		int max;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		pt = creat();
		for (p = pt;p != null;p = p.next)
		{
			if (p.age >= 60)
			{
				num++;
			}
		}
		for (i = 1;i <= num;i++)
		{
			max = 59;
			for (p = pt;p != null;p = p.next)
			{
				if (max < p.age)
				{
					max = p.age;
				}
			}
			for (p = pre = pt;p != null;p = p.next)
			{
				if (p.age != max)
				{
					pre = p;
				}
				else
				{
					break;
				}
			}
			System.out.printf("%s\n",p.num);
			if (p == pt)
			{
				pt = p.next;
			}
			else
			{
				pre.next = p.next;
			}
		}
		for (p = pt;p != null;p = p.next)
		{
			System.out.printf("%s\n",p.num);
		}
		return 0;
	}
}

