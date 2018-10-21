public class book
{
	public int num;
	public String name = new String(new char[27]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	   public static int m;
	public static book head;

	public static book setup()
	{
		int t = 0;
		book head;
		book p1;
		book p2;
		head = p1 = p2 = new book();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		while (t < m - 1)
		{
			t++;
			p2.next = p1;
			p2 = p1;
			p1 = new book();
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.name = tempVar4.charAt(0);
			}
		}
		p2.next = p1;
		p1.next = null;
		return (head);
	}
	   public static int k = 0;
	   public static int max = 0;
	public static void found(book p)
	{
		int i;
		int j;
		  p = head;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pi;
		  int pi;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  pi = (int)malloc((Integer.SIZE / Byte.SIZE) * 26);
		  for (i = 0;i < 26;i++)
		  {
			  *(pi + i) = 0;
		  }
		  for (i = 0;i < m;i++)
		  {
				  for (j = 0;p.name.charAt(j) != '\0';j++)
				  {
							 (*(pi + (p.name.charAt(j) - 'A')))++;
				  }
				 p = p.next;
		  }
			 for (j = 0;j < 26;j++)
			 {
					  if (*(pi + j) > max)
					  {
					   max = (pi + j);
					   k = j;
					  }
			 }

	}
		  public static int Main()
		  {
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		book p;
		 head = p = setup();
		 found(p);
		 System.out.printf("%c\n%d\n",(k + 'A'),max);
		 p = head;
		 for (i = 0;i < m;i++)
		 {
				for (j = 0;p.name.charAt(j) != '\0';j++)
				{
			   if (p.name.charAt(j) == k + 'A')
			   {
			   System.out.printf("%d\n",p.num);
			   break;
			   }
				}
			   p = p.next;
		 }
		  }

}

