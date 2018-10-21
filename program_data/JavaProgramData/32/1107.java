package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int n;
		int m;
		String ss1 = new String(new char[100]);
		String ss2 = new String(new char[100]);
		int[] s1 = new int[100];
		int[] s2 = new int[100];
		int[] s3 = new int[100];
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
			ss1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			ss2 = tempVar3.charAt(0);
		}
			a = ss1.length();
			b = ss2.length();
			for (j = 0;j < 100;j++)
			{
				s1[j] = ss1.charAt(j) - 48;
				s2[j] = ss2.charAt(j) - 48;
			}
			for (j = b - 1;j >= 0;j--)
			{
				s2[j + a - b] = s2[j];
			}
			for (j = 0;j < a - b;j++)
			{
				s2[j] = 0;
			}
			for (j = a - 1;j >= 0;j--)
			{
				if (s1[j] >= s2[j])
				{
					s3[j] = s1[j] - s2[j];
				}
				else
				{
					s3[j] = 10 + s1[j] - s2[j];
					s1[j - 1] = s1[j - 1] - 1;
				}
			}
			for (j = 0;j < a;j++)
			{
				if (s3[j] != 0)
				{
				m = 1;
				}
				if (m == 1)
				{
					System.out.printf("%d",s3[j]);
				}
			}
			System.out.print("\n");
			m = 0;
		}


		return 0;
	}
}

