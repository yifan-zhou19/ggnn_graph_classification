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
		int m;
		String s = new String(new char[501]);
		char[][] str = new char[500][5];
		int[] a = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		t = s.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str,'\0',(Character.SIZE / Byte.SIZE));
		for (i = 0;i <= t - n;i++)
		{
			a[i] = 1;
		}
		for (i = 0;i <= t - n;i++)
		{
			k = 0;
			for (j = 0;j < n;j++)
			{
				str[i][k] = s.charAt(i + j);
				 k++;
			}
		}
		for (i = 0;i < t - n;i++)
		{
			for (j = i + 1;j <= t - n;j++)
			{
				if (str[i][0] != '0' && str[j][0] != '0' && strcmp(str[i],str[j]) == 0)
				{
					a[i]++;
					for (k = 0;k < n;k++)
					{
						str[j][k] = '0';
					}
				}
			}
		}
		m = a[0];
		for (i = 1;i <= t - n;i++)
		{
			if (m < a[i])
			{
				m = a[i];
			}
		}
		if (m < 2)
		{
			System.out.print("NO\n");
			return 0;
		}
		else
		{
			System.out.printf("%d\n",m);
			for (i = 0;i <= t - n;i++)
			{
				if (a[i] == m)
				{
					System.out.printf("%s\n",str[i]);
				}
			}
		}
		return 0;
	}





}

