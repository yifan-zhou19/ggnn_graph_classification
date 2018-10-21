package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int len;
		int max;
		int[] m = new int[600];
		String s = new String(new char[600]);
		char[][] w = new char[600][5];
		int flag;
		String ss = new String(new char[5]);

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		len = s.length();
		i = 0;
		t = 0;

		while (i < len - n + 1)
		{
			flag = -1;
			for (j = i;j < i + n;j++)
			{
			  ss = tangible.StringFunctions.changeCharacter(ss, j - i, s.charAt(j));
			}
			ss = ss.substring(0, n);
			for (j = 0;j < t;j++)
			{
			   if (strcmp(w[j],ss) == 0)
			   {
				 flag = j;
				 break;
			   }
			}
			if (flag != -1)
			{
			  m[flag]++;
			  i++;
			  continue;
			}
			w[t] = ss;
			t++;
			m[t - 1]++;
			i++;
		}

		max = 0;
		for (i = 0;i < t;i++)
		{
			if (m[i] > max)
			{
			  max = m[i];
			}
		}
		if (max <= 1)
		{
		  System.out.print("NO");
		}
		else
		{
			int flag = 1;
			System.out.printf("%d\n",max);
			for (i = 0;i < t;i++)
			{
				if (m[i] == max)
				{
					if (flag == 0)
					{
					  System.out.print("\n");
					}
					System.out.printf("%s",w[i]);
					if (flag != 0)
					{
					  flag = 0;
					}
				}
			}
		}
		return 0;

	}


}

