public class student
{
	public float height;
	public String sex = new String(new char[7]);
}

package <missing>;

public class GlobalMembers
{
	public static int compInc(Object a, Object b)
	{
		return *(int)a - (int)b;
	}
	public static int Main()
	{
		int n;
		int q = 0;
		int j = 0;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(40);
		float[] girl = new float[40];
		float[] boy = new float[40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].height = Float.parseFloat(tempVar3);
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (stu[i].sex.charAt(0) == 'f')
			{
				girl[q++] = stu[i].height;
			}
			else
			{
				boy[j++] = stu[i].height;
			}
		}
		qsort(boy,j,(Float.SIZE / Byte.SIZE),compInc);
		qsort(girl,q,(Float.SIZE / Byte.SIZE),compInc);
		System.out.printf("%.2f",boy[0]);
		for (int i = 1;i < j;i++)
		{
			System.out.printf(" %.2f",boy[i]);
		}
		for (int i = q - 1;i >= 0 ;i--)
		{
			System.out.printf(" %.2f",girl[i]);
		}

	}
}

