package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] shu = new int[301];
		int aa;
		int i;
		int p;
		int j;
		int[] s = new int[301];
		int k = 1;
		char c;

		for (i = 0;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				shu[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
		 i++;
		 if (c != ',')
		 {
			 break;
		 }
		}
		if (i == 1)
		{
			System.out.print("No");
		}
		else
		{

		for (j = i;j > 1;j--)
		{
			for (p = 0;p < j - 1;p++)
			{
				if (shu[p] > shu[p + 1])
				{
				  aa = shu[p];
				shu[p] = shu[p + 1];
				shu[p + 1] = aa;
				}
			}
		}

		s[0] = shu[i - 1];

		for (p = i - 2;p >= 0;p--)
		{
			for (j = i;j > p;j--)
			{
				if (shu[p] == shu[j])
				{
			j = p;
				}
			}

			if (j != p - 1)
			{
				s[k] = shu[p];
			k++;
			}
		}

		if (s[1] == 0 && s[2] == 0)
		{
			System.out.print("No");
		}


		else
		{
			System.out.printf("%d",s[1]);
		}
		}
		return 0;
	}



}

