public class stu
{
	public String name = new String(new char[21]);
	public int g1;
	public int g2;
	public char y1;
	public char y2;
	public int g3;
	public int g;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static stu cr()
	{
		stu head;
	 stu p1;
	 stu p2;
	 int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = p2 = (stu)malloc(LEN);
	 for (i = 0;i < n;i++)
	 {
		 if (i == 0)
		 {
			 head = p1;
		 }
	  else
	  {
		  p2.next = p1;
	  }
	  p2 = p1;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  p1.name = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  p1.g1 = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  p1.g2 = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead(" ", 1);
	  if (tempVar4 != null)
	  {
		  p1.y1 = tempVar4.charAt(0);
	  }
	  String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	  if (tempVar5 != null)
	  {
		  p1.y2 = tempVar5.charAt(0);
	  }
	  String tempVar6 = ConsoleInput.scanfRead(" ");
	  if (tempVar6 != null)
	  {
		  p1.g3 = Integer.parseInt(tempVar6);
	  }
	  p1.g = (p1.g1 / 81) * ((p1.g3 + 10) / 11) * 8000 + (p1.g1 / 86) * (p1.g2 / 81) * 4000 + (p1.g1 / 91) * 2000 + (p1.g1 / 86) * (p1.y2 / 81) * 1000 + (p1.g2 / 81) * (p1.y1 / 81) * 850;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p1 = (stu)malloc(LEN);
	 }
	  p2.next = null;
	  return (head);
	}

	public static int Main()
	{
		int i;
		int max = 0;
		int sum = 0;
	 stu p;
	 stu q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	 p = q = cr();
	for (i = 0;i < n;i++)
	{
		if ((p.g) > max)
		{
			max = p.g;
		}
	 sum = sum + p.g;
	 p = p.next;
	}
	for (i = 0;i < n;i++)
	{
		if ((q.g) == max)
		{
			System.out.printf("%s\n%d\n%d\n",q.name,q.g,sum);
			break;
		}
	 q = q.next;
	}
	}

}

