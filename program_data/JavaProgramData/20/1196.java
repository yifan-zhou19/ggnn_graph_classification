package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int j;
		int k;
		int n;
		int m;
		while (true)
		{
			char[] a = {'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			char[] b = {'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			char[] c = {'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			if (a[0] == '\0')
			{
				break;
			}
			n = a.length();
			for (i = 0;i < n;i++)
			{
				k = 0;
				for (j = 0;j < n;j++)
				{
					if (a[i] < a[j])
					{
						k++;
					}
				}
				if (k == 0)
				{
					m = i;
					break;
				}
			}
			for (i = 0;i < n - m;i++)
			{
				c[i] = a[i + m + 1];
				a[i + m + 1] = '\0';
			}
			a += b;
			a += c;
			if (a[0] == '0')
			{
				break;
			}
			else
			{
				System.out.printf("%s\n",a);
			}
		}
		return 0;
	}

}

