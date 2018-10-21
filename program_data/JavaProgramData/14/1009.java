public class student
{
	public int num;
	public int z;
}

package <missing>;

public class GlobalMembers
{
	public static student a = new student();
	public static student max1 = new student();
	public static student max2 = new student();
	public static student max3 = new student();

	public static void Main()
	{
		int i;
		int n;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		max1.z = -1;
		max2.z = -1;
		max3.z = -1;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				y = Integer.parseInt(tempVar4);
			}
			a.z = x + y;
			if (a.z > max1.z)
			{
				max3.num = max2.num;
				max3.z = max2.z;
				max2.num = max1.num;
				max2.z = max1.z;
				max1.num = a.num;
				max1.z = a.z;
			}
			else if (a.z > max2.z)
			{
				max3.num = max2.num;
				max3.z = max2.z;
				max2.num = a.num;
				max2.z = a.z;
			}
			else if (a.z > max3.z)
			{
				max3.num = a.num;
				max3.z = a.z;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",max1.num,max1.z,max2.num,max2.z,max3.num,max3.z);
	}
}

