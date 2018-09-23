public class student
{
 public int a;
 public int b;
 public int c;
 public int d;
 public student next;
}

package <missing>;

public class GlobalMembers
{
	 public static int n;
	 public static student creat(int i)
	 {
		 student head;
		 student p1;
		 student p2;
		 n = 0;
		 p1 = p2 = new student();
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 p1.a = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 p1.b = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 p1.c = Integer.parseInt(tempVar3);
		 }
		 p1.d = p1.c + p1.b;
		 head = null;
		 while (n < i - 1)
		 {
		  n = n + 1;
		  if (n == 1)
		  {
			  head = p1;
		  }
		  else
		  {
			  p2.next = p1;
		  }
		  p2 = p1;
		  p1 = new student();
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  p1.a = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ");
		  if (tempVar5 != null)
		  {
			  p1.b = Integer.parseInt(tempVar5);
		  }
		  String tempVar6 = ConsoleInput.scanfRead(" ");
		  if (tempVar6 != null)
		  {
			  p1.c = Integer.parseInt(tempVar6);
		  }
		  p1.d = p1.c + p1.b;
		 }
		 p2.next = null;
		 return (head);
	 }
	public static void del(student ahead, int num)
	{
		 student p1;
		 student p2;
		p1 = ahead;
	   while (num != p1.d && p1.next != null)
	   {
		   p2 = p1;
		   p1 = p1.next;
	   }
	   if (num == p1.d)
	   {
		   if (p1 == ahead)
		   {
			   System.out.printf("%d %d\n",p1.a,p1.d);
			   ahead = p1.next;
		   }
	   else
	   {
		   System.out.printf("%d %d\n",p1.a,p1.d);
		   p2.next = p1.next;
	   }
	   }
	}
	public static void print(student head)
	{
		int i;
		 student p;
		 for (i = 0;i < 3;i++)
		 {
			 p = head;
		 int max = p.d;
		 while (p.next != null)
		 {
			 p = p.next;
			 if (max < p.d)
			 {
				 max = p.d;
			 }
		 }
		 del(head, max);
		 }
	}
	public static void Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
	   student ahead;
	   ahead = creat(i);
	   print(ahead);
	}

}

