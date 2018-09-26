package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[500]);
		a = new Scanner(System.in).nextLine();
		final String b = "";
		int i = 1;
		int j;
		if (n == 2)
		{
			for (j = 0;j < a.length() - 1;j++)
			{
				b.charAt(j)[0] = a.charAt(j);
				b.charAt(j)[1] = a.charAt(j + 1);
			}
			int[] c = new int[500];
			for (j = 0;j < a.length();j++)
			{
				c[j] = 1;
			}
			for (k = 0;k < a.length() - 1;k++)
			{
				for (p = k + 1;p < a.length();p++)
				{
					if (strcmp(b.charAt(k),b.charAt(p)) == 0)
					{
						c[k] = c[k] + 1;
					}
				}
			}
			int max = c[0];
			for (k = 1;k < a.length();k++)
			{
				if (c[k] > max)
				{
					max = c[k];
				}
			}
			if (max == 1)
			{
				System.out.print("NO");
			}
			else
			{
				System.out.printf("%d\n",max);
				for (j = 0;j < a.length();j++)
				{
					if (c[j] == max)
					{
						System.out.printf("%s\n",b.charAt(j));
					}
				}
			}
		}
		else if (n == 3)
		{
			for (j = 0;j < a.length() - 2;j++)
			{
				b.charAt(j)[0] = a.charAt(j);
				b.charAt(j)[1] = a.charAt(j + 1);
				b.charAt(j)[2] = a.charAt(j + 2);
			}
			int[] c = new int[500];
			for (j = 0;j < a.length() - 1;j++)
			{
				c[j] = 1;
			}
			for (k = 0;k < a.length() - 2;k++)
			{
				for (p = k + 1;p < a.length() - 1;p++)
				{
					if (strcmp(b.charAt(k),b.charAt(p)) == 0)
					{
						c[k] = c[k] + 1;
					}
				}
			}
			int max = c[0];
			for (k = 1;k < a.length() - 1;k++)
			{
				if (c[k] > max)
				{
					max = c[k];
				}
			}
			if (max == 1)
			{
				System.out.print("NO");
			}
			else
			{
			System.out.printf("%d\n",max);
			for (j = 0;j < a.length() - 1;j++)
			{
				if (c[j] == max)
				{
					System.out.printf("%s\n",b.charAt(j));
				}
			}
			}
		}
		else if (n == 4)
		{
			for (j = 0;j < a.length() - 3;j++)
			{
				b.charAt(j)[0] = a.charAt(j);
				b.charAt(j)[1] = a.charAt(j + 1);
				b.charAt(j)[2] = a.charAt(j + 2);
				b.charAt(j)[3] = a.charAt(j + 3);
			}
			int[] c = new int[500];
			for (j = 0;j < a.length() - 2;j++)
			{
				c[j] = 1;
			}
			for (k = 0;k < a.length() - 3;k++)
			{
				for (p = k + 1;p < a.length() - 2;p++)
				{
					if (strcmp(b.charAt(k),b.charAt(p)) == 0)
					{
						c[k] = c[k] + 1;
					}
				}
			}
			int max = c[0];
			for (k = 1;k < a.length() - 2;k++)
			{
				if (c[k] > max)
				{
					max = c[k];
				}
			}
			if (max == 1)
			{
				System.out.print("NO");
			}
			else
			{
			System.out.printf("%d\n",max);
			for (j = 0;j < a.length() - 1;j++)
			{
				if (c[j] == max)
				{
					System.out.printf("%s\n",b.charAt(j));
				}
			}
			}
		}



	}
}

