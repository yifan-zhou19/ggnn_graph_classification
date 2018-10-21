package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {-2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, 0};
		int sum = 0;
		int i;
		int j;
		int s;
		int t;

//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	A:
	for (i = 0;a[i] != -1;i++)
	{
			sum = 0;
	a[0] = -2;
	a[1] = -2;
	a[2] = -2;
	a[3] = -2;
	a[4] = -2;
	a[5] = -2;
	a[6] = -2;
	a[15] = -2;
	a[7] = -2;
	a[8] = -2;
	a[9] = -2;
	a[10] = -2;
	a[11] = -2;
	a[12] = -2;
	a[13] = -2;
	a[14] = -2;
		for (s = 0;s <= 15;s++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[s] = Integer.parseInt(tempVar);
			}
			if (a[s] == 0)
			{
			   for (t = 0;t <= 15;t++)
			   {
				   for (j = 0;j <= 15;j++)
				   {
					   if (a[j] != 0 && a[t] != 0 && a[t] == a[j] * 2)
					   {
						   sum++;
					   }
				   }
			   }
			   System.out.printf("%d\n",sum);
			   break;
			}
			else if (a[s] == -1)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto A;
			}
		}

	}

		return 0;
	}
}

