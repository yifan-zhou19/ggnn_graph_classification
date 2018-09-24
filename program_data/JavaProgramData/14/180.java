public class student
{
	public int num;
	public int yuwen;
	public int shuxue;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	  public static student creat(int m)
	  {
		  student head;
		  student p1;
		  student p2;
		  n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p1 = p2 = (student)malloc(LEN);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  p1.num = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  p1.yuwen = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  p1.shuxue = Integer.parseInt(tempVar3);
		  }
		  head = null;
		  while (m-- != 0)
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			  p1 = (student)malloc(LEN);
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  p1.num = Integer.parseInt(tempVar4);
			  }
			  String tempVar5 = ConsoleInput.scanfRead();
			  if (tempVar5 != null)
			  {
				  p1.yuwen = Integer.parseInt(tempVar5);
			  }
			  String tempVar6 = ConsoleInput.scanfRead();
			  if (tempVar6 != null)
			  {
				  p1.shuxue = Integer.parseInt(tempVar6);
			  }
		  }
		  p2.next = null;
		  return (head);
	  }
	  public static student del(student head, int num)
	  {
		  student p1;
		  student p2;
		  p1 = head;
		  while (num != p1.num && p1.next != null)
		  {
			  p2 = p1;
			  p1 = p1.next;
		  }
		  if (num == p1.num)
		  {
			  if (p1 == head)
			  {
				  head = p1.next;
			  }
			  else
			  {
				  p2.next = p1.next;
			  }
			  n = n - 1;
		  }
		  return (head);

	  }
	  public static void Main()
	  {
		  student head;
		  student p1;
		  student p2;
		  int max = 0;
		  int i;
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  System.out.print("\n");
		  head = creat(m);
		  for (i = 0;i < 3;i++)
		  {
			   p1 = p2 = head;
			   max = 0;
				while (p1.next != null)
				{
				 if ((p1.yuwen + p1.shuxue) > max)
				 {
				 max = p1.yuwen + p1.shuxue,p2 = p1;
				 }
				  p1 = p1.next;
				}
			System.out.printf("%d %d\n",p2.num,(p2.yuwen + p2.shuxue));
			head = del(head, p2.num);
		  }
	  }



}

