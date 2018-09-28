public class results
{
	public int num;
	public results next;
}

package <missing>;

public class GlobalMembers
{
	public static void print0(results head)
	{
	   results p;
	   p = head;

	   while (p != null)
	   {
			   System.out.printf("%d",p.num);
			   System.out.print("\n");
			   p = p.next;
	   }
	}

	public static int Main()
	{
		int n;
		int m;
		int i;
		int g;
		int s = 0;

		results head;
		results p1;
		results p2;

		head = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (results)malloc(LEN);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = (results)malloc(LEN);
		g = 0;

		while (scanf("%d%d", n, m) != EOF && (m != 0 && n != 0))
		{
			if (m <= 0 || n>300)
			{
				System.out.print("?????0<m,n<=300:");
				continue;
			}
			s = 0;
			if (n == 1)
			{
				s = 0;
			}
			else
			{
				for (i = 2;i <= n;i++)
				{
			s = (s + m) % i;
				}
			}
			 p1.num = s + 1;
		  g = g + 1;
			 if (g == 1)
			 {
				 head = p1;
			 }
			 else
			 {
				 p2.next = p1;
			 }
			 p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 p1 = (results)malloc(LEN);
		}
		p2.next = null;

		print0(head);
		return 0;
	}
}
