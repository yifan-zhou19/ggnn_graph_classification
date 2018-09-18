package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] substr = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int k;
		int p;
		int j;
		for (p = 0;p < 10000;p++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				substr = tempVar2.charAt(0);
			}
			for (i = 0,k = 0;i < 9;i++)
			{
				if (str[k] < str[i + 1])
				{
					k = i + 1;
				}
			}
			for (i = k + 1,j = 3;i < 10;i++,j++)
			{
				substr[j] = str[i];
				str[i] = 0;
			}
			System.out.printf("%s\n",strcat(str,substr));
			 for (i = 0;i < 13;i++)
			 {
				 str[i] = 0;
				 substr[i] = 0;
			 }
		}
	}

}

