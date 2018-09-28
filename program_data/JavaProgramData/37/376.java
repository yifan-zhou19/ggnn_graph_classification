package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int l;
		int o;
		String s = new String(new char[100]);
		char m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (char[100])malloc((Character.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			*(s.Substring(i)) = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			o = 0;
			for (j = 0; * (*(s.Substring(i)) + j) != '\0';j++)
			{
				l = 0;
				m = (*(s.Substring(i)) + j);
				for (k = 0; * (*(s.Substring(i)) + k) != '\0';k++)
				{
					if (m != *(*(s.Substring(i)) + k) || k == j)
					{
						l = 0;
					}
					else
					{
						l = 1;
						break;
					}
				}
				if (l == 0)
				{
					System.out.printf("%c\n",m);
					o = 1;
					break;
				}
			}
			if (o == 0)
			{
				System.out.print("no\n");
			}
		}
	}

}

