package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
		String string = new String(new char[100]);
		p = String;
		int n;
		int i;
		int legal = 1;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (count < n)
		{
			p = new Scanner(System.in).nextLine();
			i = 0;
			if (!((p >= 65 && p <= 90) || (p >= 97 && p <= 122) || (p == 95)))
			{
				legal = 0;
				System.out.print("0\n");
			}
			else
			{
				while (*(p.Substring(i)) != '\0')
				{
					if (!((*(p.Substring(i)) >= 65 && *(p.Substring(i)) <= 90) || (*(p.Substring(i)) >= 97 && *(p.Substring(i)) <= 122) || (*(p.Substring(i)) == 95) || (*(p.Substring(i)) >= 48 && *(p.Substring(i)) <= 57)))
					{
						legal = 0;
						System.out.print("0\n");
						break;
					}
					else
					{
						i++;
					}
				}
				if (legal == 1)
				{
					System.out.print("1\n");
				}
			}
			legal = 1;
			count++;
			p = String;
		}
		return 0;
	}
}

