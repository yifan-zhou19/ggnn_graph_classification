public class number
{
  public int num;
  public number next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int m;
	  int i;
	  number p;
	  number head;
	  number q;
	  while (scanf("%d%d", n, m) && n > 0 && m > 0)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (number) malloc(LEN);
		head = p;
		for (i = 0;i < n - 1;i++)
		{
		  p.num = i + 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p.next = (number) malloc(LEN);
		  p = p.next;
		}
		p.num = n;
		p.next = head;
		q = p;
		while (p.next != p)
		{
		  for (i = 0;i < m - 1;i++)
		  {
			  p = p.next;
		  }
		  q = p;
		  p = p.next;
		  q.next = p.next;
		  p = q;
		}
		System.out.printf("%d\n",p.num);
	  }
	  return 0;
	}

}
