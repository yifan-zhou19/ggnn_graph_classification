public class student
{
	public int num;
 public int yw;
 public int sx;
 public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student head;
		student p1;
		student p2;
		int i;
		int max;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p1 = p2 = head = null;
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			  p1 = (student)malloc(LEN);
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   p1.num = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   p1.yw = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   p1.sx = Integer.parseInt(tempVar4);
		   }
		   if (i == 0)
		   {
			   head = p1;
		   }
		   else
		   {
			   p2.next = p1;
		   }
		   p2 = p1;
		}
		 p2.next = null;

	   for (i = 0;i < 3;i++)
	   {
		   p1 = p2 = head;
		max = p1.yw + p1.sx;
		while (p1 != null)
		{
			   if ((p1.yw + p1.sx) > max)
			   {
				   max = p1.yw + p1.sx;
				p2 = p1;
			   }
		   p1 = p1.next;
		}
		System.out.printf("%d %d\n",p2.num,max);
		p1 = head;
		while (p1.next != p2)
		{
			   p1 = p1.next;
		}
		p1.next = p2.next;
	   }
	}





}

