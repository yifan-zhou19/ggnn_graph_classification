package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[N]);
		int max;
		int num;
		int cmp = new int(char * x,char * y,int z);

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

		for (i = 0,max = 0; a.charAt(i + n - 1) != '\0'; i++)
		{
			for (j = i,num = 0; a.charAt(j + n - 1) != '\0'; j++)
			{
				if (cmp(a.charAt(i), a.charAt(j), n) == 1)
				{
					num++;
				}
			}
			if (num > max)
			{
				max = num;
			}
		}

		if (max == 1)
		{
			System.out.print("NO\n");
		}

		else
		{
			System.out.printf("%d\n",max);

			for (i = 0; a.charAt(i + n - 1) != '\0'; i++)
			{
				for (j = i,num = 0; a.charAt(j + n - 1) != '\0'; j++)
				{
					if (cmp(a.charAt(i), a.charAt(j), n) == 1)
					{
						num++;
					}
				}
				if (num == max)
				{
					for (j = 0; j < n; j++)
					{
						System.out.printf("%c",a.charAt(i + j));
					}
					System.out.print("\n");
				}
			}
		}

		return 0;
	}


	public static int cmp(tangible.RefObject<String> x, tangible.RefObject<String> y, int z)
	{
		int i;

		for (i = 0; i < z; i++)
		{
			if (*(x.argValue.Substring(i)) != *(y.argValue.Substring(i)))
			{
				return 0;
			}
		}
		if (i == z)
		{
			return 1;
		}
	}
}

