public class student
{
	public String num = new String(new char[10]);
	public String name = new String(new char[20]);
	public String sex = new String(new char[2]);
	public int year;
	public int[] score = new int[10];
	public String add = new String(new char[10]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
		 student head;
		 student p1;
		 student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 p1 = (student)malloc(LEN);
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
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 p1.sex = tempVar3.charAt(0);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 p1.year = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ");
		 if (tempVar5 != null)
		 {
			 p1.score = Integer.parseInt(tempVar5);
		 }
		 String tempVar6 = ConsoleInput.scanfRead(" ");
		 if (tempVar6 != null)
		 {
			 p1.add = tempVar6.charAt(0);
		 }
		 p1.next = null;
		 n = 1;
		 head = p1;
		 p2 = p1;
		 do
		 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 p1 = (student)malloc(LEN);
			 String tempVar7 = ConsoleInput.scanfRead();
			 if (tempVar7 != null)
			 {
				 p1.num = tempVar7.charAt(0);
			 }
			 if (strcmp(p1.num,"end") == 0)
			 {
				 break;
			 }
			 String tempVar8 = ConsoleInput.scanfRead();
			 if (tempVar8 != null)
			 {
				 p1.name = tempVar8.charAt(0);
			 }
			 String tempVar9 = ConsoleInput.scanfRead(" ");
			 if (tempVar9 != null)
			 {
				 p1.sex = tempVar9.charAt(0);
			 }
			 String tempVar10 = ConsoleInput.scanfRead(" ");
			 if (tempVar10 != null)
			 {
				 p1.year = Integer.parseInt(tempVar10);
			 }
			 String tempVar11 = ConsoleInput.scanfRead(" ");
			 if (tempVar11 != null)
			 {
				 p1.score = Integer.parseInt(tempVar11);
			 }
			 String tempVar12 = ConsoleInput.scanfRead(" ");
			 if (tempVar12 != null)
			 {
				 p1.add = tempVar12.charAt(0);
			 }
			 p1.next = null;
			 p2.next = p1;
			 p2 = p1;
			 n = n + 1;
		 }while (1 != 0);
		 return (head);
	}
	public static void Main()
	{
		student head;
		student p;
		student q;
		head = creat();
		while (n != 0)
		{
			for (p = head;p.next != null;)
			{
				q = p;
				p = p.next;
			}
			System.out.printf("%s %s %s %d %s %s\n",p.num,p.name,p.sex,p.year,p.score,p.add);
			n = n - 1;
			q.next = null;
		}
	}
}

