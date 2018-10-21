public class student //??student?????????????????????????
{
	public String num = new String(new char[40]);
	public int age;
	public String score = new String(new char[20]);
	public String name = new String(new char[40]);
	public char gender;
	public String addr = new String(new char[40]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student p1; //???p1,p2?????????????
	public static student p2;
	public static int n;
	public static student creat()
	{
		student head;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN); //???????
		head = null; //?????NULL
		String tmp = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			tmp = tempVar.charAt(0);
		}
		while (strcmp(tmp,"end") != 0) //?????????????end
		{
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p1.gender = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.addr = tempVar6.charAt(0);
			}
			p1.num = tmp;
					n = n + 1;
			if (n == 1) //????????????
			{
				head = p1;
			}
			else
			{
				p2.next = p1; //???????????????next???????????
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN); //???????
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				tmp = tempVar7.charAt(0);
			}


		}
		p2.next = null; //?????????
		return (head); //????????????
	}
	public static student backward(student head)
	{
		student new_head; //????????????
		p1 = head;
		p2 = null;
		while (p1.next != null) //????????????
		{
			p2 = p1;
			p1 = p1.next;
		}
		new_head = p1; //??????
		p1.next = p2; //???????next???????
		p2.next = null; //???????next??NULL
		while (head.next != null) //??????next?NULL????
		{
			p1 = head;
			p2 = null;
			while (p1.next != null) //?????????????next????????????????next??NULL
			{
				p2 = p1;
				p1 = p1.next;
			}
			p1.next = p2;
			p2.next = null;
		}
		return (new_head); //?????????
	}
	public static void output(student outhead)
	{
		for (p1 = outhead;p1 != null;p1 = p1.next) //????????????????????
		{
			System.out.printf("%s %s %c %d %s %s\n",p1.num,p1.name,p1.gender,p1.age,p1.score,p1.addr);
		}
	}
	public static void free(student head)
	{
		for (p1 = head;p1 != null;p1 = p1.next)
		{
			p1 = null;
		}
	}
	public static int Main()
	{
		student head;
		head = creat(); //?????????
		head = backward(head); //???????
			  output(head); //??????
		head = null; //??????????
		return 0;
	}







}

