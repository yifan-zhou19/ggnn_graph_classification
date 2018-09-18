public class book
{
	public String writer = new String(new char[32]);
	public int id;
	public book next;
}
	i = 0,p = head;

package <missing>;

public class GlobalMembers
{
	public static book create(int m)
	{
		 book head = null;
		 book p1;
		 book p2;
		 int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 p1 = p2 = (book)malloc(Len);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 p1.id = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 p1.writer = tempVar2.charAt(0);
		 }
		 p1.next = null;
		 head = p1;
		 p2 = p1;
		 for (i = 1;i < m;i++)
		 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (book)malloc(Len);
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 p1.id = Integer.parseInt(tempVar3);
				 }
				 String tempVar4 = ConsoleInput.scanfRead(" ");
				 if (tempVar4 != null)
				 {
					 p1.writer = tempVar4.charAt(0);
				 }
				p1.next = null;
				p2.next = p1;
				p2 = p1;
		 }
			 return head;
	}
	public static int Main()
	{
		book head;
		book p;
		int m;
		int i;
		int[] q1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q2;
		int q2;
		int j;
		q1 = new int[26];
		  q2 = q1;
		for (i = 0;i < 26;i++)
		{
		  q1[i] = 0;
		}
		q1 = q2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = create(m);
		p = head;
		for (i = 0;i < m;i++)
		{
		   for (j = 0;p.writer.charAt(j) != '\0';j++)
		   {
		   q1[p.writer.charAt(j) - 'A']++;
		   }
		   p = p.next;
		}
		q1 = q2;
		int max = 0;
		char maxm = 'A';
		for (i = 0;i < 26;i++)
		{
		  if (max < q1[i])
		  {
		  max = q1[i];
		  maxm = i + 'A';
		  }
		}
		  System.out.printf("%c\n%d",maxm,max);
		for (i = 0,p = head;i < m;i++,p = p.next)
		{
		  for (j = 0;p.writer.charAt(j) != '\0';j++)
		  {
			if (p.writer.charAt(j) == maxm)
			{
				System.out.printf("\n%d",p.id);
			}
		  }
		}
	}

}

