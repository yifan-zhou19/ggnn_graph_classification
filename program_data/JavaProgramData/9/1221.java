package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char **id=(char**)malloc(sizeof(char*)*n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		char[] id = (String)malloc(sizeof(String) * n);
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			id[i] = (String)malloc((Character.SIZE / Byte.SIZE) * 10);
		}
		int p = 0;
		int[] year = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				year[i] = Integer.parseInt(tempVar3);
			}
			if (year[i] >= 60)
			{
				p++;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char **idolder=(char**)malloc(sizeof(char*)*p);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		char[] idolder = (String)malloc(sizeof(String) * p);
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			idolder[i] = (String)malloc((Character.SIZE / Byte.SIZE) * 10);
		}
		int[] yearolder = new int[p];
		for (i = 0;i < n;i++)
		{
			if (year[i] >= 60)
			{
				idolder[j] = id[i];
				yearolder[j] = year[i];
				j++;
			}
		}
		int e;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *id1=(char*)malloc(sizeof(char)*10);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char id1 = (String)malloc((Character.SIZE / Byte.SIZE) * 10);
		for (i = 1;i <= p;i++)
		{
			for (j = 0;j < p - i;j++)
			{
				if (yearolder[j + 1] > yearolder[j])
				{
					id1 = idolder[j];
					idolder[j] = idolder[j + 1];
					idolder[j + 1] = id1;
					e = yearolder[j];
					yearolder[j] = yearolder[j + 1];
					yearolder[j + 1] = e;
				}
			}
		}
		for (i = 0;i < p;i++)
		{
			System.out.printf("%s\n",idolder[i]);
		}
		for (i = 0;i < n;i++)
		{
			if (year[i] < 60)
			{
				System.out.printf("%s\n",id[i]);
			}
		}

	return 0;
	}
}

