public class Student
{
	public String id = new String(new char[10]);
	public String name = new String(new char[100]);
	public char sex;
	public String year = new String(new char[10]);
	public String mark = new String(new char[10]);
	public String ad = new String(new char[20]);
}

package <missing>;

public class GlobalMembers
{
	public static Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(1000);
	public static int Main()
	{
		int i;
		int k = 0;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				stu[i].id = tempVar.charAt(0);
			}
			if (stu[i].id.charAt(0) == 'e')
			{
					break;
			}
			else
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					stu[i].name = tempVar2.charAt(0);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ", 1);
				if (tempVar3 != null)
				{
					stu[i].sex = tempVar3.charAt(0);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					stu[i].year = tempVar4.charAt(0);
				}
				String tempVar5 = ConsoleInput.scanfRead(" ");
				if (tempVar5 != null)
				{
					stu[i].mark = tempVar5.charAt(0);
				}
				String tempVar6 = ConsoleInput.scanfRead(" ");
				if (tempVar6 != null)
				{
					stu[i].ad = tempVar6.charAt(0);
				}
			k++;
			}
		}
		for (i = k - 1;i >= 0;i--)
		{
			System.out.printf("%s %s %c %s %s %s\n",stu[i].id,stu[i].name,stu[i].sex,stu[i].year,stu[i].mark,stu[i].ad);
		}
	}

}

