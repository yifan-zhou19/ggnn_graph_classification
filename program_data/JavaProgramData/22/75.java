package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int j;
		int temp;
		int k = 0;
		String b = new String(new char[300]);
		i = 0;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar2);
			}
			n = i + 1;
			if (b.charAt(i) != '\n')
			{
				continue;
			}
			else
			{
				break;
			}
		}
		if (n == 0)
		{
			System.out.print("No\n");
		}
		if (n > 0)
		{
			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < n - i - 1;j++)
				{
					if (a[j] > a[j + 1])
					{
						temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
				}
			}

			temp = a[n - 1];
			if (a[0] == temp)
			{
				System.out.print("No\n");
			}
			else
			{
			for (i = n - 1;i >= 0;i--)
			{
				if (a[i] != temp)
				{
					k = i;
					break;
				}
			}
			System.out.printf("%d\n",a[k]);
			}
		}
	}
}

