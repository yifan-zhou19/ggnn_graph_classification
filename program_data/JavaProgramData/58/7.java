package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		String[] p = new String[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (String)malloc(80 * (Character.SIZE / Byte.SIZE));
		}
		for (i = 0;i < n;i++)
		{
			p[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			m = 0;
			if (!((p[i] == '_') || (((p[i]) >= 65) && (p[i] <= 90)) || ((p[i] >= 97) && (p[i] <= 122))))
			{
				m = 1;
			}
			else
			{
				for (j = 0;j < String.valueOf(p[i]).length();j++)
				{
					if (!((*(p[i] + j) == '_') || ((*(p[i] + j) >= 65) && (*(p[i] + j) <= 90)) || ((*(p[i] + j) >= 97) && (*(p[i] + j) <= 122)) || ((*(p[i] + j) >= 48) && (*(p[i] + j) <= 57))))
					{
						m = 1;
						break;
					}
				}
			}
			if (m == 0)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.print("0\n");
			}
		}
		return 0;
	}
}

