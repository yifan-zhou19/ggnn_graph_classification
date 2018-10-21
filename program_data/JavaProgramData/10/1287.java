package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int i;
		int j;
		int t;

//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * m;
		int m;
		int[][] s;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		m = (int)malloc(k * (Integer.SIZE / Byte.SIZE));
		s = new int[k];
		for (i = 0;i < k;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			s[i] = (int)malloc((i + 1) * (Integer.SIZE / Byte.SIZE));
		}



		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = tempVar2;
			}
		}

		for (i = 0;i < k;i++)
		{
			if (m[i] >= m[k - 1])
			{
				s[k - 1][i] = 1;
			}
			else
			{
				s[k - 1][i] = 0;
			}
		}

		for (j = k - 2;j >= 0;j--)
		{
			for (i = 0;i <= j;i++)
			{
				if (m[j] > m[i])
				{
					t = 0;
					t += s[j + 1][i];
				}
				else
				{
					t = 1;
					t += s[j + 1][j];
				}
				if (t < s[j + 1][i])
				{
					t = s[j + 1][i];
				}
				s[j][i] = t;
			}
		}

		t = 0;
		for (i = 0;i < k;i++)
		{
			if (s[i][i] > t)
			{
				t = s[i][i];
			}
		}
		System.out.printf("%d",t);

	}
}

