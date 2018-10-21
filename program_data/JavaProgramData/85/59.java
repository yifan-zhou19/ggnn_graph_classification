package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int n;
		int t;
		int flag;
		String syx = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			flag = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				syx = tempVar2.charAt(0);
			}
			t = syx.length();
			for (j = 0; j < t; j++)
			{
				if (syx.charAt(j) == 95)
				{
					continue;
				}
				else if (j == 0 && syx.charAt(j) < 65 || syx.charAt(j) > 90 && syx.charAt(j) < 94 || syx.charAt(j) > 96 && syx.charAt(j) < 97 || syx.charAt(j)>122)
				{
					flag = 0;
					break;
				}
				else if (syx.charAt(j) < 48 || syx.charAt(j)>57 && syx.charAt(j) < 65 || syx.charAt(j) > 90 && syx.charAt(j) < 97 || syx.charAt(j) > 122)
				{
					flag = 0;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}

	}
}

