package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int len;
		int max = 0;
		int max1 = 0;
		int i;
		int j;
		int k;
		int l;
		String c = new String(new char[301]);
		for (i = 1;i < 301;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar2);
			}
			if (c.charAt(i) != ',')
			{
			len = i;
			break;
			}

		}
		for (j = 1;j <= len;j++)
		{
			if (a[j] >= max)
			{
				max = a[j];
			}
		}
		for (k = 1;k <= len;k++)
		{
			if (a[k] == max)
			{
				a[k] = 0;
			}
		}
		for (l = 1;l <= len;l++)
		{
			if (a[l] >= max1)
			{
				max1 = a[l];
			}
		}
			 if (max1 == 0)
			 {
			System.out.print("No\n");
			 }
	else
	{
		System.out.printf("%d\n",max1);
	}
		return 0;
	}

}

