public class pat
{
	   public String num = new String(new char[10]);
	   public int age;
	   public pat next;
}

package <missing>;

public class GlobalMembers
{
	public static pat creat(int n)
	{
		   pat p1;
		   pat p2;
		   pat head;
		   int i;
		p2 = head = p1 = new pat();
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.age = Integer.parseInt(tempVar2);
			}
			if (i == 0)
			{
				head = p1;
			}
			p2.next = p1;
			p2 = p1;
			p1 = new pat();
		}
		p2 = null;
		return head;
	}


	public static void array(pat head, int n)
	{
		 int i;
		 int j;
		 int ta;
		 String str = new String(new char[10]);
		 pat p1;
		 pat p2;
		 p1 = head;
		 for (i = 0;i < n - 1;i++)
		 {
		   for (j = 0;j < n - 1 - i;j++)
		   {
					 p2 = p1;
					 p1 = p1.next;
					 if ((p1.age) > (p2.age) && (p1.age) >= 60)
					 {

											  str = p2.num;
											  p2.num = p1.num;
											  p1.num = str;
											  ta = p1.age;
											  p1.age = p2.age;
											  p2.age = ta;
					 }
		   }
		   p1 = head;
		 }
	}

	public static void Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  pat p;
		  p = creat(n);
		  array(p, n);
		 int i;
		 for (i = 0;i < n;i++)
		 {
		  System.out.printf("%s\n",p.num);
		  p = p.next;
		 }
	}


}

