package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[100]);
		int[] n1 = new int[100];
		int[] s = new int[100];
		int i;
		int n;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		n = str1.length();
		for (i = 0;i < n;i++)
		{
			n1[i] = str1.charAt(i) - '0';
		}
		y = n1[0];
		for (i = 1;i < n;i++)
		{
			s[i - 1] = (y * 10 + n1[i]) / 13;
			y = (y * 10 + n1[i]) % 13;
		}
		if (n == 1)
		{
			System.out.print("0\n");
		}
		else
		{
		if (s[0] == 0)
		{
			for (i = 1;i < n - 2;i++)
			{
				System.out.printf("%d",s[i]);
			}
		}
		else
		{
			for (i = 0;i < n - 2;i++)
			{
				System.out.printf("%d",s[i]);
			}
		}
		System.out.printf("%d\n",s[n - 2]);
		}
		System.out.printf("%d\n",y);
		return 0;
	}





}

