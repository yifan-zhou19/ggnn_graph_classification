package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[503]);
		final String str2 = "";
		int[] a = new int[503];
		int[] pt1 = a;
		String pt2 = str;
		(char)(*pt3)[6] = str2;
		int i;
		int j;
		int n;
		int p;
		int flag;
		int t;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		t = str.length() - n;
		for (i = 0;i <= t;i++)
		{
			for (j = i,p = 0;j <= i + n - 1;j++)
			{
				*(*(pt3 + i) + p) = *(pt2.Substring(j));
				p++;
			}
		}
		for (i = 0;i <= t;i++)
		{
			for (j = i - 1,flag = 0;j >= 0;j--)
			{
				if (strcmp(*(pt3 + i),*(pt3 + j)) == 0)
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0 || i == 0)
			{
				for (j = i;j <= t;j++)
				{
					if (strcmp(*(pt3 + i),*(pt3 + j)) == 0)
					{
						(pt1[i])++;
					}
				}
			}
		}
		for (i = 0,k = 0;i <= t;i++)
		{
			if (pt1[i] > k)
			{
				k = pt1[i];
			}
		}
		if (k > 1)
		{
			System.out.printf("%d\n",k);
			for (i = 0;i <= t;i++)
			{
				if (pt1[i] == k)
				{
					System.out.printf("%s\n",*(pt3 + i));
				}
			}
		}
		else if (k = 1)
		{
			System.out.print("NO");
		}
		return 0;
	}

}

