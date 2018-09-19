public class Student
{
	public String name = new String(new char[26]);
 public int a;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int l;
		int m;
		char j;
		char t;
		int[] b = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(999);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].name = tempVar3.charAt(0);
			}
		}
		for (j = 'A',k = 0;j <= 'Z';j++,k++)
		{
			for (i = 0;i < n;i++)
			{
				for (l = 0;l < 26;l++)
				{
					if (stu[i].name.charAt(l) == j)
					{
						b[k]++;
					}
				}
			}
		}
		for (j = 'A',k = 0,m = 0;j <= 'Z';j++,k++)
		{
			if (b[k] > m)
			{
				m = b[k];
				t = j;
			}
		}
		System.out.printf("%c\n%d",t,m);
		for (i = 0;i < n;i++)
		{
			for (l = 0;l < 26;l++)
			{
				if (stu[i].name.charAt(l) == t)
				{
					System.out.printf("\n%d",stu[i].a);
				}
			}
		}
		return 0;
	}
}

