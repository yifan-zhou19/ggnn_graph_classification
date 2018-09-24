public class student
{
	public int num;
	public float yuwen;
	public float shuxue;
	public float zongfen;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(student_num);
	public static student[] p = tangible.Arrays.initializeWithDefaultstudentInstances(3);
	public static void Main()
	{
		void paixu(struct student * a,int n);
		int i;
		int n;
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
				stu[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].yuwen = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].shuxue = Float.parseFloat(tempVar4);
			}
			stu[i].zongfen = stu[i].yuwen + stu[i].shuxue;
		}
		paixu(stu, n);
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %.0f\n",p[i].num,p[i].zongfen);
		}
	}
	public static void paixu(student a, int n)
	{
		int i;
		int j;
		float[] x = new float[3];
		for (i = 0;i < 3;i++)
		{
			for (j = 1,p[i] = a;j < n;j++)
			{
				if (p[i].zongfen < (a + j).zongfen)
				{
					p[i] = a + j;
				}
			}
			x[i] = p[i].zongfen;
			p[i].zongfen = 0F;
		}
		for (i = 0;i < 3;i++)
		{
			p[i].zongfen = x[i];
		}
	}
}

