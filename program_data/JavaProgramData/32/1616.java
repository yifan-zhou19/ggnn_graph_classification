package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int l1;
	int l2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char **pp=(char **)malloc((2 *n)*sizeof(char *));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	char[] pp = (String)malloc((2 * n) * sizeof(String));
	for (i = 0;i < 2 * n;i++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	pp[i] = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
	}
	for (i = 0;i < 2 * n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		pp[i] = tempVar2.charAt(0);
	}
	}
	for (i = 0;i < 2 * n;i = i + 2)
	{
		l1 = String.valueOf(pp[i]).length();
		l2 = String.valueOf(pp[i + 1]).length();
		for (j = 0;j < l2;j++)
		{
			pp[i + 1][l1 - j - 1] = pp[i + 1][l2 - j - 1];
		}
		for (j = 0;j < l1 - l2;j++)
		{
			pp[i + 1][j] = '0';
		}
		for (j = l1 - 1;j > l1 - l2 - 1;j = j - 1)
		{
			if (pp[i][j] - pp[i + 1][j] < 0)
			{
				pp[i][j - 1] = pp[i][j - 1] - 1;
				pp[i][j] = '0' + pp[i][j] - pp[i + 1][j] + 10;
			}
			else
			{
				pp[i][j] = '0' + pp[i][j] - pp[i + 1][j];
			}
		}
		System.out.printf("%s\n",pp[i]);

	}
	for (i = 0;i < 2 * n;i++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(pp[i]);
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(pp);
	}
}

