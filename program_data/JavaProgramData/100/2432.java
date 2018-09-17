package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String zifu = new String(new char[300]);
		char c;
		int i;
		int flag = 0;
		int t;
		int[] xiaoxie = new int[26];
		int[] daxie = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zifu = tempVar.charAt(0);
		}
		for (i = 0; ;i++)
		{
			if (zifu.charAt(i) == '\0')
			{
				break;
			}
			else
			{
				if (zifu.charAt(i) >= 'a' && zifu.charAt(i) <= 'z')
				{
					flag = 1;
					t = zifu.charAt(i) - 'a';
					xiaoxie[t]++;
				}
				if (zifu.charAt(i) >= 'A' && zifu.charAt(i) <= 'Z')
				{
					flag = 1;
					t = zifu.charAt(i) - 'A';
					daxie[t]++;
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < 26;i++)
			{
				if (daxie[i] != 0)
				{
					c = 'A' + i;
					System.out.printf("%c=%d\n",c,daxie[i]);
				}
			}
			for (i = 0;i < 26;i++)
			{
				if (xiaoxie[i] != 0)
				{
					c = 'a' + i;
					System.out.printf("%c=%d\n",c,xiaoxie[i]);
				}
			}
		}
	}




}

