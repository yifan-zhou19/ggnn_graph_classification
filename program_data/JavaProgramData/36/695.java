package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[] p = new int[100];
		int[] q = new int[100];
		int num = 0;
		int i;
		int j;
		int[] num1 = new int[200];
		int[] num2 = new int[200];
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		m = a.length();
		n = b.length();
		if (m != n)
		{
			System.out.print("NO\n");
		}
		else
		{
			for (i = 0;i < m;i++)
			{
				for (j = i;j < m;j++)
				{
					if (p[j] == 0 && a.charAt(j) == a.charAt(i))
					{
						num1[(int)a.charAt(i)]++;
						p[j] = 1;
					}
				}
			}
			 i = 0;
			 j = 0;
			for (i = 0;i < n;i++)
			{
				for (j = i;j < n;j++)
				{
					if (q[j] == 0 && b.charAt(j) == b.charAt(i))
					{
						num2[(int)b.charAt(i)]++;
						q[j] = 1;
					}
				}
			}
			for (i = 32;i < 123;i++)
			{
				if (num1[i] == num2[i])
				{
					num++;
				}
			}

			if (num == 91)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}

		}
	}
}

