package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int t;
		int[] a = new int[300];
		int j = 1;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		for (i = 1;;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c == 10)
			{
				break;
			}
			else
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
				j++;
			}
		}
		if (i == 1)
		{
			System.out.print("No");
		}
		else
		{
			t = a[0];
			for (i = 0;i < j;i++)
			{
				if (a[i] > t)
				{
					t = a[i];
				}
			}
			for (i = 0;i < j;i++)
			{
				if (a[i] == t)
				{
					a[i] = 0;
				}
			}
			t = a[0];
			for (i = 0;i < j;i++)
			{
				if (a[i] > t)
				{
					t = a[i];
				}
			}
			if (t == 0)
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%d",t);
			}
		}
	}

}

