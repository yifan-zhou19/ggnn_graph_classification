public class stu
{
	   public String ss = new String(new char[10000]);
	   public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		stu p;
		stu p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p = (stu)malloc(len);
		p1 = null_Renamed;
		while (true)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			  p = (stu)malloc(len);
			  p.ss = new Scanner(System.in).nextLine();
			  p.next = p1;
			  p1 = p;
			  if (strcmp(p.ss,"end\0") == 0)
			  {
				  break;
			  }
		}
		p = p.next;
		while (p != null_Renamed)
		{
			  System.out.println(p.ss);
			  p = p.next;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
	}
}

