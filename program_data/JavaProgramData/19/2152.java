package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zong = new String(new char[2000]); //????
		String x = new String(new char[200]); //???????
		String y = new String(new char[200]);
		char[][] words = new char[200][20];
		int i;
		int j = 0;
		int p = 0;
		int len;
		zong = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = tempVar2.charAt(0);
		}
		len = zong.length();
		for (i = 0;i < len;i++)
		{
			if (zong.charAt(i) != ' ')
			{
				words[j][p] = zong.charAt(i);
				p++;
			}
			else
			{
				words[j][p] = 0;
				j++;
				p = 0;
			}
		}
		words[j][p] = 0;
		for (i = 0;i < j;i++)
		{
			if (strcmp(words[i],x) == 0)
			{
				System.out.printf("%s ",y);
			}
			else
			{
				System.out.printf("%s ",words[i]);
			}
		}
		if (strcmp(words[j],x) == 0)
		{
				System.out.printf("%s\n",y);
		}
		else
		{
				System.out.printf("%s\n",words[i]);
		}
		return 0;


	}
}

