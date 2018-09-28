package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String sz = new String(new char[100]);
		int[] jg = new int[100];
		int i;
		int j;
		int len;
		int e;
		for (j = 0;j < n;j++)
		{
			e = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz = tempVar2.charAt(0);
			}
			len = sz.length();
			if (sz.charAt(0) >= 'a' && sz.charAt(0) <= 'z')
			{
				e++;
			}
			if (sz.charAt(0) >= 'A' && sz.charAt(0) <= 'Z')
			{
				e++;
			}
			if (sz.charAt(0) == '_')
			{
				e++;
			}
			for (i = 1;i < len;i++)
			{
				if (sz.charAt(i) >= 'a' && sz.charAt(i) <= 'z')
				{
				   e++;
				}
				if (sz.charAt(i) >= 'A' && sz.charAt(i) <= 'Z')
				{
				   e++;
				}
				if (sz.charAt(i) == '_')
				{
				   e++;
				}
				if (sz.charAt(i) >= '0' && sz.charAt(i) <= '9')
				{
				   e++;
				}
			}
			if (e == len)
			{
				jg[j] = 1;
			}
			else
			{
				jg[j] = 0;
			}

		}

		for (i = 0;i < n;i++)
		{
			if (jg[i] == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

