public class children
{
	public char sex;
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String line = new String(new char[100]);
		int n;
		int m;
		int i;
		int j;
		int k;
		children[] pig = tangible.Arrays.initializeWithDefaultchildrenInstances(100);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			line = tempVar.charAt(0);
		}
		n = line.length();
		for (i = 1;i < n - 1;i++)
		{
			if (line.charAt(i) == line.charAt(0))
			{
				line = tangible.StringFunctions.changeCharacter(line, i, '(');
			}
			else
			{
				line = tangible.StringFunctions.changeCharacter(line, i, ')');
			}
		}
		line = tangible.StringFunctions.changeCharacter(line, 0, '(');
		line = tangible.StringFunctions.changeCharacter(line, n - 1, ')');
		for (i = 0;i < n;i++)
		{
			pig[i].num = i;
			pig[i].sex = line.charAt(i);
		}
		m = n;
		for (i = 0;i < (n / 2 - 1);i++)
		{
			for (j = 0;j < m;j++)
			{
				if (pig[j].sex == '(' && pig[j + 1].sex == ')')
				{
					System.out.printf("%d %d\n",pig[j].num,pig[j + 1].num);
					k = j;
					for (j;pig[m - 3].num != n - 1;j++)
					{
						pig[j] = pig[j + 2];
					}
					m -= 2;
					break;
				}
			}
		}
		System.out.printf("%d %d\n",0,n - 1);
		return 0;
	}
}

