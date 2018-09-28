public class student
{
	public String name = new String(new char[20]);
	public int ave;
	public int cla;
	public char g;
	public char x;
	public int num;
	public int qian;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int zong;
		int max = 0;
		int i;
		int j;
		zong = 0;
	   student p;
	   student head;
	   student p2;
	   p2 = p = head = new student();
	   int N;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   N = Integer.parseInt(tempVar);
		   }
	   for (i = 0;i < N;i++)
	   {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p.ave = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p.cla = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p.g = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			p.x = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			p.num = Integer.parseInt(tempVar7);
		}
		 p.qian = 0;
		if (p.ave > 80 && p.num >= 1)
		{
			p.qian += 8000;
		}
		if (p.ave > 85 && p.cla > 80)
		{
	p.qian += 4000;
		}
	if (p.ave > 90)
	{
	p.qian += 2000;
	}
	if (p.x == 'Y' && p.ave > 85)
	{
	p.qian += 1000;
	}
	if (p.g == 'Y' && p.cla > 80)
	{
	p.qian += 850;
	}
	zong += p.qian;
		if (i == 0)
		{
			head = p;
		}
		p2.next = p;
		p2 = p;
		p = new student();
	   }
	   p2 = null;
	   p = head;
	   for (i = 0;i < N;i++)
	   {
		   j = p.qian;
		   max = j > max != 0?j:max;
		   p = p.next;
	   }
	   p = head;
	   for (i = 0;i < N;i++)
	   {
		   if (p.qian == max)
		   {
			   System.out.printf("%s\n",p.name);
		   break;
		   }
		   p = p.next;
	   }
	 System.out.printf("%d\n",max);
	   System.out.printf("%d",zong);
	}

}

