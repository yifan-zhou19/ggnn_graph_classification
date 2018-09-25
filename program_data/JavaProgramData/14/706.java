public class statistics
{
		public int num;
		public int chinese;
		public int math;
		public int sum;
}

package <missing>;

public class GlobalMembers
{
		public static statistics[] form = tangible.Arrays.initializeWithDefaultstatisticsInstances(100000);
		public static statistics temp = new statistics();
	public static int Main()
	{

		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				form[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				form[i].chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				form[i].math = Integer.parseInt(tempVar4);
			}
			form[i].sum = form[i].chinese + form[i].math;
		}
		for (i = 0;i < 3;i++)
		{
			int k = i;
			for (j = i + 1;j < n;j++)
			{
				if (form[j].sum > form[k].sum)
				{
					k = j;
				}
			}
			if (k != i)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=form[i];
				temp.copyFrom(form[i]);
				form[i] = form[k];
				form[k] = temp;

			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",form[i].num,form[i].sum);
		}
		return 0;
	}
}

