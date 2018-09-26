package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//void bubble(int[] array, int n);
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct answer
	//	{
	//		int girl;
	//		int boy;
	//	};
		final String test = "";
		char boy;
		char girl;
		int len;
		int i;
		int j;
		int p;
		answer[] ans = {0, 0};
		answer temp = new answer();

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			test = tempVar.charAt(0);
		}
		len = test.length();
		boy = test.charAt(0);
		girl = test.charAt(len - 1);

		p = 0;
		for (i = 0;i < len;i++)
		{
			if (test.charAt(i) == girl)
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (test.charAt(j) == boy)
					{
						ans[p].boy = j;
						ans[p].girl = i;
						test = tangible.StringFunctions.changeCharacter(test, i, girl + boy);
						test = tangible.StringFunctions.changeCharacter(test, j, girl + boy);
						p++;
						break;
					}
				}
			}
		}

		for (j = 1;j <= p;j++)
		{
			for (i = 0;i < p - j;i++)
			{
				if (ans[i].girl > ans[i + 1].girl)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=ans[i];
					temp.copyFrom(ans[i]);
					ans[i] = ans[i + 1];
					ans[i + 1] = temp;
				}
			}
		}

		for (i = 0;i < p;i++)
		{
			System.out.printf("%d %d\n",ans[i].boy,ans[i].girl);
		}
	}


}

