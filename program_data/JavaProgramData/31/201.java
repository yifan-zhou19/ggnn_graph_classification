public class student
{
	public String num = new String(new char[1000]);
public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		student head;
		student p1;
		student p;
		student p2;
		student end;
	int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p = p1 = p2 = (student)malloc(LEN);
	p1.num = new Scanner(System.in).nextLine();
	head = null;
	while (strcmp(p1.num,"end") != 0)
	{
		 n = n + 1;
	  head = p1;
	  if (n == 1)
	  {
		  p1.next = null;
	  }
	  else
	  {
		  p1.next = p2;
	  }
	  p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p1 = (student)malloc(LEN);
	  p1.num = new Scanner(System.in).nextLine();
	}
	p = head;
	if (head != null)
	{
		do
		{
		System.out.println(p.num);
	p = p.next;
		} while (p != null)
		;
	}
	}
}
