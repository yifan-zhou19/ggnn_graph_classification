package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] a = new int[20];
		int[] b = new int[20];
		int i;
		int j;
		int k;
		int l;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[0] = m;
		b[0] = n;
		for (i = 1;a[i - 1] >= 2;i++)
		{
			a[i] = a[i - 1] / 2;
		}
		for (l = 1;b[l - 1] >= 2;l++)
		{
			b[l] = b[l - 1] / 2;
		}
		for (j = 0;j < i;j++)
		{
			for (k = 0;k < l;k++)
			{
			if (a[j] == b[k])
			{
				System.out.printf("%d",a[j]);
				num++;
			break;
			}
			}
		 if (num != 0)
		 {
			 break;
		 }
		}
		return 0;
	}









}

