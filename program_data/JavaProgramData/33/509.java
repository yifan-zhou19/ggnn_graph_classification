package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char **oldjianji=(char**)malloc(sizeof(char*)*n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		char[] oldjianji = (String)malloc(sizeof(String) * n);
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			oldjianji[i] = (String)malloc((Character.SIZE / Byte.SIZE) * 256);
		}
		int j;
		int[] len = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				oldjianji[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(oldjianji[i]).length();
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char **jianji=(char**)malloc(sizeof(char*)*n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		char[] jianji = (String)malloc(sizeof(String) * n);
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			jianji[i] = (String)malloc((Character.SIZE / Byte.SIZE) * len[i] + 1);
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < len[i];j++)
			{
				if (oldjianji[i][j] == 'A')
				{
					jianji[i][j] = 'T';
				}
				else if (oldjianji[i][j] == 'T')
				{
					jianji[i][j] = 'A';
				}
				else if (oldjianji[i][j] == 'C')
				{
					jianji[i][j] = 'G';
				}
				else if (oldjianji[i][j] == 'G')
				{
					jianji[i][j] = 'C';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",jianji[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(jianji);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(oldjianji);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(len);
	return 0;
	}
}

