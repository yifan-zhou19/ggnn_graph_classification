package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] num = new int[26];
	String sen = new String(new char[300]);
	char aa;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		sen = tempVar.charAt(0);
	}
	int i;
	int len;
	len = sen.length();
	for (i = 0;i < len;i++)
	{
		for (aa = 'a';aa <= 'z';aa++)
		{
			 if (sen.charAt(i) == aa)
			 {
				 num[aa - 97] = num[aa - 97] + 1;
			 }
		}
	}
	for (aa = 'a';aa <= 'z';aa++)
	{
		if (num[aa - 97] > 0)
		{
			 System.out.printf("%c=%d\n",aa,num[aa - 97]);
		}
	}
	if (num[0] == 0 && num[1] == 0 && num[2] == 0 && num[3] == 0)
	{
	System.out.print("No");
	}
	return 0;
	}
}

