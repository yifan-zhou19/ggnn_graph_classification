package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		//char lian[100][256],hubu[100][256];
		String[] lian;
		String[] hubu;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		lian = (String)malloc(n * sizeof(String));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		hubu = (String)malloc(n * sizeof(String));
		for (i = 0; i < n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			lian[i] = (String)malloc(256 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			hubu[i] = (String)malloc(256 * (Character.SIZE / Byte.SIZE));
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				lian[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;lian[i][j] != '\0';j++)

			{
				if (lian[i][j] == 'A')
				{
					hubu[i][j] = 'T';
				}
				if (lian[i][j] == 'T')
				{
					hubu[i][j] = 'A';
				}
				if (lian[i][j] == 'G')
				{
					hubu[i][j] = 'C';
				}
				if (lian[i][j] == 'C')
				{
					hubu[i][j] = 'G';
				}
			}
			hubu[i][j] = '\0';
		}
		for (i = 0; i < n; i++)
		{
			System.out.printf("%s\n",hubu[i]);
		}
		return 0;
	}
}

