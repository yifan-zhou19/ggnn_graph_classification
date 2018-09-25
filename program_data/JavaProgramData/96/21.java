package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String beichu = new String(new char[110]);
		int[] shang = new int[110];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			beichu = tempVar.charAt(0);
		}
		int sheng;
		int i;
		sheng = beichu.charAt(0) - '0';
		shang[0] = 0;
		for (i = 1;i < beichu.length();i++)
		{
			if ((sheng * 10 + beichu.charAt(i) - '0') >= 13)
			{
				shang[i] = (sheng * 10 + beichu.charAt(i) - '0') / 13;
				sheng = (sheng * 10 + beichu.charAt(i) - '0') % 13;
			}
			else
			{
				sheng = sheng * 10 + beichu.charAt(i) - '0';
				shang[i] = 0;
			}
		}
		int flag = 0;
		for (i = 0;i < beichu.length();i++)
		{
			if (shang[i] != 0)
			{
				flag = 1;
			}
			if (flag == 1)
			{
			System.out.printf("%d",shang[i]);
			}

		}
		if (flag == 0)
		{
			System.out.print("0");
		}
		System.out.printf("\n%d\n",sheng);

		return 0;
	}
}

