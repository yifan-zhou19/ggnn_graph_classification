public class ming
{
	   public int n;
	   public int m;
	   public ming next;
}

package <missing>;

public class GlobalMembers
{
	public static ming creat()
	{
		   ming head;
		   ming p1;
		   ming p2;
		   int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p1 = p2 = (ming)malloc(LEN);
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   p1.n = Integer.parseInt(tempVar);
		   }
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   p1.m = Integer.parseInt(tempVar2);
		   }
		   head = null;
		   while (p1.n != 0 || p1.m != 0)
		   {
									i++;
									if (i == 1)
									{
										head = p1;
									}
									else
									{
									p2.next = p1;
									}
									p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
									p1 = (ming)malloc(LEN);
									String tempVar3 = ConsoleInput.scanfRead();
									if (tempVar3 != null)
									{
										p1.n = Integer.parseInt(tempVar3);
									}
									String tempVar4 = ConsoleInput.scanfRead();
									if (tempVar4 != null)
									{
										p1.m = Integer.parseInt(tempVar4);
									}
									//printf("%d %d\n",p1->n,p1->m);
		   }
		   p2.next = null;
		   return (head);
	}
	public static int found(int l, ming head)
	{
		int i = 0;
		ming p1;
		p1 = head;
		while (p1 != null)
		{
							 if (p1.m == l)
							 {
								 i++;
							 //printf("%d\n",p1->n);
							 }
							 p1 = p1.next;
							 //printf("%d %d\n",p1->n,p1->m);
		}
		return (i);
	}

	public static int Main()
	{

		int n;
		int o;
		int k;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		ming head;
		head = creat();
		for (o = 0,k = 0;o < n;o++)
		{
						p = found(o, head);
						//printf("%d\n",p);
						if (p == n - 1)
						{
								System.out.printf("%d\n",o);
								k++;
								break;
						}
		}
		if (k == 0)
		{
			System.out.print("NOT FOUND");
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}
}

