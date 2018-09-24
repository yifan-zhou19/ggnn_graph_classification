package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int t;
		int n;
		int[] a = new int[100000];
		String str = new String(new char[100000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			//gets(str);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			n = str.length();
			for (j = 0;j < n;j++)
			{
				a[j] = 0;
			}
			for (j = 0;j < n;j++)
			{
			for (k = 0;k < n;k++)
			{
				if (str.charAt(j) == str.charAt(k))
				{
					a[j]++;
				}
			}
			}
			for (j = 0;j < n;j++)
			{
				if (a[j] == 1)
				{
					break;
				}
			}
			if (j == n)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.printf("%c\n",str.charAt(j));
			}
		}
		return 0;
	}



}

