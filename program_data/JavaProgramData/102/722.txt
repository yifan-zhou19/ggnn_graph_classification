package <missing>;

public class GlobalMembers
{
	public static int[] s = new int[50];
	public static float[] l = new float[50];
	public static String str = new String(new char[10]);

	public static int Main()
	{
		//freopen("data.txt","r",stdin);
		int n;
		int i;
		int j;
		float t;
		int tp;
		int b;
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
				str = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				l[i] = Float.parseFloat(tempVar3);
			}
			if (str.charAt(0) == 'm')
			{
				s[i] = 1;
			}
			else
			{
				s[i] = 0;
			}
		}

		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (l[j] > l[j + 1])
				{
					t = l[j];
					l[j] = l[j + 1];
					l[j + 1] = t;
					tp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = tp;
				}
			}
		}

		b = 0;
		for (i = 0;i < n;i++)
		{
			if (s[i] == 1)
			{
				b++;
				System.out.printf("%.2f ",l[i]);
			}
		}

		for (i = n - 1;i >= 0;i--)
		{
			if (s[i] == 0)
			{
				System.out.printf("%.2f",l[i]);
				b++;
			}
			if (b != n && s[i] == 0)
			{
				System.out.print(" ");
			}
		}

		System.out.print("\n");

		return 0;
	}
}

