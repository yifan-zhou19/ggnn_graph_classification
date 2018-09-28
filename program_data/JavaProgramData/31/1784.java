///#include<stdlib.h>//
public class student
{
		public student bef;
		public String n = new String(new char[10]);
		public String s = new String(new char[20]);
		public char sex;
		public int age;
		public String score = new String(new char[10]);
		public String address = new String(new char[20]);
		public student next;
}

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
			p1 = p2 = (student)malloc(LEN);

					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						(p1.n) = tempVar.charAt(0);
					}
					String tempVar2 = ConsoleInput.scanfRead(" ");
					if (tempVar2 != null)
					{
						(p1.s) = tempVar2.charAt(0);
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
						p1.address = tempVar6.charAt(0);
					}

					while (p1.n.charAt(0) != 'e')
					{
							n = n + 1;
							if (n == 1)
							{

								 p1.bef = null;
							}
							else
							{
									p2.next = p1;
									p1.bef = p2;
							}
							p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
							p1 = (student)malloc(LEN);

							String tempVar7 = ConsoleInput.scanfRead();
							if (tempVar7 != null)
							{
								p1.n = tempVar7.charAt(0);
							}
							String tempVar8 = ConsoleInput.scanfRead(" ");
							if (tempVar8 != null)
							{
								p1.s = tempVar8.charAt(0);
							}
							String tempVar9 = ConsoleInput.scanfRead(" ", 1);
							if (tempVar9 != null)
							{
								(p1.sex) = tempVar9.charAt(0);
							}
							String tempVar10 = ConsoleInput.scanfRead(" ");
							if (tempVar10 != null)
							{
								(p1.age) = Integer.parseInt(tempVar10);
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


			return (p2);
	}


			public static int Main()
			{
					student p;
					p = creat();
					do
					{
							System.out.printf("%s %s %c %d %s %s\n",p.n,p.s,p.sex,p.age,p.score,p.address);
							p = p.bef;
					}while (p != null);
			return 0;
			}




}

