package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[26];
		int i;
		int n;
		int j;
		int k;
		int flag = 0;
		String s = new String(new char[200]);
		String q = new String(new char[2]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		q = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			for (k = 0;k < 26;k++)
			{
				a[k] = 0;
			}
			for (j = 0;j < s.length();j++)
			{
				if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z')
				{
					a[s.charAt(j) - 97]++;
				}
			}
			for (j = 0;j < s.length();j++)
			{
				if (a[s.charAt(j) - 97] == 1)
				{
					System.out.printf("%c\n",s.charAt(j));
					break;
				}
			}
			for (k = 0;k < 26;k++)
			{
				if (a[k] == 1)
				{
					flag++;
				}
			}
			if (flag == 0)
			{
				System.out.print("no\n");
			}
			flag = 0;
		}
	}
}

