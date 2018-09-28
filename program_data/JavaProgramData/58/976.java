package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		int[] o = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *po;
		int po;
		char[][] m = new char[1000][81];
		String[] pm = new String[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		po = o;
		for (i = 0;i < n + 1;i++)
		{
			pm[i] = m[i];
			pm[i] = new Scanner(System.in).nextLine();
		}
		for (i = 1;i < n + 1;i++)
		{
			len = String.valueOf(pm[i]).length();
			if (pm[i] >= '0' && pm[i] <= '9')
			{
				*(po + i) = 0;
			}
			else
			{
				for (j = 0;j < len;j++)
				{
					if (*(pm[i] + j) == ' ' || *(pm[i] + j) == '.' || *(pm[i] + j) == '+' || *(pm[i] + j) == '-' || *(pm[i] + j) == '@' || *(pm[i] + j) == '=')
					{
						o[i] = 0;
						break;
					}
					else
					{
						*(po + i) = 1;
					}
				}
			}
		}
		for (i = 1;i < n + 1;i++)
		{
			System.out.printf("%d\n",*(po + i));
		}
		return 0;
	}






}

