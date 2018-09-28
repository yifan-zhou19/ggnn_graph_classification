package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] judge = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char a = 0;
		char b = 0;
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			judge[i] = 1;
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122) || a == '_')
			{
				judge[i] = judge[i] * 1;
			}
			else
			{
				judge[i] = judge[i] * 0;
			}
			for (j = 0;j < 90;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead(null, 1);
				if (tempVar3 != null)
				{
					b = tempVar3.charAt(0);
				}
				if (b == '\n')
				{
					break;
				}
				if (b == '_' || (b >= 48 && b <= 57) || (b >= 65 && b <= 90) || (b >= 97 && b <= 122))
				{
					judge[i] = judge[i] * 1;
				}
				else
				{
					judge[i] = judge[i] * 0;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%d\n", judge[i]);
		}
		return 0;
	}

}

