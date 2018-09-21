package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int len;
		int[] str = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str, 0,(Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		str[0] = 2;
		len = 1;
		for (i = 2 ;i <= k; i++)
		{
			for (j = 0 ; j < len ;j++)
			{
			str[j] = str[j] * 2;
			}
			for (j = 0 ;j < len ;j++)
			{
			if (str[j] >= 10)
			{
				  str[j] -= 10;
			  str[j + 1] += 1;
			}
			}
			 if (str[len] != 0)
			 {
			 len++;
			 }
		}

		if (k == 0)
		{
			System.out.print("1");
		}
		else
		{
		for (i = len - 1;i >= 0 ;i--)
		{
		System.out.printf("%d",str[i]);
		}
		}
	}

}

