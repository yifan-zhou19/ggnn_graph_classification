public class Inform
{
	public String number = new String(new char[30]);
	public String name = new String(new char[30]);
	public String gender = new String(new char[2]);
	public String age = new String(new char[4]);
	public String score = new String(new char[10]);
	public String address = new String(new char[20]);
	public Inform next;
}

package <missing>;

public class GlobalMembers
{
	 public static int n;
	 public static Inform creat()
	 {

		  Inform head;
		  Inform p1;
		  Inform p2;
		  head = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p1 = p2 = (Inform)malloc(LEN);
		  n = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  p1.number = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  p1.name = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  p1.gender = tempVar3.charAt(0);
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  p1.age = tempVar4.charAt(0);
		  }
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  p1.score = tempVar5.charAt(0);
		  }
		  String tempVar6 = ConsoleInput.scanfRead();
		  if (tempVar6 != null)
		  {
			  p1.address = tempVar6.charAt(0);
		  }
		  while (strcmp(p1.number,"end") != 0)
		  {
			  n = n + 1;
			  if (n == 1)
			  {
				  head = p1;
			  }
			  else
			  {
				  p2.next = p1;
			  }
			  p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			  p1 = (Inform)malloc(LEN);
			  String tempVar7 = ConsoleInput.scanfRead();
			  if (tempVar7 != null)
			  {
				  p1.number = tempVar7.charAt(0);
			  }
			  if (strcmp(p1.number,"end") != 0)
			  {
				  String tempVar8 = ConsoleInput.scanfRead();
				  if (tempVar8 != null)
				  {
					  p1.name = tempVar8.charAt(0);
				  }
				  String tempVar9 = ConsoleInput.scanfRead();
				  if (tempVar9 != null)
				  {
					  p1.gender = tempVar9.charAt(0);
				  }
				  String tempVar10 = ConsoleInput.scanfRead();
				  if (tempVar10 != null)
				  {
					  p1.age = tempVar10.charAt(0);
				  }
				  String tempVar11 = ConsoleInput.scanfRead();
				  if (tempVar11 != null)
				  {
					  p1.score = tempVar11.charAt(0);
				  }
				  String tempVar12 = ConsoleInput.scanfRead();
				  if (tempVar12 != null)
				  {
					  p1.address = tempVar12.charAt(0);
				  }
			  }
		  }
		  p2.next = null;
		  return head;
	 }



	public static void print(Inform h)
	{
		 Inform p;
		 p = h;
		 while (p != null)
		 {
			System.out.printf("%s %s %s %s %s %s\n",p.number,p.name,p.gender,p.age,p.score,p.address);
			p = p.next;
		 }

	}

	public static Inform invert(Inform h)
	{
		Inform p = h.next;
		 Inform q = p.next;
		h.next = null;
		while (q != null)
		{
			p.next = h;
			h = p;
			p = q;
			q = q.next;
			p.next = h;
		}
		p.next = h;
		return p;
	}


	public static int Main()
	{
		void print(struct Inform * h);
		Inform invert = new Inform(struct Inform * h);
		Inform hea;
		hea = creat();
		hea = invert(hea);
		print(hea);
		return 0;
	}

}

