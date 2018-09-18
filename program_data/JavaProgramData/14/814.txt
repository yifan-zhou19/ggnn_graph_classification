public class student
{
	public String num = new String(new char[10]);
	public float a;
	public float b;
	public float c;
	public int t;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student head;

	public static student creat()
	{
		student p1;
		student p2;
		int i;
		i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.a = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.b = Float.parseFloat(tempVar3);
		}
		p1.c = p1.a + p1.b;
		p1.t = 0;
		head = null_Renamed;
		while (i < n - 1)
		{
			i++;
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
			p1 = (student)malloc(len);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.a = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.b = Float.parseFloat(tempVar6);
			}
			p1.c = p1.a + p1.b;
			p1.t = 0;
		}
		p2.next = p1;
		p1.next = null_Renamed;
		return (head);
	}

	public static void max()
	{
		student p1;
		student p2;
		float mm = 0F;
		p1 = head;
		for (;p1 != null_Renamed;)
		{
			if (p1.c > mm && p1.t == 0)
			{
				mm = p1.c;
				p2 = p1;
			}
			p1 = p1.next;
		}
		System.out.printf("%s %g\n",p2.num,p2.c);
		p2.t = 1;
	}

	public static int Main()
	{
		int i;
		int j;
		student p;
		void max();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		creat();
		max();
		max();
		max();
	}
}

