public class number
{
//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: unsigned int shu;
	public int shu;
	public double cha;
}

package <missing>;

public class GlobalMembers
{
	public static number[] num = tangible.Arrays.initializeWithDefaultnumberInstances(300);

	public static void Main()
	{
		int n;
		int i;
		int j;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int sum=0;
		int sum = 0;
		double av;
		number t = new number();
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
				num[i].shu = Integer.parseInt(tempVar2);
			}
			sum += num[i].shu;
		}
		av = ((double)sum) / n;

		for (i = 0;i < n;i++)
		{
			if (num[i].shu > av)
			{
			num[i].cha = num[i].shu - av;
			}
			else
			{
				num[i].cha = av - num[i].shu;
			}
		}

		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (num[j].cha < num[j + 1].cha)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=num[j];
					t.copyFrom(num[j]);
					num[j] = num[j + 1];
					num[j + 1] = t;
				}
			}
		}

		System.out.printf("%d",num[0].shu);
		for (i = 1;num[i].cha == num[0].cha;i++)
		{
			System.out.printf(",%d",num[i].shu);
		}

	}
}

