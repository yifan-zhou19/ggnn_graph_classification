public class st
{
	 public String id = new String(new char[20]);
	 public String name = new String(new char[20]);
	 public char sex;
	 public int age;
	 public float goal;
	 public String address = new String(new char[20]);
	 public st last;
}

package <missing>;

public class GlobalMembers
{
	public static st input()
	{
		   int n;
		   st end;
		   st p1;
		   st p2;
		   n = 0;
		   p1 = p2 = new st();
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   p1.id = tempVar.charAt(0);
		   }
		   while (strcmp(p1.id,"end") != 0)
		   {
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p1.name = tempVar2.charAt(0);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar3 != null)
				{
					p1.sex = tempVar3.charAt(0);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					p1.age = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead(" ");
				if (tempVar5 != null)
				{
					p1.goal = Float.parseFloat(tempVar5);
				}
				String tempVar6 = ConsoleInput.scanfRead(" ");
				if (tempVar6 != null)
				{
					p1.address = tempVar6.charAt(0);
				}
				if (n == 0)
				{
					p1.last = null;
				}
				else
				{
					p1.last = p2;
				}
				p2 = p1;
				p1 = new st();
				String tempVar7 = ConsoleInput.scanfRead();
				if (tempVar7 != null)
				{
					p1.id = tempVar7.charAt(0);
				}
				n = 1;
		   }
		   end = p2;
		   return (end);
	}

	public static void output(st end)
	{
		 st p;
		 p = end;
		 if (end != null)
		 {
			do
			{
				  System.out.printf("%s %s %c %d ",p.id,p.name,p.sex,p.age);
				  if (Math.floor(p.goal) == p.goal)
				  {
					  System.out.printf("%.0f",p.goal);
				  }
				  else
				  {
					  System.out.printf("%.1f",p.goal);
				  }
				  System.out.printf(" %s\n",p.address);
				  p = p.last;
			}while (p != null);
		 }
	}

	public static int Main()
	{
		 st end;
		 end = input();
		 output(end);
	}


}

