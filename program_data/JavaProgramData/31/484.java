public class student
	{
		public String number = new String(new char[10]);
		public String name = new String(new char[100]);
		public char sex;
		public int age;
		public String score = new String(new char[20]);
		public String add = new String(new char[20]);
		public student pre;
	}

package <missing>;

public class GlobalMembers
{
	public static int n;

		public static student creat()
		{
			student tail;
			student p1;
			student p2;
			n = 0;
			p1 = p2 = new student();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.number = tempVar.charAt(0);
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
				p1.score = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.add = tempVar6.charAt(0);
			}
			p1.pre = null;
			while (true)
			{
				n++;
				tail = p1;
				p1 = new student();
				String tempVar7 = ConsoleInput.scanfRead();
				if (tempVar7 != null)
				{
					p1.number = tempVar7.charAt(0);
				}
				if (strcmp(p1.number,"end") == 0)
				{
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
					p1.sex = tempVar9.charAt(0);
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
					p1.add = tempVar12.charAt(0);
				}
				p1.pre = p2;
				p2 = p1;
			}
			return (tail);
		}

		public static void print(student tail)
		{
			student p;
			p = tail;
				do
				{
				  System.out.printf("%s %s %c %d %s %s\n",p.number,p.name,p.sex,p.age,p.score,p.add);
				  p = p.pre;
				}while (p != null);
		}

		public static void Main()
		{
			print(creat());
		}
}

