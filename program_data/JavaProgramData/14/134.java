public class stu
{
  public int id;
  public int eng;
  public int math;
  public int sum;
  public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu head;
	public static stu p1;
	public static stu p2;
	public static stu order(int n)
	{
	 int i;
	 int j;
	 int t;
	 p1 = head;
	 for (i = 0;i < 3;i++)
	 {
	   p2 = p1.next;
	   for (j = i + 1;j < n;j++)
	   {
		   if (p1.sum < p2.sum)
		   {
		  t = p1.id;
		  p1.id = p2.id;
		  p2.id = t;
		  t = p1.sum;
		  p1.sum = p2.sum;
		  p2.sum = t;
		   }
	   p2 = p2.next;
	   }
	  p1 = p1.next;
	 }
	 return head;
	}
	public static void Main()
	{
	 int n;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 p1 = head = new stu();
	 for (i = 0;i < n;i++)
	 {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.id = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.eng = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.math = Integer.parseInt(tempVar4);
		}
		p1.sum = p1.eng + p1.math;
		p2 = p1;
		p1 = new stu();
		p2.next = p1;
	 }
	 p2.next = null;
	 p1 = order(n);
	 for (i = 0;i < 3;i++)
	 {
	  System.out.printf("%d %d\n",p1.id,p1.sum);
	  p1 = p1.next;
	 }
	}
}

