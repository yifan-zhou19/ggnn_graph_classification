package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] sh = new int[100];
		int[] a = new int[26];
		int[][] b = new int[26][100];
		int max;
		int t;
		int m;
		final String ch = "";
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
				sh[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				ch = tangible.StringFunctions.changeCharacter(ch, i, tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{

			for (j = 0;j < 40;j++)
			{
				m = ch.charAt(i)[j];
				if (m > 64 && m < 91)
				{
					a[m - 65]++;
					b[m - 65][a[m - 65]] = sh[i];
				}
			}
		}
		max = 0;
		for (i = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				t = i;
			}
		}
		System.out.printf("%c\n",65 + t);
		System.out.printf("%d\n",a[t]);
		for (i = 1;i <= a[t];i++)
		{
			System.out.printf("%d\n",b[t][i]);
		}
	}
}

