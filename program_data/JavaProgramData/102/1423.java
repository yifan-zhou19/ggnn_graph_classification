public class student
{
	public String sex = new String(new char[10]);
	public float h;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		student[] stu1 = tangible.Arrays.initializeWithDefaultstudentInstances(40);
		student[] stu2 = tangible.Arrays.initializeWithDefaultstudentInstances(40);
		student t = new student();
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(40);
		final String str1 = "male";
		final String str2 = "female";
		int k1 = 0;
		int k2 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 0;i < n;i++)
		{
			stu[i].sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			stu[i].h = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(stu[i].sex,str1) == 0)
			{
				stu1[k1++] = stu[i];
			}
			if (strcmp(stu[i].sex,str2) == 0)
			{
				stu2[k2++] = stu[i];
			}
		}
		for (int i = 0;i < k1;i++)
		{
			for (int j = i + 1;j < k1;j++)
			{
				if (stu1[i].h > stu1[j].h)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=stu1[i];
					t.copyFrom(stu1[i]);
					stu1[i] = stu1[j];
					stu1[j] = t;
				}
			}
		}
		for (int i = 0;i < k2;i++)
		{
			for (int j = i + 1;j < k2;j++)
			{
				if (stu2[i].h < stu2[j].h)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=stu2[i];
					t.copyFrom(stu2[i]);
					stu2[i] = stu2[j];
					stu2[j] = t;
				}
			}
		}
		for (int i = 0;i < k1;i++)
		{
			System.out.printf("%.2f", stu1[i].h);
			System.out.printf("%.2f", " ");
		}
		for (int i = 0;i < k2 - 1;i++)
		{
			System.out.printf("%.2f", stu2[i].h);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", stu2[k2 - 1].h);
		System.out.printf("%.2f", "\n");
		return 0;
	}

}

