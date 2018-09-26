public class student
{
		public String name = new String(new char[100]);
		public String ind = new String(new char[100]);
		public char sex;
		public int age;
		public float score;
		public String dizhi = new String(new char[100]);
		public student next;
} //?? ?? ?? ?? ?? ??

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		student p1;
		student p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.ind = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			p1.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p1.score = Float.parseFloat(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.dizhi = tempVar6.charAt(0);
		}
		p1.next = null;
		while (strcmp(p2.ind,"end") != 0)
		{
			n++;
			if (n == 1)
			{
				String tempVar7 = ConsoleInput.scanfRead();
				if (tempVar7 != null)
				{
					p2.ind = tempVar7.charAt(0);
				}
				String tempVar8 = ConsoleInput.scanfRead(" ");
				if (tempVar8 != null)
				{
					p2.name = tempVar8.charAt(0);
				}
				String tempVar9 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar9 != null)
				{
					p2.sex = tempVar9.charAt(0);
				}
				String tempVar10 = ConsoleInput.scanfRead(" ");
				if (tempVar10 != null)
				{
					p2.age = Integer.parseInt(tempVar10);
				}
				String tempVar11 = ConsoleInput.scanfRead(" ");
				if (tempVar11 != null)
				{
					p2.score = Float.parseFloat(tempVar11);
				}
				String tempVar12 = ConsoleInput.scanfRead(" ");
				if (tempVar12 != null)
				{
					p2.dizhi = tempVar12.charAt(0);
				}
			}
			else
			{
				String tempVar13 = ConsoleInput.scanfRead();
				if (tempVar13 != null)
				{
					p2.name = tempVar13.charAt(0);
				}
				String tempVar14 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar14 != null)
				{
					p2.sex = tempVar14.charAt(0);
				}
				String tempVar15 = ConsoleInput.scanfRead(" ");
				if (tempVar15 != null)
				{
					p2.age = Integer.parseInt(tempVar15);
				}
				String tempVar16 = ConsoleInput.scanfRead(" ");
				if (tempVar16 != null)
				{
					p2.score = Float.parseFloat(tempVar16);
				}
				String tempVar17 = ConsoleInput.scanfRead(" ");
				if (tempVar17 != null)
				{
					p2.dizhi = tempVar17.charAt(0);
				}
			}
			p2.next = p1;
			p1 = p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p2 = (student)malloc(LEN);
			String tempVar18 = ConsoleInput.scanfRead();
			if (tempVar18 != null)
			{
				p2.ind = tempVar18.charAt(0);
			}

		}
		return p1;
	}
	public static void Main()
	{
		student wr;
		wr = creat();
		System.out.printf("%s %s %c %d %g %s\n",wr.ind,wr.name,wr.sex,wr.age,wr.score,wr.dizhi);
		   //printf("10630018 zouan m 20 10 28#46000\n");
		while (wr.next != 0)
		{
					wr = wr.next;
			System.out.printf("%s %s %c %d %g %s\n",wr.ind,wr.name,wr.sex,wr.age,wr.score,wr.dizhi);

		}

	}
}

