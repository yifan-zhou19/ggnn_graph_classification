package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	char[][] s = new char[1000][20];
	int i;
	int j;
	int len;
	int k = 0;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  s[i] = tempVar2.charAt(0);
	  }
	}
	for (i = 0;i < n;i++)
	{
		k = 0;
		len = String.valueOf(s[i]).length();
		if ((s[i][0] == '_') || ((s[i][0] >= 'A') && (s[i][0] <= 'Z')) || ((s[i][0] >= 'a') && (s[i][0] <= 'z')))
		{
			for (j = 1;j < len;j++)
			{
				if ((s[i][j] == '_') || ((s[i][j] >= 'A') && (s[i][j] <= 'Z')) || ((s[i][j] >= 'a') && (s[i][j] <= 'z')) || ((s[i][j] >= '0') && (s[i][j] <= '9')))
				{
					k++;
				}
			}
			if (k == (len - 1))
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		else
		{
			System.out.print("no\n");
		}
	}
	}


}

