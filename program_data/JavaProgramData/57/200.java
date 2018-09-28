package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int k;
		int len;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct string
	//	{
	//		char sen[20];
	//		int len;
	//	}
	//	str[50];

	//????//
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i].sen = tempVar2;
			}
			str[i].len = String.valueOf(str[i].sen).length();
		}


	//?????????//
		for (i = 0;i < n;i++)
		{
			k = str[i].len - 1;
			if ((str[i].sen[k] == 'r') && (str[i].sen[k - 1] == 'e'))
			{
				str[i].sen[k] = '\0';
				str[i].sen[k - 1] = '\0';
			}
			if ((str[i].sen[k] == 'y') && (str[i].sen[k - 1] == 'l'))
			{
				str[i].sen[k] = '\0';
				str[i].sen[k - 1] = '\0';
			}
			if ((str[i].sen[k] == 'g') && (str[i].sen[k - 1] == 'n') && (str[i].sen[k - 2] == 'i'))
			{
				str[i].sen[k] = '\0';
				str[i].sen[k - 1] = '\0';
				str[i].sen[k - 2] = '\0';
			}
		}

	//?????????
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",str[i].sen);
		}
	}

}

