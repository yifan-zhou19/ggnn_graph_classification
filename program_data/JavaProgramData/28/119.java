package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		int len;
		String a = new String(new char[100]);
		int flag = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = tempVar.charAt(0);
			}
			len = a.length();
			if (flag == 0)
			{
				flag = 1;
				System.out.printf("%d",len);
			}
			else if (flag == 1)
			{
				System.out.printf(",%d",len);
			}
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
		}
	}

}

