public class student
{
	public String name = new String(new char[20]);
	public int pingjun;
	public int pingyi;
	public String bgb = new String(new char[3]);
	public String xb = new String(new char[3]);
	public int lunwen;
	public int qian;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student[] stu =
		{
			{"\0"}
		};
		student total = new student("\0");
		student temp = new student("\0");
		 int n;
		 int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].pingjun = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].pingyi = Integer.parseInt(tempVar4);
			}
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					stu[i].bgb = tempVar5.charAt(0);
				}
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					stu[i].xb = tempVar6.charAt(0);
				}
				String tempVar7 = ConsoleInput.scanfRead();
				if (tempVar7 != null)
				{
					stu[i].lunwen = Integer.parseInt(tempVar7);
				}

			if (stu[i].pingjun > 80 && stu[i].lunwen >= 1)
			{
				stu[i].qian = stu[i].qian + 8000;
			}

			if (stu[i].pingjun > 85 && stu[i].pingyi > 80)
			{
				stu[i].qian = stu[i].qian + 4000;
			}

			if (stu[i].pingjun > 90)
			{
				stu[i].qian = stu[i].qian + 2000;
			}

			if (stu[i].pingjun > 85 && stu[i].xb.charAt(0) == 'Y')
			{
				stu[i].qian = stu[i].qian + 1000;
			}

			if (stu[i].pingyi > 80 && stu[i].bgb.charAt(0) == 'Y')
			{
			   stu[i].qian = stu[i].qian + 850;
			}
			total.qian = total.qian + stu[i].qian;

		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].qian > temp.qian)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[i];
				temp.copyFrom(stu[i]);
			}
		}

			System.out.printf("%s\n%d\n%d\n",temp.name,temp.qian,total.qian);
			return 0;
	}



}

