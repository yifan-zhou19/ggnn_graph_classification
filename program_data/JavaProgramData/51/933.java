package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[500]);
		final String b = "";
		int n;
		int i;
		int j;
		int k;
		int t;
		int p = 0;
		int[] m = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		a = new Scanner(System.in).nextLine();

		k = a.length();
		for (i = 0;i < k - n + 1;i++)
		{
			for (j = i;j < n + i;j++)
			{
				b.charAt(i)[j - i] = a.charAt(j);
			}
			b.charAt(i)[n] = '\0';
			//printf("%s\n",b[i]);
		}

		t = 0;
		for (i = 0;i < k - n + 1;i++)
		{
			if (m[i] != 1)
			{
				m[i] = 0;

				for (j = i;j < k - n + 1;j++)
				{
				   if (strcmp(b.charAt(i),b.charAt(j)) == 0)
				   {
					m[i] = m[i] + 1;
					m[j] = 1;
				   }
				}
				if (m[i] > t)
				{
					t = m[i];
				//	printf("%d %s\n",i, b[i]);
				}

				if (m[i] == 1)
				{
				p = p + 1;
				}

			}
			//printf("%d\n",m[i]);
		}

		if (p == k - n + 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",t);
			for (i = 0;i < k - n + 1;i++)
			{
				if (m[i] == t)
				{
					System.out.printf("%s\n",b.charAt(i));
				}
			}
		}
	//	printf("1");
	}
}

