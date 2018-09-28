//
//  main.c
//  Track 82,????????????
//
//  Created by Charles.thRay.Lee on 2/1/13.
//  Copyright (c) 2013 Peking University. All rights reserved.
/*
 ??
 ???????????????????????????????????????
 ????
 ?????????????????????
 00630018 zhouyan m 20 10.0 28#460
 
 ??????"end"??
 ????
 ??????????
 ?????????
 
 ?? ?? ?? ?? ?? ??
 
 ?????
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
 
 00630018 zhouyan m 20 10 28#4600
*/


public class Student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char gender;
	public int age;
	public String score = new String(new char[10]);
	public String address = new String(new char[20]);
	public Student next;
	public Student upper;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static Student creat()
	{
		Student head;
		Student end;
		Student p1;
		Student p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (Student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
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
			p1.address = tempVar6.charAt(0);
		}
		head = null;

		while (p1.num.charAt(0) != 'e')
		{
			n = n + 1;
			if (n == 1)
			{
				head = p1;
				p1.upper = null;
			}
			else
			{
				p2.next = p1;
				p1.upper = p2;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (Student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.num = tempVar7.charAt(0);
			}
			if (p1.num.charAt(0) == 'e')
			{
				end = p2;
				break;
			}
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar9 != null)
			{
				p1.gender = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p1.age = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				p1.score = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.address = tempVar12.charAt(0);
			}
		}
		p2.next = null;
		return (end);
	}

	public static int Main()
	{
		Student pt;
		pt = creat();
			do
			{
				System.out.printf("%s %s %c %d %s %s\n",pt.num,pt.name,pt.gender,pt.age,pt.score,pt.address);
				pt = pt.upper;
			} while (pt != null);
		return 0;
	}
}

