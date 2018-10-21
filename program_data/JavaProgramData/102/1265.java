package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		float[] h = new float[40];
		float k;
		char[][] s = new char[40][7];
		String x = new String(new char[7]);
		final String a = "male";
		final String b = "female";
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
				s[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (h[j] > h[j + 1])
				{
					k = h[j];
					h[j] = h[j + 1];
					h[j + 1] = k;
					x = s[j];
					s[j] = s[j + 1];
					s[j + 1] = x;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(s[i],a) == 0)
			{
				System.out.printf("%.2f",h[i]);
				t = i;
				break;
			}
		}
		for (j = t + 1;j < n;j++)
		{
			if (strcmp(s[j],a) == 0)
			{
				System.out.printf(" %.2f",h[j]);
			}
		}
		for (j = n - 1;j >= 0;j--)
		{
			if (strcmp(s[j],b) == 0)
			{
				System.out.printf(" %.2f",h[j]);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

