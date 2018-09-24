package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int s;
		int[] a = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;(System.in.read()) != '\n';i++)
		{
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s = Integer.parseInt(tempVar3);
			}
			a[i] = s;
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					i--;
					break;
				}
			}
		}
		System.out.printf("%d",a[0]);
		for (j = 1;j < i;j++)
		{
		System.out.printf(",%d",a[j]);
		}
		return 0;
	}

}

