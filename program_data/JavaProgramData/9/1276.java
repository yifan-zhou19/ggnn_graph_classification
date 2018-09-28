public class Student
{
	public String id = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static Student[] ill = tangible.Arrays.initializeWithDefaultStudentInstances(100);

	public static int Main()
	{
		int i;
		int j;
		int n;
		int q;
		String p = new String(new char[10]);
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
				ill[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				ill[i].age = Integer.parseInt(tempVar3);
			}
		}

		for (j = 0;j < n - 1;j++)
		{
			for (i = n - 1;i > j;i--)
			{
				if (ill[i].age >= 60 && ill[i].age > ill[i - 1].age)
				{
					p = ill[i].id;
					q = ill[i].age;
					ill[i].id = ill[i - 1].id;
					ill[i].age = ill[i - 1].age;
					ill[i - 1].id = p;
					ill[i - 1].age = q;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",ill[i].id);
		}
	}
}

