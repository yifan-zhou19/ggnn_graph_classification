package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char d;
		int i;
		int len;
		int n;
		int[] c = new int[27];
		int k = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				for (j = 0;j < k;j++)
				{
					if (a.charAt(i) == b[j])
					{
						c[j]++;
						break;
					}
				}
				if (j == k)
				{
					b[k] = a.charAt(i);
					c[k]++;
					k++;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = i;j < k;j++)
			{
				if (b[i] > b[j])
				{
				d = b[j];
				b[j] = b[i];
				b[i] = d;
				n = c[j];
				c[j] = c[i];
				c[i] = n;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < k;i++)
			{
				System.out.printf("%c=%d\n",b[i],c[i]);
			}
		}
	}



}

