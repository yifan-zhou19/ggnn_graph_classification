package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int cnt = 0;
		String s = new String(new char[800]);
		String temp = new String(new char[800]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		temp = new Scanner(System.in).nextLine();
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			//gets(temp);
			a[i] = s.length();
			cnt = 0;
			if ((s.charAt(0) >= '0' && s.charAt(0) <= '9'))
			{
				System.out.print("0\n");
			}
			else
			{
				for (j = 0;j < a[i];j++)
				{
					if (!((s.charAt(j) == '_') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9' && j>0)))
					{
						System.out.print("0\n");
						break;
					}
					else
					{
						cnt++;
					}
				}
			}
			if (cnt == a[i])
			{
				System.out.print("1\n");
			}
		}
		System.in.read();
		//getchar();
		return 0;
	}
}

