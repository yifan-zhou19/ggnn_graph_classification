package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int len;
		String a = new String(new char[500]);
		char[][] b = new char[500][50];
		int[] c = new int[500];
		int[] d = new int[500];
		int i;
		int j;
		int k = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		len = a.length();
		for (i = 0;i <= len - n;i++)
		{

			for (j = i;j <= i + n - 1;j++)
			{
				b[k][j - i] = a.charAt(j);

			}
			b[k][j - i] = '\0';
			//puts(b[k]);
			k++;
		}
		for (i = 0;i < k;i++)
		{
			for (j = i;j < k;j++)
			{
				if (strcmp(b[j],b[i]) == 0 && c[j] == 0)
				{
					d[i]++;
					c[j] = 1;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			if (d[i] > t)
			{
				t = d[i];
			}
		}

		if (t == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",t);

			for (i = 0;i < k;i++)
			{
			if (d[i] == t)
			{
				System.out.printf("%s\n",b[i]);
			}

			}
		}
	}
}

