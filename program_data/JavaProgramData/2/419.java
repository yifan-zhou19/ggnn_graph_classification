public class sa
{
	public int a;
	public String b = new String(new char[100]);
	public sa next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[] k = new int[27];
	public static sa kao()
	{
		sa head;
		sa p1;
		sa p2;
		n = 0;
		head = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (sa)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.b = tempVar2.charAt(0);
		}
		head = p1;
		for (;;)
		{
		   n++;
		   if (n == m + 1)
		   {
			   break;
		   }
		   if (n == 1)
		   {
			   head = p1;
		   }
		   else
		   {
			   p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			   p1 = (sa)malloc(len);
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   p1.a = Integer.parseInt(tempVar3);
			   }
			   String tempVar4 = ConsoleInput.scanfRead(" ");
			   if (tempVar4 != null)
			   {
				   p1.b = tempVar4.charAt(0);
			   }
			   p2.next = p1;
		   }
		}
		p1.next = null;
		return (head);
	}
	public static int Main()
	{
		sa p;
		sa q;
		sa head;
		sa ped;
		int f;
		int i;
		int g;
		int s = 1;
		int t;
		int d = 0;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = kao();
		for (p = head;p != null;p = p.next)
		{
			g = p.b.length();
			for (i = 0;i < g;i++)
			{
				k[p.b.charAt(i) - 64]++;
			}
		}
		t = k[1];
		for (i = 2;i < 27;i++)
		{
			if (k[i] > k[s])
			{
				s = i;
				t = k[i];
			}
		}
		System.out.printf("%c\n%d\n",s + 64,t);
		for (p = head;p != null;)
		{
			g = p.b.length();
			for (i = 0;i < g;i++)
			{
				if (p.b.charAt(i) == s + 64)
				{
					d = 1;
					break;
				}
			}
			if (d == 1)
			{
				System.out.printf("%d\n",p.a);
			}
			d = 0;
			p = p.next;
		}
		return 0;
	}

}

