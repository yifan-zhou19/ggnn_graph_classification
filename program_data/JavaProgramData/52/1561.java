public class element
{
  public int num;
  public element next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int m;
	  int i;
	  element head;
	  element p1;
	  element p2;
	  element p;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  head = null;
	  for (i = 1;i <= n;i++)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (element)malloc(LEN);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.num = Integer.parseInt(tempVar3);
		}
		if (i == 1)
		{
			head = p1;
		}
		else
		{
			p2.next = p1;
		}
		p2 = p1;
		if (i == n - m + 1)
		{
			p = p1;
		}
	  }
	  p2.next = head;

	  System.out.printf("%d",p.num);
	  for (i = 1;i < n;i++)
	  {
		p = p.next;
		System.out.printf(" %d",p.num);
	  }
	}
}

