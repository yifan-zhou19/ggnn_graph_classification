public class record
{
	public String stuinfo = new String(new char[50]);
	public record pnext;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		record stu;
		record head;
		record ptemp;
		head = new record();
		head.pnext = null;
		ptemp = new record();
		stu = new record();
		stu.stuinfo = new Scanner(System.in).nextLine();
		while (strcmp(stu.stuinfo, "end"))
		{
			if (head.pnext == null)
			{
					head.pnext = stu;
					stu.pnext = null;
			}
			else
			{
				ptemp = head.pnext;
				head.pnext = stu;
				stu.pnext = ptemp;
			}
			stu = new record();
			stu.stuinfo = new Scanner(System.in).nextLine();
		}
		ptemp = head;
		while (ptemp.pnext != null)
		{
			ptemp = ptemp.pnext;
			System.out.printf("%s\n", ptemp.stuinfo);
		}


		return 0;
	}
}
