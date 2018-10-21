package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct wordName
	//	{
	//		char name[100];
	//	}
	//	*list,tmp;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		list = (wordName)malloc(sizeof(wordName) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				list[i].name = tempVar2;
			}
		}

		for (i = 0;i < n;i++)
		{
			int len = String.valueOf(list[i].name).length();
			if (list[i].name[len - 1] == 'g' && list[i].name[len - 2] == 'n' && list[i].name[len - 3] == 'i')
			{
				list[i].name[len - 3] = '\0';
			}
			else if (list[i].name[len - 1] == 'r' && list[i].name[len - 2] == 'e')
			{
				list[i].name[len - 2] = '\0';
			}
			else if (list[i].name[len - 1] == 'y' && list[i].name[len - 2] == 'l')
			{
				list[i].name[len - 2] = '\0';
			}
		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",list[i].name);
		}

	}
}

