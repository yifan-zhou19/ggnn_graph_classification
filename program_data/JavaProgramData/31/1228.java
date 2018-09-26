public class student
{
	   public String num = new String(new char[20]);
	   public String name = new String(new char[20]);
	   public String ch = new String(new char[1]);
	   public int ye;
	   public String gra = new String(new char[10]);
	   public String add = new String(new char[20]);
	   public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student p;
		student p1;
		student p2;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student) malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		p = null;
		n = 0;
		while (p1.num.charAt(0) != 'e')
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  p1.name = tempVar2.charAt(0);
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  p1.ch = tempVar3.charAt(0);
			  }
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  p1.ye = Integer.parseInt(tempVar4);
			  }
			  String tempVar5 = ConsoleInput.scanfRead();
			  if (tempVar5 != null)
			  {
				  p1.gra = tempVar5.charAt(0);
			  }
			  String tempVar6 = ConsoleInput.scanfRead();
			  if (tempVar6 != null)
			  {
				  p1.add = tempVar6.charAt(0);
			  }
			  n++;
			  if (n == 1)
			  {
				  p2 = p1;
			  }
			  else
			  {
				  p1.next = p2;
			  }
			  p = p1;
			  p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			  p1 = (student)malloc(LEN);
			  String tempVar7 = ConsoleInput.scanfRead();
			  if (tempVar7 != null)
			  {
				  p1.num = tempVar7.charAt(0);
			  }
		}
		if (p != null)
		{
		do
		{
		  System.out.printf("%s %s %s %d %s %s\n",p.num,p.name,p.ch,p.ye,p.gra,p.add);
		  p = p.next;
		}while (p != null);
		}

	}

}

