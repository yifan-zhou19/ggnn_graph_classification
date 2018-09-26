package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		int l;
		int i;
		int j;
		int k;
		int len;
		int flag;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		len = a.length();
		for (l = 2;l < len;l += 2)
		{
			for (i = 0;i < len;i++)
			{
				for (j = 0;j < l / 2;j++)
				{
					if (a.charAt(i + j) == a.charAt(i + l - 1 - j))
					{
						flag = 1;
					}
					else
					{
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
					for (k = i;k < i + l;k++)
					{
						System.out.printf("%c",a.charAt(k));
					}
					System.out.print("\n");
				}
			}
		}
	}






		//	abcddcbaab
}

