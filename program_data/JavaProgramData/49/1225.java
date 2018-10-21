package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int j;
		int k;
		int m;
		int n;
		String st = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			st = tempVar.charAt(0);
		}
		for (i = 2;i <= 500;i++)
		{
			for (j = 0;j < 500 - i + 1;j++)
			{
				if (st.charAt(j) == '\0')
				{
					break;
				}
				m = j + i - 1;
				for (k = j;k < m;k++)
				{
					if (st.charAt(k) != st.charAt(m))
					{
					  break;
					}
					else
					{
				   m = m - 1;
					}
				}
			 if (k >= m)
			 {
				  for (n = j;n < j + i;n++)
				  {
					  System.out.printf("%c",st.charAt(n));
					if (n == j + i - 1)
					{
						System.out.print("\n");
					}
				  }
			 }
			}

		}
	}






}

