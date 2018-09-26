package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int j;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String[] pp;
		String[] qq;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		pp = (String)malloc(a * sizeof(String));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qq = (String)malloc(a * sizeof(String));
		for (i = 0;i < a;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			pp[i] = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			qq[i] = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pp[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				qq[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < a;i++)
		{
			m = String.valueOf(pp[i]).length();
			n = String.valueOf(qq[i]).length();
			for (j = m - 1;j >= m - n;j--)
			{
				if (pp[i][j] < qq[i][n - m + j])
				{
					pp[i][j] = 10 + pp[i][j] - qq[i][n - m + j] + '0';
					pp[i][j - 1]--;
				}
				else if (pp[i][j] >= qq[i][n - m + j])
				{
					pp[i][j] = pp[i][j] - qq[i][n - m + j] + '0';
				}
			}
			for (j = m - 1;j >= 0;j--)
			{
				if (pp[i][j] < '0')
				{
					pp[i][j] += 10;
					pp[i][j - 1] -= 1;
				}
			}
			System.out.printf("%s\n",pp[i]);
		}
	}
}

