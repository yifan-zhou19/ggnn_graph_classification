package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int count = 0;
		int count1 = 0;
		int m;
		int n;
		int temp;
		int inputcount = 0;
		int[] result = new int[102400];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
	while (m != 0 && n != 0)
	{
			if (m == 1)
			{
			   result[inputcount] = n;
			   inputcount++;
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   n = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   m = Integer.parseInt(tempVar4);
		   }
			   continue;
			}
		int[] monkey = new int[n];
		int[] tempmonkey = new int[n];
		for (count = 0; count < n; count++)
		{
			monkey[count] = count + 1;
		}
		while (m < n)
		{
			temp = n / m;
			for (count = temp * m;count < n;count++)
			{
				tempmonkey[count - temp * m] = monkey[count];
			}
			for (count = 0,count1 = 0;count < temp * m;count++)
			{
				if ((count + 1) % m != 0)
				{
					tempmonkey[n - temp * m + count1] = monkey[count];
					count1++;
				}
			}
			n = n - temp;
			for (count = 0;count < n;count++)
			{
				monkey[count] = tempmonkey[count];
			}
		}
		while (n > 1)
		{
			temp = (m - 1) % n + 1;
			for (count = temp;count < n;count++)
			{
			  tempmonkey[count - temp] = monkey[count];
			}
			for (count = 0;count < temp - 1;count++)
			{
			  tempmonkey[n - temp + count] = monkey[count];
			}
			n--;
			for (count = 0;count < n;count++)
			{
				monkey[count] = tempmonkey[count];
			}
		}
		result[inputcount] = monkey[0];
		inputcount++;
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			n = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			m = Integer.parseInt(tempVar6);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(monkey);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(tempmonkey);
	}
	for (count = 0; count < inputcount; count++)
	{
	  System.out.printf("%d\n",result[count]);
	}
		return 0;
	}


}

