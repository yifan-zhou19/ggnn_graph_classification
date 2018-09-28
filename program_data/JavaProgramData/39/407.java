public class student
{
	public String name = new String(new char[20]);
	public int score1;
	public int score2;
	public char lead;
	public char west;
	public int paper;
	public int sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int money(student p)
	{
		int z = 0;
		if ((p.score1 > 80) && (p.paper >= 1))
		{
		   z += 8000;
		}
		if ((p.score1 > 85) && (p.score2 > 80))
		{
		   z += 4000;
		}
		if (p.score1 > 90)
		{
		   z += 2000;
		}
		if ((p.score1 > 85) && (p.west == 'Y'))
		{
		   z += 1000;
		}
		if ((p.score2 > 80) && (p.lead == 'Y'))
		{
		   z += 850;
		}
		return (z);
	}
	public static void Main()
	{
		int total = 0;
		student p1;
		student p2;
		student p0;
		student head;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		head = null;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.score1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.score2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.lead = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			p1.west = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			p1.paper = Integer.parseInt(tempVar7);
		}
		p0 = p1;
		p1.sum = money(p1);
		total += p1.sum;
		for (i = 1;i < n;i++)
		{
			 if (i == 1)
			 {
				 head = p1;
			 }
			 else
			 {
				 p2.next = p1;
			 }
			 p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 p1 = (student)malloc(LEN);
			 String tempVar8 = ConsoleInput.scanfRead();
			 if (tempVar8 != null)
			 {
				 p1.name = tempVar8.charAt(0);
			 }
			 String tempVar9 = ConsoleInput.scanfRead(" ");
			 if (tempVar9 != null)
			 {
				 p1.score1 = Integer.parseInt(tempVar9);
			 }
			 String tempVar10 = ConsoleInput.scanfRead(" ");
			 if (tempVar10 != null)
			 {
				 p1.score2 = Integer.parseInt(tempVar10);
			 }
			 String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar11 != null)
			 {
				 p1.lead = tempVar11.charAt(0);
			 }
			 String tempVar12 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar12 != null)
			 {
				 p1.west = tempVar12.charAt(0);
			 }
			 String tempVar13 = ConsoleInput.scanfRead(" ");
			 if (tempVar13 != null)
			 {
				 p1.paper = Integer.parseInt(tempVar13);
			 }
			 p1.sum = money(p1);
			 if (p0.sum < p1.sum)
			 {
				 p0 = p1;
			 }
			 total += p1.sum;
		}
		System.out.printf("%s\n%d\n%ld\n",p0.name,p0.sum,total);
	}
}

