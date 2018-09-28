public class student
{
	public String num = new String(new char[100]);
	public String name = new String(new char[100]);
	public String gender = new String(new char[2]);
	public String age = new String(new char[100]);
	public String score = new String(new char[100]);
	public String add = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		student head;
		student p1;
		head = null;
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			p1.next = head;
			if (strcmp(p1.num,"end") == 0)
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.gender = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.age = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.add = tempVar6.charAt(0);
			}
			head = p1;
		}
		return (head);
	}
	public static void print(student head)
	{
		student p;
		p = head;
		while (p != null)
		{
			System.out.printf("%s %s %s %s %s %s\n",p.num,p.name,p.gender,p.age,p.score,p.add);
			p = p.next;
		}
	}
	public static void Main()
	{
		student po;
		po = creat();
		print(po);
	}







	/*?????????????????????????????????????? 
	
	 
	???? 
	????????????????????? 
	00630018 zhouyan m 20 10.0 28#460 
	
	??????"end"??
	 
	???? 
	???????? 
	
	?? ?? ?? ?? ?? ?? 
	
	???????
	 
	???? 
	00630018 zhouyan m 20 10 28#4600
	0063001 zhouyn f 21 100 28#460000
	0063008 zhoyan f 20 1000 28#460000
	0063018 zhouan m 21 10000 28#4600000
	00613018 zhuyan m 20 100 28#4600
	00160018 zouyan f 21 100 28#4600
	01030018 houyan m 20 10 28#4600
	0630018 zuyan m 21 100 28#4600
	10630018 zouan m 20 10 28#46000
	end
	
	 
	???? 
	10630018 zouan m 20 10 28#46000
	0630018 zuyan m 21 100 28#4600
	01030018 houyan m 20 10 28#4600
	00160018 zouyan f 21 100 28#4600
	00613018 zhuyan m 20 100 28#4600
	0063018 zhouan m 21 10000 28#4600000
	0063008 zhoyan f 20 1000 28#460000
	0063001 zhouyn f 21 100 28#460000
	00630018 zhouyan m 20 10 28#4600*/



}

