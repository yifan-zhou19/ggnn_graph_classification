package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct peo
	//  {
	//	  char num[10];
	//	int old;
	//	struct peo *next;
	//   };
	  peo p;
	  peo p1;
	  peo p2;
	  peo p3;
	  peo head1;
	  peo head2;
	  peo head3;
	  int n;
	  int i;
	  int j;
	  int k;
	  p = p1 = p2 = p3 = head1 = head2 = head3 = new peo();
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   p1.num = tempVar2;
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   p1.old = tempVar3;
		   }
		 if (i == 1)
		 {
			 head1 = p1;
		 }
		 else
		 {
			 p2.next = p1;
		 }
		 p2 = p1;
		 p1 = new peo();
	  }
	  for (i = 1;i <= n;i++)
	  {
		  p1 = head1;
		  p2 = head1;
		for (j = 1;j <= (n + 1 - i);j++)
		{
			 if (p1.old > p2.old && p1.old >= 60)
			 {
				 p2 = p1;
			 }
		  p1 = p1.next;
		}
		if (i == 1)
		{
			head2 = p2;
		}
		else
		{
			p.next = p2;
		}
		p = p2;
		p1 = head1;
		p3 = head1;
		for (j = 1;j <= (n - i + 1);j++)
		{
			 if (p1.num == p2.num)
			 {
				 if (j == 1)
				 {
					 head1 = p1.next;
				 }
								 else
								 {
									 p3.next = p1.next;
								 }
			 }
		  p3 = p1;
		  p1 = p1.next;
		}
	  }
	 p = head2;
	 for (i = 1;i <= n;i++)
	 {
		  System.out.printf("%s\n",p.num);
		  p = p.next;
	 }

	}

}

