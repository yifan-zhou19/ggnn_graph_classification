public class student
{
	public String num = new String(new char[20]);
	public int score;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static student creat(int numb)
	{
		student head; //?????
		student p1; //??????
		student p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN); /*????????(struct student *)?(void*)??malloc??????
		(struct student *)?*/
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.score = Integer.parseInt(tempVar2);
		}
		head = null;
		while (n < numb - 1) //??????
		{
			n = n + 1; //?????
			if (n == 1)
			{
				head = p1; //?????????p1???head
			}
			else
			{
				p2.next = p1; //???p1??p2
			}
			p2 = p1; //p2????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN); //????????
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.score = Integer.parseInt(tempVar4);
			}
		}
		p2.next = p1; //????????next??NULL
		p1.next = null;
		return (head); //?????
	}
	public static void print(student head)
	{
		student p; //??????
		student tempo;
		p = head; //??head??????
		if (head != null) //????????
		{
			do
			{
			tempo = p.next;
			System.out.printf("%s\n",p.num);
			p = tempo;
			}while (p != null); //?p?????????
		}
	}
	public static student maopao(student head)
	{
		student p0;
		student p1;
		student p2;
		student tem;
		int temp = 0;
		int i;
		int j;
		p0 = head;
		p1 = head;
		p2 = head;
		if (head == null)
		{
			return (head);
		}
		else if (p0.next == null)
		{
			return (head);
		}
		else if (p0.next != null)
		{
		for (i = 0;i < n;i = i + 1)
		{
			for (j = 0;j < n - 1;j = j + 1)
			{
				if (p1.score < p1.next.score && j != 0 && p1.next.score >= 60)
				{
					tem = p1.next;
					p2.next = p1.next;
					p1.next = tem.next;
					tem.next = p1;
					p2 = p2.next;
				}
	else if (p1.score < p1.next.score && j == 0 && p1.next.score >= 60)
	{
					tem = p1.next;
					p0 = tem;
					p2 = tem;
					p1.next = tem.next;
					tem.next = p1;
					p2 = p1;
					p1 = p1.next;
	}
				else
				{
					p2 = p1;
					p1 = p1.next;
				}
			}
			temp = temp + 1;
			p1 = p0;
			p2 = p0;
		}
		}
		return (p0);
	}
	public static int Main()
	{
		int n;
		char ch;
		student head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			ch = tempVar2.charAt(0);
		}
		head = creat(n);
		head = maopao(head);
		print(head);
		head = null;
	}
}

