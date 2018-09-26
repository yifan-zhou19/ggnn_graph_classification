package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int[][] cishu = new int[2][54];
			int l1;
			int l2;
			int i;
			String input1 = new String(new char[100]);
			String input2 = new String(new char[100]);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				input1 = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				input2 = tempVar2.charAt(0);
			}
			l1 = input1.length();
			l2 = input2.length();
			if (l1 != l2)
			{
					System.out.print("NO\n");
					return 0;
			}
			for (i = 0;i < l1;i++)
			{
					if (input1.charAt(i) >= 'a' && input1.charAt(i) <= 'z')
					{
							cishu[0][input1.charAt(i) - 'a']++;
					}
					else if (input1.charAt(i) >= 'A' && input1.charAt(i) <= 'Z')
					{
							cishu[0][input1.charAt(i) - 'A' + 26]++;
					}
			}
			for (i = 0;i < l2;i++)
			{
					if (input2.charAt(i) >= 'a' && input2.charAt(i) <= 'z')
					{
							cishu[1][input2.charAt(i) - 'a']++;
					}
					else if (input2.charAt(i) >= 'A' && input2.charAt(i) <= 'Z')
					{
							cishu[1][input2.charAt(i) - 'A' + 26]++;
					}
			}
			for (i = 0;i < 54;i++)
			{
					if (cishu[0][i] != cishu[1][i])
					{
							System.out.print("NO\n");
							return 0;
					}
			}
			System.out.print("YES\n");
			return 0;
	}
}

