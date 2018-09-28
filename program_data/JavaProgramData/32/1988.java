package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
			String str1 = new String(new char[105]);
			String str2 = new String(new char[105]);
			int[] x1 = new int[105];
			int[] x2 = new int[105];
			int[] s = new int[105];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str2 = tempVar3.charAt(0);
			}
			int a;
			int b;
			a = str1.length();
			b = str2.length();
			for (j = 0;j < a;j++)
			{
			   x1[j] = str1.charAt(j) - '0';
			}
			for (j = b - 1;j >= 0;j--)
			{
			   x2[j + a - b] = str2.charAt(j) - '0';
			}
			for (j = 0;j < a - b;j++)
			{
				x2[j] = 0;
			}
			for (j = a - 1;j >= 0;j--)
			{
				if (x1[j] < x2[j])
				{
					s[j] = 10 + x1[j] - x2[j];
					x1[j - 1]--;
				}
				else
				{
					s[j] = x1[j] - x2[j];
				}
			}
			for (j = 0;j < a;j++)
			{
				System.out.printf("%d",s[j]);
			}
			System.out.print("\n");
		}
	}
}

