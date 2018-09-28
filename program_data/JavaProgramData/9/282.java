package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct h
	//   {
	//	  char name[11];
	//	  int mun;
	//	  struct h *next;
	//   }
	//   *p,*q,*head,*s,*t,*last;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	 q = len;
	 s = head = q;
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 head.name = tempVar2;
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 head.mun = tempVar3;
	 }
	 q.next = null;
	 last = q;
	 int i;
	 for (i = 0;i < n - 1;i++)
	 {
	  s = head;
	  q = len;
	  q.next = null;
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  q.name = tempVar4;
	  }
	  String tempVar5 = ConsoleInput.scanfRead(" ");
	  if (tempVar5 != null)
	  {
		  q.mun = tempVar5;
	  }
	  if (q.mun >= 60)
	  {
		  while ((s != null) && ((q.mun) <= (s.mun)))
		  {
			  t = s;
			  s = s.next;
		  }
	  if (s == head)
	  {
		  q.next = head;
		  head = q;
	  }
		 else
		 {
			 if (t == last)
			 {
				 last = q;
			 }
			 t.next = q;
			 q.next = s;
		 }

	  }
	  else
	  {
		  last.next = q;
		  last = q;
	  }
	 }

	 q = head;
	 for (i = 0;i < n;i++)
	 {
		 System.out.printf("%s\n",q.name);
		 q = q.next;
	 }


	}

}

