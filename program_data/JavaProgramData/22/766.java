package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 1; //n??????
		int i = 1;
		int max1 = 0;
		int max2 = 0;
		int k = 0;
		int[] a = new int[999];
		char c;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}

		while (c == ',') //23????N=23
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
			n++;
			i++;
		}
		//printf("%d %c",a[1],c);   //????????

		max1 = a[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] != max1)
			{
				k = k + 1;
			}

			if (a[i] >= max1)
			{
				if (a[i] > max1)
				{
					max2 = max1;
				}
				max1 = a[i];
			}
			else
			{
				if (a[i] > max2)
				{
				max2 = a[i];
				}
			}
		}

		if (k == 0)
		{
			System.out.print("No");
		}
		else
		{
		System.out.printf("%d",max2);
		}
		return 0;
	}

}

