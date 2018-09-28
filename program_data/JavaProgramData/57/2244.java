package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct zfc
	//	{
	//		char zifu[20];
	//	};
		zfc[] line = tangible.Arrays.initializeWithDefaultzfcInstances(50);
		int i;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				line[i].zifu = tempVar2;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			len = String.valueOf(line[i].zifu).length();
			if (line[i].zifu[len - 1] == 'r' && line[i].zifu[len - 2] == 'e')
			{
				line[i].zifu[len - 1] = '\0';
				line[i].zifu[len - 2] = '\0';
			System.out.printf("%s\n",line[i].zifu);
			}

			else if (line[i].zifu[len - 1] == 'y' && line[i].zifu[len - 2] == 'l')
			{
			line[i].zifu[len - 1] = '\0';
			line[i].zifu[len - 2] = '\0';
			System.out.printf("%s\n",line[i].zifu);
			}
			else if (line[i].zifu[len - 1] == 'g' && line[i].zifu[len - 2] == 'n' && line[i].zifu[len - 3] == 'i')
			{
				line[i].zifu[len - 1] = '\0';
				line[i].zifu[len - 2] = '\0';
				line[i].zifu[len - 3] = '\0';
				System.out.printf("%s\n",line[i].zifu);

			}
			else
			{
				System.out.printf("%s",line[i].zifu);
			}
		}
		return 0;
	}

}

