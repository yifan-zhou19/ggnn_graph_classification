package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[150]);
		String b = new String(new char[150]);
		int[] c = new int[150];
		int[] d = new int[150];
		int[] result = new int[150];
		int n;
		int la;
		int lb;
		int i;
		int j;
		int k;
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
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			la = a.length();
			lb = b.length();
			for (j = 0;j < la;j++)
			{
				c[j] = a.charAt(j) - '0';
			}
			for (j = 0;j < la - lb;j++)
			{
				d[j] = 0;
			}
			for (j = la - lb;j < la;j++)
			{
				d[j] = b.charAt(j - la + lb) - '0';
			}

			int carry = 0;
			for (j = la - 1;j >= 0;j--)
			{
				if (c[j] >= d[j] + carry)
				{
					result[j] = c[j] - d[j] - carry;
					carry = 0;
				}
				else
				{
					//c[j-1]=c[j-1]-1;

					result[j] = c[j] + 10 - d[j] - carry;
					carry = 1;
				}
			}
			for (j = 0;j < la;j++)
			{
				if (result[j] != 0)
				{
					break;
				}
			}
			for (k = j;k < la - 1;k++)
			{
				System.out.printf("%d",result[k]);
			}
			System.out.printf("%d\n",result[la - 1]);
		}
		return 0;
	}
}

