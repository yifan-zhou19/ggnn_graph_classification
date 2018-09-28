// 1209.cpp : Defines the entry point for the console application.
//

///#include "stdafx.h"
public class data
{
	public String num = new String(new char[200]);
	public String name = new String(new char[200]);
	public char sex;
	public String add = new String(new char[200]);
	public int age;
	public String score = new String(new char[200]);
	public data next;
}

package <missing>;

public class GlobalMembers
{
	public static data creat()
	{
		data head;
		data p1 = null;
		data p2 = null;
		int n = 0;
		do
		{
			p2 = p1;
			p1 = new data();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			if (*p1.num == 'e')
			{
				head = p2;
				p1 = null;
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				(p1.sex) = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(p1.age) = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.add = tempVar6.charAt(0);
			}

			if (n == 0)
			{
				p1.next = null;
			}
			if (n != 0)
			{
				p1.next = p2;
			}
			n = 1;
		} while (1 != 0);
		return head;
	}
	public static void print(data head)
	{
		data p;
		p = head;
		while (p != null)
		{
			System.out.printf("%s %s %c %d %s %s\n",p.num,p.name,p.sex,p.age,p.score,p.add);
			p = p.next;
		}
	}

	public static int Main()
	{
		data head;
		head = creat();
		print(head);
		return 0;
	}


}

