package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m = new int[100];
		int t;
		int i;
		int j;
		char[][] str = new char[100][10];
		String s = new String(new char[10]);

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
				str[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (m[i] >= 60)
				{
					if (m[i + 1] >= 60)
					{
					  if (m[i + 1] > m[i])
					  {
						  s = str[i];
						  str[i] = str[i + 1];
						  str[i + 1] = s;
						  t = m[i];
						  m[i] = m[i + 1];
						  m[i + 1] = t;
					  }
					}
				else
				{
					s = str[i];
					str[i] = str[i + 1];
					str[i + 1] = s;
					t = m[i];
					m[i] = m[i + 1];
					m[i + 1] = t;
				}
				}
				if (m[i] < 60)
				{
					if (m[i + 1] >= 60)
					{
						s = str[i];
						str[i] = str[i + 1];
						str[i + 1] = s;
						t = m[i];
						m[i] = m[i + 1];
						m[i + 1] = t;
					}

				}
			}
		}
			for (i = 0;i < n;i++)
			{
			System.out.printf("%s\n",str[i]);
			}
	}


}

