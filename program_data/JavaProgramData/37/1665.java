package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		String str = new String(new char[100000]);
		int i;
		int j;
		int t;
		int flag;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (k = 0;k < t;k++)
		{
			str = new Scanner(System.in).nextLine();
			flag = 0;
			for (i = 0;str.charAt(i);i++)
			{
				for (n = 1,j = 0;str.charAt(j);j++)
				{
					if (i != j && str.charAt(i) == str.charAt(j))
					{
						n++;
					}
					if (n > 1)
					{
						break;
					}
				}
				if (n == 1)
				{
					System.out.printf("%c\n",str.charAt(i));
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	 }
}

