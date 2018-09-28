package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int m;
		int len;
		int i;
		int temp;
		int temp1;
		int wz;
		int counts = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			len = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < len;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		temp = a[0];
		for (i = 0;counts <= len;i = i + m)
		{

			wz = i + m;
			if (wz > len - 1)
			{
				wz = wz - len;
				i = wz - m;
			}
			temp1 = a[wz];
			a[wz] = temp;
			temp = temp1;
			counts++;
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < len;i++)
		{
			System.out.printf(" %d",a[i]);
		}
		return 0;
	}

}

