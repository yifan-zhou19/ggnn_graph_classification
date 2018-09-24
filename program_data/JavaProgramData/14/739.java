public class student
{
		public int num;
		public int chinese;
		public int math;
}

package <missing>;

public class GlobalMembers
{
		public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		public static int[] sum = new int[100000];
	public static void Main(String[] args)
	{

		int a;
		int b;
		int c;
		int num1;
		int num2;
		int num3;
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
				stu[i].chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].math = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum[i] = stu[i].chinese + stu[i].math;
		}
		a = sum[0];
		num1 = 1;
		if (a < sum[1])
		{
			b = a;
			num2 = num1;
			a = sum[1];
			num1 = 2;
		}
		else
		{
			b = sum[1];
			num2 = 2;
		}
		c = 0;
		for (i = 2;i < n;i++)
		{
			if (a < sum[i])
			{
				c = b;
				num3 = num2;
				b = a;
				num2 = num1;
				a = sum[i];
				num1 = i + 1;
			}
			else
			{
				if (b < sum[i])
				{
					c = b;
					num3 = num2;
					b = sum[i];
					num2 = i + 1;
				}
				else
				{
					if (c < sum[i])
					{
						c = sum[i];
						num3 = i + 1;
					}
				}
			}
		}
		System.out.printf("%d %d\n",num1,a);
		System.out.printf("%d %d\n",num2,b);
		System.out.printf("%d %d\n",num3,c);
	}


}

