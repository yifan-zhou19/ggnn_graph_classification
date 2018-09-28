package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String[] p;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (String)malloc(sizeof(String) * n);
		for (i = 0; i < n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String) malloc((Character.SIZE / Byte.SIZE) * 21);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0; i < n; i++)
		{
			k = 1;
			if ((p[i][0] >= 'A' && p[i][0] <= 'Z') || (p[i][0] >= 'a' && p[i][0] <= 'z') || p[i][0] == '_')
			{
				for (j = 1; j < String.valueOf(p[i]).length(); j++)
				{
					if (p[i][j] < '0' || (p[i][j] > '9' && p[i][j] < 'A') || (p[i][j] > 'Z' && p[i][j] < '_') || (p[i][j] > '_' && p[i][j] < 'a') || (p[i][j] > 'z'))
					{
						k = 0;
						break;
					}
				}
			}
			else
			{
				k = 0;
			}
			System.out.printf("%s", k == 1 ? "yes\n" : "no\n");
		}
		return 0;
	}
}

