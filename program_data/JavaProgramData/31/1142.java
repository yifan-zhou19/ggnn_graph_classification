public class student
{
	public String info = new String(new char[100]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
	  student head;
	  student p1;
	  student p2;
	  n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p1 = p2 = (student)malloc(LEN);
	  p1.info = new Scanner(System.in).nextLine();
	  head = null;
	  while (strcmp(p1.info,"end") != 0)
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
		  p1.info = new Scanner(System.in).nextLine();
	  }
	  p2.next = null;
	  return (head);
	}
	public static void pri(student head, int i)
	{
		int j;
		student p1;
		student p2;
		p1 = head;
		for (j = 1;j < i;j++)
		{
		   p2 = p1;
		   p1 = p2.next;
		}
		System.out.println(p1.info);
	}

	public static void Main()
	{
		int i;
		student head;
		student stu = new student();
		head = creat();
		for (i = n;i > 0;i--)
		{
		pri(head, i);
		}
	}
}
