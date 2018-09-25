public class student
{
	public int xuehao;
	public int yuwen;
	public int shuxue;
	public int zongfen;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static void Main(String[] args)
	{
		int n;
		int i;
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
				stu[i].xuehao = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].yuwen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].shuxue = Integer.parseInt(tempVar4);
			}
			stu[i].zongfen = stu[i].yuwen + stu[i].shuxue;
		}
		int max1 = 2;
		int max2 = 1;
		int max3 = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		for (i = 0;i < n;i++)
		{
			if (stu[i].zongfen > max1)
			{
				max3 = max2;
				num3 = num2;
				max2 = max1;
				num2 = num1;
				max1 = stu[i].zongfen;
				num1 = i;
			}
			else if (stu[i].zongfen <= max1 != 0 && stu[i].zongfen> max2)
			{
				max3 = max2;
				num3 = num2;
				max2 = stu[i].zongfen;
				num2 = i;
			}
			else if (stu[i].zongfen <= max2 != 0 && stu[i].zongfen> max3)
			{
				max3 = stu[i].zongfen;
				num3 = i;
			}
		}
		System.out.printf("%d %d\n",stu[num1].xuehao,stu[num1].zongfen);
		System.out.printf("%d %d\n",stu[num2].xuehao,stu[num2].zongfen);
		System.out.printf("%d %d\n",stu[num3].xuehao,stu[num3].zongfen);
	}

}

