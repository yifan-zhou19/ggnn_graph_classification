public class student
{
	public String name = new String(new char[20]);
	public int end;
	public int clas;
	public char leader;
	public char west;
	public int paper;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student p;
		student q;
		student head;
		String a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b,*c;
		int b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *c;
		int c;
		int n;
		int i;
		int max = 0;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p = q = (student)malloc(LEN);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(20 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = c = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.end = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.clas = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p.leader = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p.west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p.paper = Integer.parseInt(tempVar7);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (student)malloc(LEN);
			q.next = p;
			q = p;
		}
		q.next = null;
		q = p = head;
		for (i = 0;i < n;i++)
		{
			if (((p.end) > 80) && ((p.paper) > 0))
			{
				b += 8000;
			}
			if (((p.end) > 85) && ((p.clas) > 80))
			{
				b += 4000;
			}
			if ((p.end) > 90)
			{
				b += 2000;
			}
			if (((p.end) > 85) && ((p.west) == 'Y'))
			{
				b += 1000;
			}
			if (((p.clas) > 80) && ((p.leader) == 'Y'))
			{
				b += 850;
			}
			b++;
			p = q.next;
			q = p;
		}
		q = p = head;
		b = c;
		for (i = 0;i < n;i++)
		{
			if (b > max)
			{
				max = b;
				a = p.name;
			}
			sum += b;
			b++;
			p = q.next;
			q = p;
		}
		System.out.printf("%s\n%d\n%ld\n",a,max,sum);
	}

}

