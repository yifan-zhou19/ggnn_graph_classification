package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
		int i;
		int j;
		int numb;
		int s;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		numb = 1;
		s = 0;
		b[0] = a[0];
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < numb;j++)
			{
				if (s != 0)
				{
					break;
				}
				if (a[i] == b[j])
				{
					s = s + 1;
				}
			}
			if (s == 0)
			{
				b[numb] = a[i];
				numb++;
			}
			else
			{
				s = 0;
			}
		}
		for (i = 0;i < (numb - 1);i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[numb - 1]);
	}
}

