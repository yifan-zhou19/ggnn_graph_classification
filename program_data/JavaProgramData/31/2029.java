public class student
{
	public String xh = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public float score;
	public String dizhi = new String(new char[30]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student append()
	{
		int n;
	 student head;
	 student newnode;
	 student thisnode = null;
	 for (n = 1;;n++)
	 {
		 newnode = new student();
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  newnode.xh = tempVar.charAt(0);
	  }
	  if (newnode.xh.charAt(0) == 'e')
	  {
			 head = thisnode;
			 break;
	  }
	  else
	  {
			 String tempVar2 = ConsoleInput.scanfRead(" ");
			 if (tempVar2 != null)
			 {
				 newnode.name = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar3 != null)
			 {
				 newnode.sex = tempVar3.charAt(0);
			 }
			 String tempVar4 = ConsoleInput.scanfRead(" ");
			 if (tempVar4 != null)
			 {
				 newnode.age = Integer.parseInt(tempVar4);
			 }
			 String tempVar5 = ConsoleInput.scanfRead(" ");
			 if (tempVar5 != null)
			 {
				 newnode.score = Float.parseFloat(tempVar5);
			 }
			 String tempVar6 = ConsoleInput.scanfRead(" ");
			 if (tempVar6 != null)
			 {
				 newnode.dizhi = tempVar6.charAt(0);
			 }
		  newnode.next = thisnode;
		  thisnode = newnode;
	  }
	 }
	 return head;
	}
	public static void Main()
	{
		student p;
	 for (p = append();p != null;p = p.next)
	 {
		 System.out.printf("%s %s %c %d %g %s\n",p.xh,p.name,p.sex,p.age,p.score,p.dizhi);

	 }
	}

}

