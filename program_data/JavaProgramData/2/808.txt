package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max = int b[26];
		int n;
		int[] a = new int[100];
		int[] b = new int[26];
		int i;
		int j;
		int m;
		final String zuo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[][] shu =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char c;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				shu[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (tangible.StringFunctions.strChr(shu[j],zuo.charAt(i)))
				{
					b[i] = b[i] + 1;
				}
			}
		}
		m = max(b);
		for (i = 0;i < 26;i++)
		{
			if (b[i] == m)
			{
				System.out.printf("%c\n",zuo.charAt(i));
				System.out.printf("%d\n",b[i]);
				c = zuo.charAt(i);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (tangible.StringFunctions.strChr(shu[i],c))
			{
				System.out.printf("%d\n",a[i]);
			}
		}
	}
	public static int max(int[] b)
	{
		int i;
		int m = 0;
		for (i = 0;i < 26;i++)
		{
			if (m < b[i])
			{
				m = b[i];
			}
		}
		return (m);
	}
}

