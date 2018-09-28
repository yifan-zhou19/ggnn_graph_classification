package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] s = new int[max];
		int n = 0;
		int i;
		int j;
		int temp;
		char flag;
		int cida = 0;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				flag = tempVar2.charAt(0);
			}
			if (flag == ',')
			{
				n++;
				continue;
			}
			if (flag == '\n')
			{
				n++;
				break;
			}
		}

		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (s[i] < s[i + 1])
				{
					temp = s[i];
					s[i] = s[i + 1];
					s[i + 1] = temp;
				}
			}
		}

		if (n != 1)
		{
			for (i = 1;i < n;i++)
			{
				if (s[i] == s[0])
				{
					continue;
				}
				if (s[i] < s[0])
				{
					cida = s[i];
					break;
				}
			}
			if (cida == 0)
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%d",cida);
			}
		}
		else
		{
			System.out.print("No");
		}
	}
}

