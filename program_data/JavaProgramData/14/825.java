//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
public int[] ID = new int[100000];
public int[] Chinese = new int[100000];
public int[] Maths = new int[100000];
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass stu = new AnonymousClass();
	public static int Main()
	{
		int n;
		int i;
		int[] sum = new int[100000];
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		int num1;
		int num2;
		int num3;
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
			stu.ID[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			stu.Chinese[i] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			stu.Maths[i] = Integer.parseInt(tempVar4);
		}
		}
		i = 0;
		while (stu.ID[i] > 0)
		{
		sum[i] = stu.Chinese[i] + stu.Maths[i];
		i++;
		}
		i = 0;
		while (i < n)
		{
			if (sum[i] > max1)
			{
			max1 = sum[i];
			num1 = i;
			}
			i++;
		}
		i = 0;
		while (i < n)
		{
			if (sum[i] > max2 && sum[i] <= max1 != 0 && i != num1)
			{
			max2 = sum[i];
			num2 = i;
			}
		i++;
		}
		i = 0;
		while (i < n)
		{
			if (sum[i] > max3 && sum[i] <= max2 != 0 && i != num2 && i != num1)
			{
			max3 = sum[i];
			num3 = i;
			}
		i++;
		}
		System.out.printf("%d %d\n%d %d\n%d %d",stu.ID[num1],max1,stu.ID[num2],max2,stu.ID[num3],max3);
		return 0;
	}
}

