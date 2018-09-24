public class Student
{
	public String sex = new String(new char[10]);
	public float height;
}

package <missing>;

public class GlobalMembers
{
	public static int Compare(Object elem1, Object elem2)
	{
		return *((int)(elem1)) - (int)(elem2);
	}
	public static Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(40);
	public static int Main()
	{
		int n;
		int z;
		int k1 = 0;
		int k2 = 0;
		float[] male = new float[40];
		float[] female = new float[40];
		final String a = "male";
		final String b = "female";
		int i;
		int i1;
		int i2;
		int i3;
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
				stu[i].sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].height = Float.parseFloat(tempVar3);
			}
			z = strcmp(stu[i].sex,a);
			if (z == 0)
			{
					male[k1] = stu[i].height;
				k1++;
			}
			else
			{
					female[k2] = stu[i].height;
				k2++;
			}
		}
		qsort(male,k1,(Float.SIZE / Byte.SIZE),Compare);
		qsort(female,k2,(Float.SIZE / Byte.SIZE),Compare);
		for (i1 = 0;i1 < k1;i1++)
		{
			System.out.printf("%.2f ",male[i1]);
		}
		for (i2 = k2 - 1;i2 >= 1;i2--)
		{
			System.out.printf("%.2f ",female[i2]);
		}
		System.out.printf("%.2f",female[0]);
	}
}

