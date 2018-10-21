package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int t;
		int sum = 0;
		char[][] s = new char[100][10];
		char[][] sb = new char[100][10];
		String st = new String(new char[10]);
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
				s[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a + i = tempVar3;
			}
			if (a[i] >= 60)
			{
				c[i] = 1,b[sum] = a[i],strcpy(sb[sum],s[i]),sum++;
			}
		}
		for (i = 1;i < sum;i++)
		{
			for (j = 0;j < sum - i;j++)
			{
				if (b[j] < b[j + 1])
				{
					t = b[j],b[j] = b[j + 1],b[j + 1] = t,strcpy(st,sb[j]),strcpy(sb[j],sb[j + 1]),strcpy(sb[j + 1],st);
				}
			}
		}
		for (i = 0;i < sum;i++)
		{
			System.out.printf("%s\n",sb[i]);
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] == 0)
			{
				System.out.printf("%s\n",s[i]);
			}
		}
	}

}

