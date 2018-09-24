public class Student
{
	public int num;
	public int math;
	public int chinese;
}

package <missing>;

public class GlobalMembers
{
	public static Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(100000);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] s = new int[100000];
		int[] t = new int[100000];
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= (n - 1);i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   stu[i].num = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   stu[i].chinese = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   stu[i].math = Integer.parseInt(tempVar4);
		   }
		}
		for (i = 0;i <= (n - 1);i++)
		{
			s[i] = stu[i].math + stu[i].chinese;
			t[i] = s[i];
		}
		int p;
		for (i = 0;i <= 2;i++)
		{
			for (j = 0;j <= (n - i - 2);j++)
			{
				if (s[j] >= s[j + 1])
				{
					p = s[j];
					s[j] = s[j + 1];
					s[j + 1] = p;
				}
			}
		}
		int[] d = new int[3];
		for (i = 0;i <= (n - 1);i++)
		{
			if (t[i] == s[n - 1])
			{
				System.out.printf("%d %d",stu[i].num,t[i]);
				d[c] = stu[i].num;
				System.out.print("\n");
				c = c + 1;
				if (c == 3)
				{
					break;
				}
			}
			if (c == 3)
			{
				break;
			}
		}
		for (i = 0;i <= (n - 1);i++)
		{
			if (t[i] == s[n - 2])
			{
				if (stu[i].num == d[0] || stu[i].num == d[1] || stu[i].num == d[2])
				{
					break;
				}
				System.out.printf("%d %d",stu[i].num,t[i]);
				d[c] = stu[i].num;
				System.out.print("\n");
				c = c + 1;
				if (c == 3)
				{
					break;
				}
			}
			if (c == 3)
			{
				break;
			}
		}
		for (i = 0;i <= (n - 1);i++)
		{
			if (t[i] == s[n - 3])
			{
				if (stu[i].num == d[0] || stu[i].num == d[1] || stu[i].num == d[2])
				{
					break;
				}
				System.out.printf("%d %d",stu[i].num,t[i]);
				d[c] = stu[i].num;
				System.out.print("\n");
				c = c + 1;
				if (c == 3)
				{
					break;
				}
			}
			if (c == 3)
			{
				break;
			}
		}
		return 0;
	}


}

