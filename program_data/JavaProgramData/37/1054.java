package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String a = new String(new char[100000]);
		String b = new String(new char[100]);
		String pa;
		String pb;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		pb = b;
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			pa = a;
			for (j = 0;j < a.length();j++)
			{
				for (k = 0;k < a.length();k++)
				{
					if (k == j)
					{
						;
					}
					else if (*(pa.Substring(j)) == *(pa.Substring(k)))
					{
						break;
					}
				}
				if (k == a.length())
				{
					*(pb.Substring(i)) = *(pa.Substring(j));
					break;
				}
			}
			if (j == a.length())
			{
				*(pb.Substring(i)) = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (*(pb.Substring(i)) == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.printf("%c\n",*(pb.Substring(i)));
			}
		}
	}
}

