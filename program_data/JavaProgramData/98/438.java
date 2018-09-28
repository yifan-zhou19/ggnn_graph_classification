package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l = 0;
		int i;
		int[] a = new int[1000];
		char[][] s = new char[1000][100];
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
		}
		for (i = 0;i < n;i++)
		{
			a[i] = String.valueOf(s[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s",s[i]);
			   l += a[i] + 1;
			if (i != n - 1 && l + a[i + 1] <= 80)
			{
				System.out.print(" ");
			}
			else
			{
				l = 0;
				System.out.print("\n");
			}
		}
		 return 0;
	}




}

