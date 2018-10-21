package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		int[] sum = new int[27];
		int m = 0;
		String zfc = new String(new char[300]);
		char k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		len = zfc.length();
		for (k = 'a';k <= 'z';k++)
		{
			for (i = 0;i < len;i++)
			{
				if (k == zfc.charAt(i))
				{
					sum[m]++;
				}
			}
		  if (sum[m] != 0)
		  {
			 System.out.printf("%c=%d\n",k,sum[m]);
		  }
		  m++;
		}
		for (i = 0;i < m - 1;i++)
		{
			if (sum[i] != 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto abc;
			}
		}
		System.out.print("No\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	abc:
	return 0;
	}

}

