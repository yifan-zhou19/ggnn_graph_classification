package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[] w1 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] w2 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i = 0;
		int n;
		int k;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w2 = tempVar2.charAt(0);
		}
		n = w1.length();
		for (i = 0;i < 50;i++)
		{
			if (n == 1)
			{
				if (w2[i] == w1[0])
				{
				  System.out.printf("%d",i);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				  goto end;
				}
			}
			else if (n >= 2)
			{
				flag = 0;
				for (k = 0;k < n;k++)
				{
					if (w1[k] != w2[k + i])
					{
						flag = 1;
						break;
					}
				}
				if (flag == 0)
				{
					System.out.printf("%d",i);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto end;
				}
			}
		}


//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	;
	}


}

