public class stud
{
	public int num;
	public int score;
	public int score1;
	public int score2;
	public stud next;
}

package <missing>;

public class GlobalMembers
{
	public static stud head = new stud();
	public static stud end = new stud();
	public static void create(int n)
	{
		int i;
		stud p1;
		stud p2;
		head.next = null;
		for (i = 0;i <= n - 1;i++)
		{
			p1 = new stud();
			if (i == 0)
			{
				head.next = p1;
			}
			else
			{
				p2.next = p1;
			}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.score1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.score2 = Integer.parseInt(tempVar3);
			}
			p1.score = p1.score1 + p1.score2;
			p2 = p1;
		}
		p2.next = end;
	}
	public static void find()
	{
		stud max1; //max1 is the max
		stud max2;
		stud max3;
		stud p1;
		stud swap;
		max1 = head.next;
		max2 = max1.next;
		max3 = max2.next;
		p1 = max3.next;
		if (max1.score < max2.score)
		{
			swap = max1;
			max1 = max2;
			max2 = swap;
		}
		if (max2.score < max3.score)
		{
			swap = max2;
			max2 = max3;
			max3 = swap;
		}
		if (max1.score < max2.score)
		{
			swap = max1;
			max1 = max2;
			max2 = swap;
		}
		while (p1 != end)
		{
			if (p1.score > max3.score)
			{
				max3 = p1;
			}
			if (max3.score > max2.score)
			{
				swap = max3;
				max3 = max2;
				max2 = swap;
			}
			if (max2.score > max1.score)
			{
				swap = max1;
				max1 = max2;
				max2 = swap;
			}
			p1 = p1.next;
		}
		System.out.printf("%d %d\n",max1.num,max1.score);
		System.out.printf("%d %d\n",max2.num,max2.score);
		System.out.printf("%d %d\n",max3.num,max3.score);
	}
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		create(n);
		find();
	}

}

