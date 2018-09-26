package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		String bsf = new String(new char[21]);
		int len;
		int[] sz = new int[100];

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
				bsf = tempVar2.charAt(0);
			}
			len = bsf.length();
			for (k = 0;k < len;k++)
			{
				if ((bsf.charAt(0) < 'A') || (bsf.charAt(0)>'Z' && bsf.charAt(0) != '_' && bsf.charAt(0) < 'a') || (bsf.charAt(0)>'z'))
				{
					sz[i] = 0;
					break;
				}
				if ((bsf.charAt(k) < '0') || (bsf.charAt(k)>'9' && bsf.charAt(k) < 'A') || (bsf.charAt(k)>'Z' && bsf.charAt(k) != '_' && bsf.charAt(k) < 'a') || (bsf.charAt(k)>'z'))
				{
					sz[i] = 0;
					break;
				}
				if (k == len - 1)
				{
					sz[i] = 1;
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}


		return 0;
	}
}

