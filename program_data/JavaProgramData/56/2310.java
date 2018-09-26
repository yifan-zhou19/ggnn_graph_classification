package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] num = {'a', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = tempVar.charAt(0);
		}
		for (i = 0;i < 10;i++)
		{
						 if ((num[i] >= '0') && (num[i] <= '9') == 1)
						 {
						 sum++;
						 }
						 else
						 {
						 break;
						 }
		}
		for (i = sum - 1;i >= 0;i--)
		{
							 System.out.printf("%c",num[i]);
		}

		return 0;
	}
}

