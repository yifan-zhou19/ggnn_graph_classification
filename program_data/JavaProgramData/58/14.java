package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		String[] str = new String[100];
		String[] p;
		p = str;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			p[i] = (String)calloc(10000,(Character.SIZE / Byte.SIZE));
			p[i] = new Scanner(System.in).nextLine();
		}
		for (k = 0;k < n;k++)
		{
			if ((p[k] <= 'Z' && p[k] >= 'A') || (p[k] <= 'z' && p[k] >= 'a') || p[k] == '_')
			{
				for (i = 0; * (p[k] + i) != '\0';i++)
				{
					if ((*(p[k] + i) <= 'Z' && *(p[k] + i) >= 'A') || (*(p[k] + i) <= 'z' && *(p[k] + i) >= 'a') || (*(p[k] + i) <= '9' && *(p[k] + i) >= '0') || *(p[k] + i) == '_')
					{
						;
					}
					else
					{
						System.out.print("0\n");
						break;
					}
					if (*(p[k] + i + 1) == '\0') //????????????????????
					{
						System.out.print("1\n");
					}
				}
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}






}

