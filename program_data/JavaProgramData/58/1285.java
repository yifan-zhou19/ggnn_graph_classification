package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
		int j;
		int l;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *a=(char *)malloc(sizeof(char)*81);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char a = (String)malloc((Character.SIZE / Byte.SIZE) * 81);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			s = a.length();
			l = 0;
			for (j = 0;j < s;j++)
			{
				if (j == 0)
				{
				if ((*(a + j) >= 97 && *(a + j) <= 122) || (*(a + j) >= 65 && *(a + j) <= 90) || (*(a + j) == 95))
				{
				   l++;
				}
				else
				{
					l = 0;
					break;
				}
				}
				else
				{
				if ((*(a + j) >= 97 && *(a + j) <= 122) || (*(a + j) >= 65 && *(a + j) <= 90) || (*(a + j) == 95) || (*(a + j) >= 48) && (*(a + j) <= 57))
				{
				   l++;
				}
				else
				{
					l = 0;
					break;
				}
				}
			}
			if (l == 0)
			{
				System.out.print("0\n");
			}
			else
			{
				System.out.print("1\n");
			}
		}
		return 0;
	}

}

