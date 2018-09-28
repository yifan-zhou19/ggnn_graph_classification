public class data
{
	public String name = new String(new char[200]);
	public int score;
	public int classscore;
	public char leader;
	public char west;
	public int paper;
	public int scholarship;
	public data next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}

		int i;
		int sum = 0;
		int max = 0;
		data head;
		data p1;
		data p2;
		data recorder;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (data)malloc(Len);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.score = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.classscore = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.leader = tempVar5.charAt(0);
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
		p1.next = null;
		p1.scholarship = 0;
		head = p1;
		p2 = p1;

		for (i = 1;i < N;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (data)malloc(Len);
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.name = tempVar8.charAt(0);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.score = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p1.classscore = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p1.leader = tempVar11.charAt(0);
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
			p1.next = null;
			p1.scholarship = 0;
			p2.next = p1;
			p2 = p1;
		}

		for (p1 = head;p1 != null;p1 = p1.next)
		{

			if (p1.paper > 0 && p1.score > 80)
			{
				p1.scholarship += 8000;
			}
			if (p1.score > 85 && p1.classscore > 80)
			{
				p1.scholarship += 4000;
			}
			if (p1.score > 90)
			{
				p1.scholarship += 2000;
			}
			if (p1.score > 85 && p1.west == 'Y')
			{
				p1.scholarship += 1000;
			}
			if (p1.classscore > 80 && p1.leader == 'Y')
			{
				p1.scholarship += 850;
			}

			if (p1.scholarship > max)
			{
				max = p1.scholarship;
				recorder = p1;
			}
			sum = sum + p1.scholarship;
		}
		System.out.printf("%s\n%d\n%d\n",recorder.name,recorder.scholarship,sum);
		return 0;
	}

}

