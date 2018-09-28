package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int count = 0;
		String a = new String(new char[100000]);
		int[] b = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (k = 0;k < t;k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,'\0',100000);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,400000);
			count = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (i = 0;a.charAt(i);i++) //???????????
			{
			for (j = 0;j <= i;j++)
			{
				if (a.charAt(i) == a.charAt(j))
				{
					b[j]++;
					break;
				}
			}
			}
			for (i = 0;a.charAt(i);i++)
			{
			if (b[i] == 1)
			{
				System.out.printf("%c\n",a.charAt(i));
				count++;
				break;
			}
			}
			if (count == 0)
			{
				System.out.print("no\n");
			}

		}

		 return 0;
	}
}

